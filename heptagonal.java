import java.util.Scanner;

public class heptagonal {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        long n = kbd.nextInt();
        System.out.println(n*(5*n-3)/2);

        kbd.close();
    }
}
