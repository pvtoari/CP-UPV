import java.util.Scanner;

public class bearbigbrother {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int a = kbd.nextInt(), b = kbd.nextInt(), res = 0;
        
        while(a<b) {
            a *= 3;
            b *= 2;
            res++;
        }

        System.out.println(res);
    }
}
