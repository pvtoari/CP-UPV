import java.util.Scanner;

public class nextround {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int n = kbd.nextInt(), k = kbd.nextInt(), res = 0;
        int[] punts = new int[n];
        for(int i = 0; i < n; i++) {
            int personal = kbd.nextInt();
            punts[i] = personal;
        }

        int kesimo = punts[k-1];
        for(int i = 0; i < n; i++) {
            if(punts[i] >= kesimo && punts[i] > 0) {
                res++;
            }
        }

        kbd.close();
        System.out.println(res);
    }
}
