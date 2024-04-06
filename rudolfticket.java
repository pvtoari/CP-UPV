import java.util.*;

public class rudolfticket {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int intput = kbd.nextInt(), k, res;
        kbd.nextLine();
        String[] izq, der, params;
        int[] reses = new int[intput];

        for(int i = 0; i < intput; i++) {
            res = 0;
            String input = kbd.nextLine();
            params = input.split(" ");
            k = Integer.parseInt(params[2]);

            String inIzq = kbd.nextLine();
            izq = inIzq.split(" ");
            String inDer = kbd.nextLine();
            der = inDer.split(" ");

            for(int j= 0; j < izq.length; j++) {
                int termIzq= Integer.parseInt(izq[j]);
                for(int w = 0; w < der.length; w++) {
                    int termDer = Integer.parseInt(der[w]);
                    if(termIzq+termDer<=k) {
                        res++;
                    }
                }
            }

            reses[i] = res;
        }
        kbd.close();
        
        for(int i = 0; i < reses.length; i++) {
            System.out.println(reses[i]);
        }
    }
}
