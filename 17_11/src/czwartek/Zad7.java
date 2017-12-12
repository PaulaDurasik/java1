package czwartek;

public class Zad7 {
	public int find2DArrayMax(int[][] arr) {
		int max = arr[0][0];
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] > max) {
					max = arr[i][j];
				}
			}
		}
		return max;
	}
}
