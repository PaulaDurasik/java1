/* Mamy dwie tablice liczb ca³kowitych, nale¿y
 * wyœwietliæ te liczby, które wystêpuj¹ w obydwu tablicach  */
public class Zad1 {
	public boolean checkForDuplicates(int[] a, int[] b) {
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < b.length; j++) {
				if(a[i] == b[j]) {
					return true;
				}
			}
		}
		
		return false;
	}
	
	public boolean checkForDuplicatesOtherWay(int[] a, int[] b) {
		Zad0 arrUtil = new Zad0();
		for(int i = 0; i < a.length; i++) {
			if(arrUtil.indexOf(b, a[i]) >= 0) {
				return true;
			}
		}
		return false;
	}
	
}
