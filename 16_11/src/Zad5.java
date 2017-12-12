/* Napisz funkcjê, która zamienia dla zadanego 
 * ci¹gu znaków pierwszy znak z ostatnim */
public class Zad5 {
	public String changeCharacters(String arg) {
		return arg.substring(arg.length() - 1) + arg.substring(1, arg.length() - 1) + arg.substring(0, 1);
	}
}
