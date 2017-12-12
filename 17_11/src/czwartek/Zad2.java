package czwartek;

public class Zad2 {
	public int multiplyElements(int[][] arr) {
		int multi = 1;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				multi *= arr[i][j];
				/* multi = multi * arr[i][j] */
			}
		}
		return multi;
	}
}
