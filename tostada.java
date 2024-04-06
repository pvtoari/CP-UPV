import java.io.*;
import java.util.*;

public class tostada {
    public static void main(String[] args) {
        FastReader kbd = new FastReader();

        int l = kbd.nextInt();
        char[][] ant = new char[l][l];
        //char[][] fin = new char[l][l];
        char mermelada = "#".charAt(0);
        boolean hasMermelada = false;
        boolean res = true;

        for(int i = 0; i < l; i++) {
            String input = kbd.next();
            for(int j = 0; j < l; j++) {
                ant[i][j] = input.charAt(j);
                if(input.charAt(j)==mermelada && !hasMermelada) {
                    hasMermelada = true;
                }
            }
        }

        for(int i = 0; i < l; i++) {
            String input = kbd.next();
            for(int j = 0; j < l; j++) {
                if(input.charAt(j) != ant[i][j]) {
                    res = false;
                    break;
                }
            }
        }

        if(!hasMermelada) {
            System.out.println("NO LLEVABA MERMELADA");
        } else {
            System.out.println(res ? "HA HABIDO SUERTE" : "TRAGEDIA");
        }

        //System.out.println(Arrays.deepToString(ant));
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