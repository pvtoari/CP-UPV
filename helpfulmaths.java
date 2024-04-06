import java.util.Arrays;
import java.util.Scanner;

public class helpfulmaths {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        String input = kbd.next(), res = "";
        char mas = "+".charAt(0);

        String[] splitted = input.split("");
        for(int i = 0; i < splitted.length; i++) {
            if(!(splitted[i].charAt(0) == mas)) {
                res += splitted[i];
            }
        }

        splitted = res.split("");
        int[] intsplitted = new int[splitted.length];
        for(int i = 0; i < intsplitted.length; i++) {
            intsplitted[i] = Integer.parseInt(splitted[i]);
        }
        
        Arrays.sort(intsplitted);
        res = String.valueOf(intsplitted[0]);
        for(int i= 1; i < intsplitted.length; i++) {
            res += "+" + intsplitted[i];
        }
        kbd.close();
        System.out.println(res);
        
    }
}
