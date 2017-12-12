package zad7;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Helper {
	
	public static ArrayList<Integer> generateListOfIntegers(int startR, int stopR, int nums) {
		Random r = new Random();
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < nums; i++) {
			list.add(new Integer(r.nextInt(stopR - startR) + startR));
		}
		return list;
	}
	
	public static void saveXMLFile(String filename, ArrayList<Integer> list) {
		try {
			DocumentBuilderFactory dbF = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = dbF.newDocumentBuilder();
			
			Document doc = docBuilder.newDocument();
			Element rootElem = doc.createElement("root");
			doc.appendChild(rootElem);
			Element values = doc.createElement("values");
			
			for(Integer i: list) {
				values.appendChild(doc.createElement("val")).appendChild(doc.createTextNode(i.toString()));
			}
			
			rootElem.appendChild(values);
			TransformerFactory tf = TransformerFactory.newInstance();
			Transformer t = tf.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult sr = new StreamResult(new File("src\\resources\\" + filename));
			
			t.transform(source, sr);
		} catch(Exception e) {
			e.printStackTrace();
		}
	} 
	
	public static double[] readDoublesFromXML(String filename) {
		double[] list = null;
		int j = 0;
		try {
			File f = new File("src\\resources\\" + filename);
			DocumentBuilderFactory dbF = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbF.newDocumentBuilder();
			Document doc = db.parse(f);
			
			doc.getDocumentElement().normalize();
			
			NodeList nList = doc.getElementsByTagName("val");
			list = new double[nList.getLength()];
			for(int i = 0; i < nList.getLength(); i++) {
				Node n = nList.item(i);
				if(n.getNodeType() == Node.ELEMENT_NODE) {
					Element e = (Element) n;
					list[j] = Integer.parseInt(e.getTextContent());
					j++;
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		return Arrays.copyOfRange(list, 0, j);
	}
}
