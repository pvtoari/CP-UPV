import java.util.*;

public class bombonfav {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        int intput = kbd.nextInt();
        kbd.nextLine();
        boolean[] reses = new boolean[intput];

        for(int i = 0; i < intput; i++) {
            String input1= kbd.nextLine();
            //kbd.nextLine();
            String input2= kbd.nextLine();
            //kbd.nextLine();

            String[] splitted = input2.split(" ");
            for(int j = 0; j < splitted.length; j++) {
                if(splitted[j].equals(String.valueOf(input1.charAt(2)))) {
                    reses[i] = true;
                    break;
                }
            }
        }

        kbd.close();
        for(int i = 0; i < intput; i++) {
            if(reses[i]) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}