package czwartek;

public class Zad4 {
	public int multiplyOddElements(int[][] arr) {
		int multi = 1;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] % 2 != 0) {
					multi *= arr[i][j];
				}
			}
		}
		return multi;
	}
}
