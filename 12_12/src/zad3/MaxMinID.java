package zad3;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class MaxMinID {
	private final String path = "src\\resources\\";
	private String filename;
	
	public MaxMinID(String filename) {
		this.filename = filename;
	}
	
	public void getMinMaxStaffID() {
		Integer min = null, max = null;
		try {
			File f = new File(this.path + this.filename);
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document doc = db.parse(f);
			
			doc.getDocumentElement().normalize();
			
			NodeList nList = doc.getElementsByTagName("staff");
			
			for(int i = 0; i < nList.getLength(); i++) {
				Node n = nList.item(i);
				if(n.getNodeType() == Node.ELEMENT_NODE) {
					Element e = (Element) n;
					if(min == null || min > Integer.parseInt(e.getAttribute("id"))) {
						min = Integer.parseInt(e.getAttribute("id"));
					}
					
					if(max == null || max < Integer.parseInt(e.getAttribute("id"))) {
						max = Integer.parseInt(e.getAttribute("id"));
					}
				}
			}
			System.out.println("min: " + min + "\nmax: " + max);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
