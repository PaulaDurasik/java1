/* Napisz funkcj�, kt�ra zamienia dla zadanego 
 * ci�gu znak�w pierwszy znak z ostatnim */
public class Zad5 {
	public String changeCharacters(String arg) {
		return arg.substring(arg.length() - 1) + arg.substring(1, arg.length() - 1) + arg.substring(0, 1);
	}
}
