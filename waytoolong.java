import java.util.Scanner;

public class waytoolong {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int intput = kbd.nextInt();
        String res = "";

        for(int i = 0; i < intput; i++) {
            String input = kbd.next();
            
            if(input.length() > 10) {
                res += Character.toString(input.charAt(0)) + (input.length() - 2) + Character.toString(input.charAt(input.length()-1)) + "\n";
            } else {
                res +=  input + "\n";
            }
        }

        System.out.println(res);
        kbd.close();
    }
        
}
