import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//ta bien

public class yogurtsale {
    public static void main(String[] args) {
        FastReader kbd = new FastReader();

        int intput = kbd.nextInt(), res;
        String out = "";
        for(int i = 0; i < intput; i++) {
            res = 0;
            int n = kbd.nextInt();
            int a = kbd.nextInt();
            int b = kbd.nextInt();

            
            res = (n/2)*b + (n%2)*a;
            if(n*a < res) {
                res = n*a;
            }
            out += res + "\n";
        }

        System.out.println(out);
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
