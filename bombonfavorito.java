import java.util.*;

public class bombonfavorito {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        boolean found = false;
        String res = "";

        int intput = kbd.nextInt();
        for(int i = 0; i < intput; i++) {
            found = false;
            int n = kbd.nextInt(), c = kbd.nextInt();

            int[] bombs = new int[n];
            for(int j = 0; j < n; j++) {
                int term = kbd.nextInt();
                if(term==c) {
                    found = true;
                }
                bombs[j] = term;
            }  
            res +=  (found ? "YES" : "NO")+ "\n";
        }
        
        System.out.println(res);
    }
}