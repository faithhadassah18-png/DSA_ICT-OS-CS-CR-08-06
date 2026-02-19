package sum;

public class MatrixMultiplication {

	public static void main(String[] args) {
        int[][] A = {{1, 2}, {3, 4}};    
        int[][] B = {{5, 6}, {7, 8}};    
        
        System.out.println("Matrix A:");
        showMatrix(A);
        
        System.out.println("\nMatrix B:");
        showMatrix(B);
        int[][] result = multiply(A, B);
        
        System.out.println("\nTheir product:");
        showMatrix(result);
    }
    
    static int[][] multiply(int[][] first, int[][] second) {
        int rows = first.length;
        int cols = second[0].length;
        int shared = second.length;  
        
        int[][] answer = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < shared; k++) {
                    answer[i][j] += first[i][k] * second[k][j];
                }
            }
        }
        return answer;
    }
    static void showMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

	}


