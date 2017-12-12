package zad5;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class Companies {
	private final String filename = "src\\resources\\companies.xml";
	
	public void saveCompaniesAsXML() {
		try {
			DocumentBuilderFactory dbF = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = dbF.newDocumentBuilder();
			
			Document doc = docBuilder.newDocument();
			Element rootElem = doc.createElement("root");
			
			doc.appendChild(rootElem);
			
			doc = this.addCompany("Testowa", 2008, 345, 23, doc);
			doc = this.addCompany("Testowa 2", 1979, 34345, 40, doc);
			doc = this.addCompany("Testowa 3", 1999, 5, 8, doc);

			
			TransformerFactory tf = TransformerFactory.newInstance();
			Transformer t = tf.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult sr = new StreamResult(new File(this.filename));
			
			t.transform(source, sr);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private Document addCompany(String name, int starts, int employees, int vat, Document doc) {
		Element eCompany = doc.createElement("company"),
				eStarts = doc.createElement("starts"),
				eEmployees = doc.createElement("employees"),
				eVat = doc.createElement("vat");
		eStarts.appendChild(doc.createTextNode(starts + ""));
		eEmployees.appendChild(doc.createTextNode(employees + ""));
		eVat.appendChild(doc.createTextNode(vat + ""));
		
		
		eCompany.appendChild(eStarts);
		eCompany.appendChild(eEmployees);
		eCompany.appendChild(eVat);
		eCompany.setAttribute("name", name);
		doc.getElementsByTagName("root").item(0).appendChild(eCompany);
		return doc;
	}
}
