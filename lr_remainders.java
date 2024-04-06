import java.util.Scanner;

public class lr_remainders {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int intput = kbd.nextInt(), res = 0;
        char erre = "R".charAt(0), ele = "L".charAt(0);
        int[] reses = new int[0];

        for(int i = 0; i < intput; i++) {
            res = 0;
            int n = kbd.nextInt(), m = kbd.nextInt();
            int[] arrN = new int[n];
            reses = new int[n];

            for(int j = 0; j < n; j++) {
                arrN[j] = kbd.nextInt();
            }
            String input = kbd.next();

            for(int j = 0; j < n; j++) {
                if(j==0) {
                    res = arrN[0];
                    for(int k = 0; j < arrN.length-1; j++) {
                        res *= arrN[k+1];
                    }
                    res = res%m;
                } else {

                    for(int k = 0; k < n; k++) {
                        if(input.charAt(k) == ele) {
                            arrN[0] = 1;
                            n--;
                        } else if(input.charAt(k) == erre) {
                            arrN[n-1] = 1;
                            n--;
                        }
                    }
                        res = arrN[0];
                        for(int k = 0; j < arrN.length-1; j++) {
                            res *= arrN[k+1];
                        }
                        res = res%m;
                    }
                reses[j] = res;
                }
            }

        kbd.close();

        for(int i = 0; i < reses.length; i++) {
            System.out.println(reses[i]);
        }
    }
}
