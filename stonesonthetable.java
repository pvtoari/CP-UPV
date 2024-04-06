import java.util.Scanner;

public class stonesonthetable {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int intput = kbd.nextInt(), res = 0;
        String input = kbd.next();
        //char R= "R".charAt(0), G = "G".charAt(0), B = "B".charAt(0);
        kbd.close();
        
        char[] splitted = input.toCharArray();
        for(int i = 0; i < intput-1; i++) {
            boolean sustDobleRepeat = false;
            if(splitted[i+1]==splitted[i]) {
                res++;
                sustDobleRepeat = true;
            }
            if(!sustDobleRepeat && i != 0 && splitted[i] == splitted[i-1] && splitted[i] == splitted[i+1]) {
                res++;
            }
        }
       
        System.out.println(res);
    }
}
