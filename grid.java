import java.util.Arrays;
import java.util.Scanner;

public class grid {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        long init = 1, res = 0;
        String[] lines = new String[21];
        for(int i = 0; i < 21; i++) {
            lines[i] = kbd.next();
        }

        int[][] matriz = new int[21][21];

        for(int i = 0; i < 21; i++) {
            for(int j = 0; j < 21; j++) {
                matriz[i][j] = Character.getNumericValue(lines[i].charAt(j));
            }
        }

        //System.out.println(Arrays.deepToString(matriz));
        System.out.println(findMaxSubmatrixSum(matriz));
    }

    public static int findMaxSubmatrixSum(int[][] matrix) {
        int maxSum = Integer.MIN_VALUE;
    
        for (int i = 0; i < matrix.length - 3; i++) {
            for (int j = 0; j < matrix[0].length - 3; j++) {
                int submatrixSum = 0;
                for (int k = 0; k < 4; k++) {
                    for (int l = 0; l < 4; l++) {
                        submatrixSum += matrix[i + k][j + l];
                    }
                }
                if (submatrixSum > maxSum) {
                    maxSum = submatrixSum;
                }
            }
        }
    
        return maxSum;
    }
}