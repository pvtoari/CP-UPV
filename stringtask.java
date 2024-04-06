import java.util.*;

public class stringtask {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        
        String input = kbd.next(), res = "";
        
        input = input.toLowerCase();

        String[] splitted = input.split("");
        for(int i = 0; i < splitted.length; i++) {
            if(!isVowel(splitted[i])) {
                res+="." + splitted[i];
            }
        }

        System.out.println(res);
    }

    public static boolean isVowel(String a) {
        boolean res = false;
        String vocales = "aeiouy";
        for(int i = 0; i < vocales.length(); i++) {
            if(a.charAt(0) == vocales.charAt(i)) {
                res = true;
            }
        }

        return res;
    }

}
