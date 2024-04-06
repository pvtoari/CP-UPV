import java.util.Scanner;

public class cookies {
    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);
  
        int intput1 = kbd.nextInt(), intput2 = kbd.nextInt();

        if((intput1%intput2) == 0) {
          System.out.println("YES");
        } else {
          System.out.println("NO");
        }
    }
}