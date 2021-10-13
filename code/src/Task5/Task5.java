package Task5;

public class Task5 {
    public static void main(String[] args) {
        final int[][] matrix = new int[][] {{1, 3, 5}, {6, 8, 2}, {9, 4, 5},{5, 6, 7}};

        System.out.println();
        System.out.println("Matrix");
        OutPutMatrix(matrix);
        System.out.println();
        System.out.println("Transpose matrix");
        Transpose(matrix);
    }

    public static void OutPutMatrix(int[][] matrix){
        for(int n = 0;n< 4; n++) {
            for (int m = 0; m < 3; m++) {// різна довжина
                System.out.print(matrix[n][m] + " ");
            }
            System.out.println();
        }
    }


    public static void Transpose(int[][]matrix){
        for(int n = 0; n < 3; n++) {
            for (int m = 0;m< 4; m++) {// різна довжина
                System.out.print(matrix[m][n] + " ");
            }
            System.out.println();
        }
    }
}