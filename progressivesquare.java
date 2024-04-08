import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


//este nunca lo acabe

public class progressivesquare {
    public static void main(String[] args) {
        FastReader kbd = new FastReader();
        String res = "";

        int intput = kbd.nextInt();
        for(int i = 0; i < intput; i++) {
            int n = kbd.nextInt();
            int c = kbd.nextInt();
            int d = kbd.nextInt();

            int[][] mat = new int[n][n];
            String input = kbd.nextLine();

            String[] toBeParsed = input.split(" ");
            int[] nums = new int[n*n];
            for(int j = 0; j < nums.length; j++) {
                nums[j] = Integer.parseInt(toBeParsed[j]);
            }

            Arrays.sort(nums);

            int col=0,fil=0;
            for(int num : nums) {
                mat[col][fil] = num;
                col++;
                if(col==n) {
                    col = 0;
                    fil++;
                }
            }

            boolean broken = false;
            for(int j = 1; j < n-1 && !broken; j++) {
                for(int k = 1; k < n-1; k++) {
                    int term = mat[j][k];
                    if(mat[j+1][k]!=term+c && mat[j][k+1]!= term + d) {
                        broken = true;
                        break;
                    }
                }
            }
            res += broken ? "YES" : "NO" + "\n";

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
