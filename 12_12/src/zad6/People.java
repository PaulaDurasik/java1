package zad6;

import java.io.File;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class People {
	private final String filename = "src\\resources\\people.xml";
	
	public void savePeople(ArrayList<Person> people) {
		try {
			DocumentBuilderFactory dbF = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = dbF.newDocumentBuilder();
			
			Document doc = docBuilder.newDocument();
			Element rootElem = doc.createElement("people");
			doc.appendChild(rootElem);
			
			for(Person person: people) {
				doc = this.addPerson(person, doc);
			}
			
			TransformerFactory tf = TransformerFactory.newInstance();
			Transformer t = tf.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult sr = new StreamResult(new File(this.filename));
			
			t.transform(source, sr);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private Document addPerson(Person p, Document doc) {
		Element ePerson = doc.createElement("person"), 
				eName = doc.createElement("name"),
				eLastname = doc.createElement("lastname"),
				eCompany = doc.createElement("company"),
				eSalary = doc.createElement("salary"),
				eDepartment = doc.createElement("department"),
				eYearOfBorn = doc.createElement("yearofborn");
		
		eName.appendChild(doc.createTextNode(p.getName()));
		eLastname.appendChild(doc.createTextNode(p.getLastname()));
		eCompany.appendChild(doc.createTextNode(p.getCompany()));
		/* metoda p.getSalary() zwraca dane typu double, zaœ metoda
		 * createTextNode przyjmuje jako argument typ String. 
		 * Abyœmy z typu prostego zrobili Stringa, naj³atwiej dokonaæ 
		 * konkatenacji z pustym ci¹giem znaków */
		eSalary.appendChild(doc.createTextNode(p.getSalary() + ""));
		eDepartment.appendChild(doc.createTextNode(p.getDepartment()));
		eYearOfBorn.appendChild(doc.createTextNode(p.getYearOfBorn() + ""));
		
		ePerson.appendChild(eName);
		ePerson.appendChild(eLastname);
		ePerson.appendChild(eCompany);
		ePerson.appendChild(eSalary);
		ePerson.appendChild(eDepartment);
		ePerson.appendChild(eYearOfBorn);

		doc.getElementsByTagName("people").item(0).appendChild(ePerson);
		return doc;
	}
}
