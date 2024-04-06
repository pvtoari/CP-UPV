import java.util.Scanner;

public class isodd {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        int input = kbd.nextInt();
        boolean res = false;
        if(input % 2 != 0) {
            res = true;
        }
        kbd.close();
        System.out.println(res);
    }
}
