
public class Question3 {
	
	public static void main(String[] args) {
		int[][] intMatrix = new int[5][4];
		int count = 1;
		for (int i = 0; i < intMatrix.length; i++) {
			for(int j = 0;j<intMatrix[i].length;j++) {
				intMatrix[i][j]=count++;
			}
		}
		printMatrix(intMatrix);
		printSpiral(intMatrix);
	}
	public static void printSpiral(int[][] matrix) {
		next(0,0,matrix);
	}
	public static int next(int i, int j, int[][] matrix) {
		if(j<matrix[0].length&&i<matrix.length-1) {
			System.out.print("["+matrix[i][j]+"]");
			return next(i,j+1,matrix);
		}
		else if(i<matrix[0].length) {
			//System.out.println();
			return next(i+1,j-1,matrix);
		}else if(j>=0&&i==matrix.length-1) {
			System.out.print("["+matrix[i][j]+"]");
			return next(i,j-1,matrix);
		}
		
		return -1;
	}
	public static  void printMatrix(int[][] matrix) {
		
		for (int i = 0; i < matrix.length; i++) {
			for(int j = 0;j<matrix[i].length;j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
	}
}
