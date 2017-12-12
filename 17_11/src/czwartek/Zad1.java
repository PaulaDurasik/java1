package czwartek;

public class Zad1 {
	public int addElementsDividedBySeven(int[][] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				if(arr[i][j] % 7 == 0) {
					sum += arr[i][j];
				}
			}
		}
		return sum;
	}
}
