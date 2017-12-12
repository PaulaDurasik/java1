package czwartek;

public class Zad8 {
	public int[] sumEvenNumbersInRows(int[][] arr) {
		int[] result = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] % 2 == 0) {
					result[i] += arr[i][j];
				}
			}
		}
		return result;
	}
}
