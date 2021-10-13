
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
	private static int ai=0;
	private static int aj=0;
	public static void printSpiral(int[][] matrix) {
		
		printBackwards(matrix[0]);
	}
	public static void printBackwards(int[] arr) {
		for(int i = arr.length-1;i>=0;i--) {
			System.out.print(arr[i]);
		}
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
