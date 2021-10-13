package Task6;

public class Task6 {
    public static void main(String[] args) {
        final int[][] first_matrix = new int[][]{{1, 3, 5}, {6, 8, 2}, {9, 4, 5}};
        final int[][] second_matrix = new int[][]{{8, 1, 4}, {5, 3, 7}, {4, 5, 2}};

        final int[][] array3 = multiplyMatrix(first_matrix, second_matrix);

        System.out.println("First matrix");
        printMatrix(first_matrix);
        System.out.println();
        System.out.println("Second matrix");
        printMatrix(second_matrix);
        System.out.println();
        System.out.println("Result multiplyMatrix");
        printMatrix(array3);
    }

    static int[][] multiplyMatrix(final int[][] matrixA, final int[][] matrixB) {
        final int rowsA = matrixA.length;
        final int colsA = matrixA[0].length;
        final int rowsB = matrixB.length;
        final int colsB = matrixB[0].length;

        final int[][] matrixC = new int[rowsA][];

        if (colsA != rowsB) {
            System.out.println("Error: these matrices cannot be multiplied");
        } else {
            for (int i = 0; i < rowsA; i++)
                matrixC[i] = new int[colsB];

            for (int i = 0; i < colsB; i++) {
                for (int j = 0; j < rowsA; j++) {
                    int t = 0;
                    for (int k = 0; k < rowsB; k++) t += matrixA[i][k] * matrixB[k][j];
                    matrixC[i][j] = t;
                }
            }
        }
        return matrixC;
    }

    static void printMatrix(final int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }

    }
}
