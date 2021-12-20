package leetcodeNumbers;

public class No48 {
    public static void rotate(int[][] matrix) {
        int a = matrix.length-1;
        for (int i = 0;i < (a+1)/2; i++){
            for (int j = 0;j < (a+2)/2;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[a-j][i];
                matrix[a-j][i] = matrix[a-i][a-j];
                matrix[a-i][a-j] = matrix[j][a-i];
                matrix[j][a-i] = temp;
            }
        }
    }
}