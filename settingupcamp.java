import java.util.*;

public class settingupcamp {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int intput = kbd.nextInt(), intr = 0, extr = 0, univ = 0, res = 0;
        int[] reses = new int[intput];
        kbd.nextLine();

        for(int i = 0; i < intput; i++) {
            String input = kbd.nextLine();
            String[] splitted = input.split(" ");

            intr = Integer.parseInt(splitted[0]);
            extr = Integer.parseInt(splitted[1]);
            univ = Integer.parseInt(splitted[2]);

            res += intr + extr / 3;
            int z = extr % 3 + univ%3;
            //res += z/3;
            if(z<3)

            reses[i] = res;
        }

        for(int i = 0; i < reses.length; i++) {
            System.out.println(reses[i]);
        }
    }
}
