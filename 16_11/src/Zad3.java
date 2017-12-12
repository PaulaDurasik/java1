/* Napisz funkcjê, w której dla zadanego ³añcucha znaków, 
 * wszystkie znaki - takie same jak pierwsza litera ci¹gu 
 * znaków zostan¹ zamienione na znak '_', wyj¹tkiem jednak 
 * jest pierwszy znak. Dla przyk³adu:  
 * Wejœcie: oksymoron  
 * Wyjœcie: oksym_r_n 
 */
public class Zad3 {
	public String replaceCharacter(String s) {
		String firstLetter = s.substring(0, 1);
		return firstLetter + s.replace(firstLetter, "_").substring(1);
	}
}
