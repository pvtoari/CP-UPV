import java.util.*;

public class robotmalprogramao {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        String input = kbd.nextLine(), res = "";
        kbd.close();
        String[] splitted = input.split(" ");
        int ant = 0;
        for(int i = 0; i < splitted.length; i++) {
            res += (ant + Integer.parseInt(splitted[i])) + " ";
            ant += Integer.parseInt(splitted[i]);
        }

        System.out.println(res);
    }
}