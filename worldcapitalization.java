import java.util.Scanner;

public class worldcapitalization {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        String input = kbd.next();
        input = input.substring(0,1).toUpperCase() + input.substring(1, input.length());
        kbd.close();
        System.out.println(input);
    }
}
