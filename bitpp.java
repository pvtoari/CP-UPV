import java.util.Scanner;

public class bitpp {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int intput = kbd.nextInt(), res = 0;

        for(int i = 0; i < intput; i++) {
            String input = kbd.next();
            String plus = "+", minus = "-", ex = "X";
            if(input.equals(plus+plus+ex) || input.equals(ex+plus+plus)) {
                res++;
            } else if(input.equals(minus+minus+ex) || input.equals(ex+minus+minus)) {
                res--;
            }
        }
        kbd.close();
        System.out.println(res);
    }
}
