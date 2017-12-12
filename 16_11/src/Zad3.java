/* Napisz funkcj�, w kt�rej dla zadanego �a�cucha znak�w, 
 * wszystkie znaki - takie same jak pierwsza litera ci�gu 
 * znak�w zostan� zamienione na znak '_', wyj�tkiem jednak 
 * jest pierwszy znak. Dla przyk�adu:  
 * Wej�cie: oksymoron  
 * Wyj�cie: oksym_r_n 
 */
public class Zad3 {
	public String replaceCharacter(String s) {
		String firstLetter = s.substring(0, 1);
		return firstLetter + s.replace(firstLetter, "_").substring(1);
	}
}
