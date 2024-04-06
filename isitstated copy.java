import java.util.Scanner;

public class isitstated {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int intput = kbd.nextInt();
        boolean bool = false;
        String res = "";
        for(int i = 0; i < intput; i++) {
            bool = false;
            String input = kbd.next();

            if(input.equals("it") || input.equals("submit") || input.equals("timelimitexceeded")) {
                bool = true;
            }

            res += (bool ? "YES" : "NO") + "\n";
        }

        System.out.println(res);
    }


    /* 
     * 2086783
     * 1066561
     * 1530461
     * 1530205
     * 1528413
     * 1068865
     * 2086271
     * 768
     * 1990557
     * 240437
     * 2021955
     * 295448
     * 2023883
     * 4732
     * 2081616
     * 1066151
     * 1527196
     * 
    */
}