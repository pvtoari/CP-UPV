import java.util.Scanner;

public class vladbestfive {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int intput = kbd.nextInt();
        char a = "A".charAt(0), b = "B".charAt(0);
        int as = 0, bs = 0;
        char[] reses = new char[intput];

        for(int i = 0; i < intput; i++) {
            as = 0; bs = 0;
            String input = kbd.next();
            for(int j = 0; j < input.length(); j++) {
                if(input.charAt(j) == a) {
                    as++;
                } else if(input.charAt(j) == b) {
                    bs++;
                }
            }

            if(as>bs){
                reses[i]=a;
            } else {
                reses[i] = b;
            }
        }
        
        kbd.close();
        for(int i = 0; i < reses.length; i++) {
            System.out.println(reses[i]);
        }
    }
}
