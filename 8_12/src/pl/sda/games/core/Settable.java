package pl.sda.games.core;

import java.util.HashMap;

public interface Settable {
	public HashMap<String, String> getConfig();
	public void setConfig(HashMap<String, String> config);
	public void addOrUpdateKey(String key, String value);
	public void removeKey(String key);
}
