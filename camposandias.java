import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class camposandias {
    public static void main(String[] args) {
        FastReader kbd = new FastReader();
        int n = kbd.nextInt(), m = kbd.nextInt();

        int[][] nums = new int[n][m];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                nums[i][j] = kbd.nextInt();
            }
        }

        int sumaFilas = 0, memFil = 0;
        for(int i = 0; i < n; i++) {
            sumaFilas = 0;
            for(int j = 0; j < m; j++) {
                sumaFilas += nums[i][j];
            }
            if(sumaFilas > memFil) {
                memFil = sumaFilas;
            }
        }

        int sumaColumnas = 0, memCol = 0;
        for(int j = 0; j < m; j++) {
            sumaColumnas = 0;
            for(int i = 0; i < n; i++) {
                sumaColumnas += nums[i][j];
            }
            if(sumaColumnas > memCol) {
                memCol = sumaColumnas;
            }
        }

        System.out.println(memFil > memCol ? memFil : memCol);
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