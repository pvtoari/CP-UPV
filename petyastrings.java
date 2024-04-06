import java.util.Scanner;

public class petyastrings {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        String input1 = kbd.next(), input2 = kbd.next();
        int res = 0;

        kbd.close();

        if(input1.compareToIgnoreCase(input2) > 0) {
            res = 1;
        } else if(input1.compareToIgnoreCase(input2) < 0) {
            res = -1;
        }

        System.out.println(res);
    }
}
