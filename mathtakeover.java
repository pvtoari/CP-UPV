import java.util.Scanner;

public class mathtakeover {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        double input = kbd.nextFloat(), res = 0;

        res = Math.sqrt(input);

        System.out.println(res);
    }
}