import java.util.Scanner;

public class ensalada {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int a, t, n, temp;

        a = kbd.nextInt();
        t = kbd.nextInt();
        n = kbd.nextInt();
        if(a > t && a > n) {
            a--;
        } else if (a < t && a)
        System.out.println(a*5 + t*7 + 13*n);
    }
}
