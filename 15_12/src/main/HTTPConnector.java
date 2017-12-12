package main;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Set;
/* https://randomuser.me/api/?nat=US */
public class HTTPConnector {
	private String url;
	private URL obj;
	private HttpURLConnection con;
	private String ua;
	
	public HTTPConnector() {
		
	}
	
	private void sendPOST(String params) {}
	
	private void sendGET(String params) {}
	
	public void send(String type, HashMap<String, String> params) {
		if(type.equalsIgnoreCase("GET")) {
			this.sendGET("");
		} else if(type.equalsIgnoreCase("POST")) {
			this.sendPOST("");
		}
		
	}
	
	public String convertMapToString(HashMap<String, String> params) {
		String tmp = "";
		Set<String> s = params.keySet();
		for(String key: s) {
			if(tmp.equals("")) {
				tmp += key + "=" + params.get(key);
			} else {
				tmp += "&" + key + "=" + params.get(key);
			}
			
			
			if(!tmp.equals("")) {
				tmp += "&";
			}
			tmp += key + "=" + params.get(key);
		}
		return tmp;
	}
}
