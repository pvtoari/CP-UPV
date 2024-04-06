import java.util.Scanner;

public class boyorgirl {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        String input = kbd.next(), letras = "abcdefghijklmnopqrstuvwxyz";
        boolean[] found = new boolean[letras.length()];
        int res = 0;

        char[] splitted = input.toCharArray();
        for(int i = 0; i < splitted.length; i++) {
            char temp = splitted[i];
            for(int j = 0; j < letras.length(); j++) {
                if(!found[j] && temp == letras.charAt(j)) {
                    found[j] = true;
                    res++;
                }
            }
        }

        kbd.close();
        
        if(res%2!=0) {
            System.out.println("IGNORE HIM!");
        } else {
            System.out.println("CHAT WITH HER!");
        }
    }
}
