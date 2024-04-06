import java.util.Scanner;
     
public class thornscoins {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int intput = kbd.nextInt(), res = 0;
        char coin = "@".charAt(0), spikes = "*".charAt(0);
        int[] reses = new int[intput];
 
        for(int i = 0; i < intput; i++) {
            res = 0;
            int length = kbd.nextInt();
            String input = kbd.next();
            char[] splitted = input.toCharArray();
 
            for(int j = 1; j < length; j++) {
                if(splitted[j-1] == spikes && splitted[j] == spikes) {
                    j = length;
                } else if (splitted[j] == coin) {
                    res++;
                }
            }
 
            reses[i] = res;
        }
 
        kbd.close();
        for(int i = 0; i < intput; i++) {
            System.out.println(reses[i]);
        }
    }
}
