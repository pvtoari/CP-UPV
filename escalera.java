import java.util.*;

public class escalera {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        
        String input = kbd.nextLine(), res= "";
        String[] splitted = input.split(" ");

        kbd.close();
        
        for(int i = 0; i < splitted.length-1; i++) {
            int term = Integer.valueOf(splitted[i]);
            int termSeg = Integer.valueOf(splitted[i+1]);

            if(term > termSeg) {
                res += "B";
            } else if(term==termSeg) {
                res += "I";
            } else {
                res += "S";
            }
        }

        System.out.println(res);
    }
}