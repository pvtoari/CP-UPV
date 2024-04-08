import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


//error en el test 2
public class kraken {
    public static void main(String[] args) {
        FastReader kbd = new FastReader();
        int intput = kbd.nextInt();
        String res = "";

        for(int i = 0; i < intput; i++) {
            int n = kbd.nextInt();
            int k = kbd.nextInt();

            String input = kbd.nextLine();
            String[] toBeParsed = input.split(" ");
            int[] nums = new int[n];
            for(int j = 0; j < n; j++) {
                nums[j] = Integer.parseInt(toBeParsed[j]);
            }
            int first = 0, last = n-1, total = 0, zeros = 0;
            for(int j = 0; j < k; j++) {

                
                if(nums[first]==0) {
                    first++;
                }
                if(first >= n) {break;}
                
                if(nums[last]==0) {
                    last--;
                }
                if(last < 0) {break;}
                
                nums[first]--;
                total++;
                if(k==total) {break;}
                nums[last]--;
                total++;
                if(k==total) {break;}
            }

            for(int cero : nums) {
                if(cero==0) {zeros++;}
            }
            res += zeros + "\n";
            //System.out.println(Arrays.toString(nums));
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