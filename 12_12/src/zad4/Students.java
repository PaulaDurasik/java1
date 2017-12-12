package zad4;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class Students {
	private final String filename = "src\\resources\\students.xml";
	
	public void saveStudentAsXML() {
		try {
			DocumentBuilderFactory dbF = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = dbF.newDocumentBuilder();
			
			Document doc = docBuilder.newDocument();
			Element rootElem = doc.createElement("root");
			Element students = doc.createElement("students");
			
			rootElem.appendChild(students);
			doc.appendChild(rootElem);
			
			doc = this.addStudent("John", "Simple", 3, doc);
			doc = this.addStudent("Jane", "Doe", 1, doc);
			
			TransformerFactory tf = TransformerFactory.newInstance();
			Transformer t = tf.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult sr = new StreamResult(new File(this.filename));
			
			t.transform(source, sr);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private Document addStudent(String name, String lastname, int year, Document doc) {
		Element eStudent = doc.createElement("student"),
				eName = doc.createElement("name"),
				eLastname = doc.createElement("lastname"),
				eYear = doc.createElement("year");
		eYear.appendChild(doc.createTextNode(year + ""));
		eLastname.appendChild(doc.createTextNode(lastname));
		eName.appendChild(doc.createTextNode(name));
		
		eStudent.appendChild(eName);
		eStudent.appendChild(eLastname);
		eStudent.appendChild(eYear);
		doc.getElementsByTagName("students").item(0).appendChild(eStudent);
		return doc;
	}
}
