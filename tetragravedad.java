import java.io.*;
import java.util.*;

public class tetragravedad {
    public static void main(String[] args) {
        FastReader kbd = new FastReader();

        int n = kbd.nextInt();
        int m = kbd.nextInt();

        String[][] mesa = new String[n][m];
        ArrayList<pareja> chivato = new ArrayList<>();
        char gota = "#".charAt(0);

        for(int i = 0; i < n; i++) {
            String input = kbd.next();
            for(int j = 0; j < m; j++) {
                mesa[i][j] = String.valueOf(input.charAt(j));
                if(input.charAt(j)==gota) {
                    chivato.add(new pareja(i,j));
                }
            }
        }
        
        /*chivato.forEach((pareja p) -> {
            System.out.println("pene");
            for(int i = 0; i < n; i++) {
                mesa[p.i][i] = "#";
            }
        }
        );
        */
    
        for(int i = 0; i < chivato.size(); i++) {
            System.out.println("debug");
            pareja p = chivato.get(i);
            for(int j = 0; j < n; i++) {
                mesa[p.i][j] = "#";
            }
        }

        String res = "";
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                res += mesa[i][j];
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
                    if(st.hasMoreTokens()){ 
                        str = st.nextToken("\n"); 
                    } 
                    else{ 
                        str = br.readLine(); 
                    } 
                } 
                catch (IOException e) { 
                    e.printStackTrace(); 
                } 
                return str; 
            } 
    }
}
