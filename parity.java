import java.util.Scanner;

public class parity {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        long base = kbd.nextInt(), k = kbd.nextInt();
        long sum = 0;
        for(long i = k-1; i >= 0; i--) {
            long term = kbd.nextInt();
            sum += term*Math.pow(base,i);
        }

        System.out.println(sum);
        System.out.println(sum%2!=0 ? "odd" : "even");
    }
}