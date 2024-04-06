import java.util.*;
import java.io.*;

public class dibucuadris {
    public static void main(String[] args) {
        FastReader kbd = new FastReader();
        int l = kbd.nextInt();
        l = l*3 + l+1;
        String res = "";
        String[][] cuadri = new String[l][l];
        for(int i = 0; i < l; i++) {
            for(int j = 0; j < l; j++) {
                if(i%4==0 && j%4==0) {
                    cuadri[i][j] = "+";
                } else if(i%4==0 && j%4!=0) {
                    cuadri[i][j] = "-";
                } else if(i%4!=0 && j%4==0) {
                    cuadri[i][j] = "|";
                } else {
                    cuadri[i][j] = " ";
                }
            }
        }

        for(int i = 0; i < l; i++) {
            for(int j = 0; j < l; j++) {
                res += cuadri[i][j];
            }
            res += "\n";
        }

        System.out.println(res);
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

