package zad1;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class EmployeeSalary {
	
	private final String path = "src\\resources\\"; 
	private String filename;
	
	
	
	public EmployeeSalary(String filename) {
		this.filename = filename;
	}
	
	public double getAvgSalary() {
		double avg = 0.0;
		try {
			File f = new File(this.path + this.filename);
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			double sum = 0.0;
			Document doc = db.parse(f);
			
			doc.getDocumentElement().normalize();
			
			NodeList nList = doc.getElementsByTagName("staff");
			
			for(int i = 0; i < nList.getLength(); i++) {
				Node n = nList.item(i);
				if(n.getNodeType() == Node.ELEMENT_NODE) {
					Element e = (Element) n;
					sum += Double.parseDouble( e.getElementsByTagName("salary").item(0).getTextContent() );
				}
			}
			avg = sum / nList.getLength();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return avg;
	}
}
