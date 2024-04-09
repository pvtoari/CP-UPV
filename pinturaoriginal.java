import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class pinturaoriginal {
    public static void main(String[] args) {
        FastReader kbd = new FastReader();
        int n = kbd.nextInt(), m = kbd.nextInt();

        char pintao = "#".charAt(0);
        ArrayList<pareja> chivato = new ArrayList<>();
        String[][] cuadro = new String[n][m];

        for(int i = 0; i < n; i++) {
            String input = kbd.next();
            for(int j = 0; j < m; j++) {
                cuadro[i][j] = String.valueOf(input.charAt(j));
                if(input.charAt(j)==pintao) {
                    chivato.add(new pareja(i,j));
                }
            }
        }

        boolean notOg = false;
        for(pareja p : chivato) {
            if(p.i < n-1 && p.j < m-1) {
                String term00 = cuadro[p.i][p.j];
                String term01 = cuadro[p.i][p.j+1];
                String term10 = cuadro[p.i+1][p.j];
                String term11 = cuadro[p.i+1][p.j+1];
                String concat = term00+term01+term10+term11;
                if((concat).equals("####")) {
                    notOg = true;
                }
            }
            if(notOg) {break;}
        }

        System.out.println(notOg ? "NO ORIGINAL" : "ORIGINAL");
    }

    static class pareja {
        private int i, j;
        pareja(int a, int b) {
            this.i = a;
            this.j = b;
        }
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