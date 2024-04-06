import java.util.Scanner;

public class checkdni {
    public static void main(String[] args) {
      String input = "";
      String mayus = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
      String nums = "0123456789";
      int nnums = 0, nletra = 0;
      Scanner kbd = new Scanner(System.in);
      input = kbd.next();

      kbd.close();

      if(input.length() != 9) {
        System.out.println("No");
        return;
      }

      for(int i = 0; i < input.length() -1; i++) {
        char comp = input.charAt(i);
        for(int j= 0; j < nums.length(); j++) {
          char ntemp = nums.charAt(j);
          if(comp == ntemp) {
            nnums++;
          }
        }
      }

      char comp = input.charAt(8);
      for(int j= 0; j < mayus.length(); j++) {
        if(comp == mayus.charAt(j)) {
          nletra++;
        }
      }
      
      if(nnums != 8 || nletra != 1 ) {
        System.out.println("No");
      } else {
        System.out.println("Si");
      }
  }
}