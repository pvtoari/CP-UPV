import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class soldierbananas {
    public static void main(String[] args) {
        //Scanner kbd = new Scanner(System.in);
        FastReader kbd = new FastReader();
        int init=kbd.nextInt(),money=kbd.nextInt(),desired=kbd.nextInt();

        for(int i = 1; i <= desired; i++) {
            money -= init*i;
        }
        if(money > 0) {System.out.println("0");}
        else {System.out.println(Math.abs(money));}
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader()
        {
            br = new BufferedReader(
                new InputStreamReader(System.in));
        }
 
        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt() { return Integer.parseInt(next()); }
 
        long nextLong() { return Long.parseLong(next()); }
 
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
 
        String nextLine()
        {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}