/* Mamy dwie tablice liczb ca³kowitych, nale¿y
 * wyœwietliæ liczby z obu tablic, które siê nie powtarzaj¹   */
public class Zad2 {
	public void showDuplicateNumbers(int[] a, int[] b) {
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < b.length; j++) {
				if(a[i] == b[j]) {
					System.out.println(a[i]);
				}
			}
		}
	}
	
	public void showNotDuplicateNumbers(int[] a, int[] b) {
		this.printNotExistingElements(a, b);
		this.printNotExistingElements(b, a);
	}
	
	public void printNotExistingElements(int[] a, int[] b) {
		Zad0 arrayUtils = new Zad0();
		
		for(int i = 0; i < a.length; i++) {
			if(arrayUtils.indexOf(b, a[i]) == -1) {
				System.out.println(a[i]);
			}
		}
	}
}
