import java.util.Scanner;

public class letradni {
    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        String input = kbd.next();
        kbd.close();
        
        if(input.length() != 8) {
          return;
        }
        int num = Integer.parseInt(input);
        System.out.println(input + letras.charAt(num % 23));
      }


    }