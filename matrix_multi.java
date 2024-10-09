public class MatrixMultiplication {
    public static void main(String[] args) {
        // Define two matrices
        int[][] A = {
            {1, 2, 3},
            {4, 5, 6}
        };
        
        int[][] B = {
            {7, 8},
            {9, 10},
            {11, 12}
        };

        // Check if multiplication is possible
        if (A[0].length != B.length) {
            System.out.println("Matrix multiplication is not possible.");
            return;
        }

        // Initialize result matrix C
        int[][] C = new int[A.length][B[0].length];

        // Perform matrix multiplication
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                C[i][j] = 0;
                for (int k = 0; k < B.length; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Print the result
        System.out.println("Resultant Matrix:");
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[0].length; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}
