import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class mayusminus {
    public static void main(String[] args) {
        String mayus = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String minus = "abcdefghijklmnopqrstuvwxyz";
        int nmayus = 0, nminus = 0;
        
        //Scanner kbd = new Scanner(System.in);
        FastReader kbd = new FastReader();
        String input = kbd.next();

        for(int i = 0; i < input.length(); i++) {
            char comp = input.charAt(i);
            for(int j = 0; j < mayus.length(); j++) {
                if(comp == mayus.charAt(j)) {
                    nmayus++;
                }
            }
            for(int j = 0; j < minus.length(); j++) {
                if(comp == minus.charAt(j)) {
                    nminus++;
                }
            }
        }

        if(nmayus > nminus) {
            input = input.toUpperCase();
        } else {
            input = input.toLowerCase();
        }

        System.out.println(input);
        //kbd.close();
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
