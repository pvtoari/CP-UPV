import java.util.Scanner;

public class letradni {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        String input = kbd.next();

        int input2 = Integer.parseInt(input);
        int ev = input2 % 23;
        String st = "";
        switch (ev) {
            case 0: st = "T";
            break;
            case 1: st = "R";
            break;
            case 2: st = "W";
            break;
            case 3: st = "A";
            break;
            case 4: st = "G";
            break;
            case 5: st = "M";
            break;
            case 6: st = "Y";
            break;
            case 7: st = "F";
            break;
            case 8: st = "P";
            break;
            case 9: st = "D";
            break;
            case 10: st = "X";
            break;
            case 11: st = "B";
            break;
            case 12: st = "N";
            break;
            case 13: st = "J";
            break;
            case 14: st = "Z";
            break;
            case 15: st = "S";
            break;
            case 16: st = "Q";
            break;
            case 17: st = "V";
            break;
            case 18: st = "H";
            break;
            case 19: st = "L";
            break;
            case 20: st = "C";
            break;
            case 21: st = "K";
            break;
            case 22: st = "E";
            break;
        }

        kbd.close();
        System.out.println(input + st);
    }
}