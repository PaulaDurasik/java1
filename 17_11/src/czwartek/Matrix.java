package czwartek;

public class Matrix {
	public void print2DArray(int[][] m) {
		System.out.println();
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[i].length; j++) {
				System.out.printf("%3d", m[i][j]);
			}
			System.out.println();
		}
	}
	
	public int[][] identityMatrix(int[][] m) {
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[i].length; j++) {
				m[i][j] = 1;
			}
		}
		return m;
	}
	
	public int[][] identityMatrixByDiagonal(int[][] m) {
		if(m.length == m[0].length) {
			for(int i = 0; i < m.length; i++) {
				for(int j = 0; j < m[i].length; j++) {
					if(i == j) {
						m[i][j] = 1;
					}
				}
			}
		}
		return m;
	}
	
	public boolean isEqualDimension(int[][] a, int[][] b) {
		return (a.length == b.length && a[0].length == b[0].length);
	}
	
	public int[][] indexedMatrix(int[][] m) {
		int n = 1;
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[i].length; j++, n++) {
				m[i][j] = n;
			}
		}
		return m;
	}
	
	public int[][] addMatrix(int[][] a, int[][] b) {
		int[][] myMatrix = new int[a.length][a[0].length];
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				myMatrix[i][j] = a[i][j] + b[i][j];
			}
		}
		return myMatrix;
	}
	
	public int[][] substractMatrix(int[][] a, int[][] b) {
		int[][] myMatrix = new int[a.length][a[0].length];
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				myMatrix[i][j] = a[i][j] - b[i][j];
			}
		}
		return myMatrix;
	}
	
	public int[][] multiplicateMatrix(int[][] m, int n) {
		int[][] myMatrix = new int[m.length][m[0].length];
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[i].length; j++) {
				myMatrix[i][j] = m[i][j] * n;
			}
		}
		return myMatrix;
	}
	
	public int[][] transpose(int[][] m) {
		int w = m.length, k = m[0].length;
		int[][] matrixT = new int[k][w];
		
		for(int i = 0; i < m[0].length; i++) {
			for(int j = 0; j < m.length; j++) {
				matrixT[i][j] = m[j][i];
			}
		}
		
		return matrixT;
		
	}
	
	public boolean isSymetric(int[][] a, int[][] b) {
		boolean flag = true;
		loop:
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				if(a[i][j] != b[i][j]) {
					flag = false;
					break loop;
				}
			}
		}
		return flag;
	}
	
}
