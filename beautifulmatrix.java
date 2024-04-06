import java.util.Scanner;

public class beautifulmatrix {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int[][] matriz = new int[5][5];
        int chivatoI = 0, chivatoJ = 0, centroI = 2, centroJ = 2, movs = 0;

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                matriz[i][j] = kbd.nextInt();
                if(matriz[i][j] == 1) {
                    chivatoI = i;
                    chivatoJ = j;
                }
            }
        }

        kbd.close();

        if(matriz[2][2] != 1) {
            movs = Math.abs(chivatoI - centroI) + Math.abs(chivatoJ - centroJ);
        }

        System.out.println(movs);
    }
}
