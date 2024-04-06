import java.util.Scanner;

public class finalcountdown {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int intput = kbd.nextInt(), res = 0;

        for(int i = 0; i < intput; i++) {
            res = 0;
            int secs = kbd.nextInt();
            String input = kbd.next();

            char[] splitted = input.toCharArray();
            for(int k = 0; k < secs; k++) {
                char[] decreased = String.valueOf(Integer.parseInt(input) - 1).toCharArray();

                for(int j = 0; j < splitted.length; j++) {
                    if(splitted[j] != decreased[j]) {
                        res++;
                    }
                }
            }
        }

        kbd.close();
        System.out.println(res);
    }
}
