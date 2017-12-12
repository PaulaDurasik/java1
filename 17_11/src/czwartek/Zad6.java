package czwartek;

public class Zad6 {
	public int find2DArrayMin(int[][] arr) {
		int min = arr[0][0];
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] < min) {
					min = arr[i][j];
				}
			}
		}
		return min;
	}
}
