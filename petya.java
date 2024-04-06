import java.util.Scanner;

public class petya {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int intput = kbd.nextInt(), res = 0;
    
        for(int i = 0; i < intput; i++) {
            int res1 = kbd.nextInt();
            int res2 = kbd.nextInt();
            int res3 = kbd.nextInt();

            if(res1+res2+res3 >= 2) {
                res++;
            }
        }
        
        kbd.close();
        System.out.println(res);
    }
}
