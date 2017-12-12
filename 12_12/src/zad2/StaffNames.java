package zad2;

import java.io.File;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class StaffNames {
	
	private final String filename = "src\\resources\\staff.xml";
	
	public ArrayList<String> getNames() {
		ArrayList<String> staff = new ArrayList<>();
		try {
			File f = new File(this.filename);
			DocumentBuilderFactory dbF = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbF.newDocumentBuilder();
			Document doc = db.parse(f);
			
			doc.getDocumentElement().normalize();
			
			NodeList nList = doc.getElementsByTagName("staff");
			
			for(int i = 0; i < nList.getLength(); i++) {
				Node n = nList.item(i);
				if(n.getNodeType() == Node.ELEMENT_NODE) {
					Element e = (Element) n;
					
					staff.add(e.getElementsByTagName("firstname").item(0).getTextContent() + " " + e.getElementsByTagName("lastname").item(0).getTextContent());
					
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		return staff;
	} 
}
