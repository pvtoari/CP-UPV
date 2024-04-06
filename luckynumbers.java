import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class luckynumbers {
    public static void main(String[] args) {
        
        //Scanner kbd = new Scanner(System.in);
        FastReader kbd = new FastReader();
        String n = kbd.next();
        char siete = "7".charAt(0), cuatro = "4".charAt(0);
        int sietes=0, cuatros=0;
        
        for(int i = 0; i < n.length(); i++) {
            if(n.charAt(i)==cuatro) {
                cuatros++;
            } else if(n.charAt(i)==siete) {
                sietes++;
            }
        }
        
        boolean lucky = cuatros+sietes==7 || cuatros+sietes==4;
        System.out.println(lucky ? "YES": "NO");
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