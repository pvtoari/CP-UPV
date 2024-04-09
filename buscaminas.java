import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

// WIP, EN MI VIDA JUGUE BUSCAMINAS
public class buscaminas {
    public static void main(String[] args) {
        FastReader kbd = new FastReader();
        int n = kbd.nextInt(), m = kbd.nextInt();

        char mina = "*".charAt(0);
        ArrayList<pareja> chivato = new ArrayList<>();
        String[][] minas = new String[n][m];

        for(int i = 0; i < n; i++) {
            String input = kbd.next();
            for(int j = 0; j < m; j++) {
                minas[i][j] = String.valueOf(input.charAt(j));
                if(input.charAt(j)==mina) {
                    chivato.add(new pareja(i,j));
                }
            }
        }

        
        for(int i = 0; i < n-2 && n>=2; i++) {
            for(int j = 0; j < m-2 && m>=2; j++) {
                int nMinas = 0;
                String[] box = {
                    minas[i][j], minas[i][j+1], minas[i][j+2],
                    minas[i+1][j], minas[i+1][j+1], minas[i+1][j+2],
                    minas[i+2][j], minas[i+2][j+1], minas[i+2][j+2],
                };
                for(int k = 0; k < box.length; k++) {
                    if(box[k].equals("F")) {
                        nMinas++;
                    }
                }
                minas[i][j] = String.valueOf(nMinas);
            }
        }

        for(pareja p : chivato) {
            minas[p.i][p.j]="F";
        }
        
        String res = "";
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                res += minas[i][j] + " ";
            }
            res += "\n";
        }

        System.out.println(res);
        
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