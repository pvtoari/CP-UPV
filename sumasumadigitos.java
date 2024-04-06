import java.util.Scanner;

public class sumasumadigitos {

    public static int sumaDigitos(int a) {
        int suma = 0;                   
        while (a != 0) {
            suma += a % 10;
            a /= 10;
        }
        return suma;
    }
    public static void main(String[] args) {
        //long t1 = System.currentTimeMillis();
        Scanner kbd = new Scanner(System.in);
        int intput = kbd.nextInt();
        int[] reses = new int[intput];

        for(int i = 0; i < intput; i++) {
            int intput2 = kbd.nextInt();
            int suma = 0;
            for(int j = 0; j <= intput2; j++) {
                suma += sumaDigitos(j);
            }
            reses[i] = suma;
        }
        
        kbd.close();
        for(int i = 0; i < reses.length; i++) {
            System.out.println(reses[i]);
        }
    }
}
