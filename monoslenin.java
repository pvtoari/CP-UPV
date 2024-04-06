import java.util.Scanner;

public class monoslenin {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        String s1 = "",s2 = "",s3 = "";


        int intput1 = kbd.nextInt();
        for(int i = 0; i < intput1; i++) {
            int temput = kbd.nextInt();
            s1 += String.valueOf(temput*2) + " ";
        }

        int intput2 = kbd.nextInt();
        for(int i = 0; i < intput2; i++) {
            s2 += kbd.next() + " ";
        }
        s2 = s2.toUpperCase();

        int intput3 = kbd.nextInt();
        for(int i = 0; i < intput3; i++) {
            s3 += kbd.next() + " ";
        }
        kbd.close();
        s3 = s3.replaceAll("a", "0");
        s3 = s3.replaceAll("e", "0");
        s3 = s3.replaceAll("i", "0");
        s3 = s3.replaceAll("o", "0");
        s3 = s3.replaceAll("u", "0");
        s3 = s3.replaceAll("A", "0");
        s3 = s3.replaceAll("E", "0");
        s3 = s3.replaceAll("I", "0");
        s3 = s3.replaceAll("O", "0");
        s3 = s3.replaceAll("U", "0");

        System.out.println(s1 + "\n" + s2 + "\n" + s3);
    }
}
