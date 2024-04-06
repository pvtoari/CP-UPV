import java.util.Scanner;

public class vladdivision {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int intput = kbd.nextInt(), grupos = 0;
        int[] reses = new int[intput];

        for(int i = 0; i < intput; i++) {
            grupos = 0;
            int intput2 = kbd.nextInt();
            String[] nums = new String[intput2];

            for(int j = 0; j < nums.length; j++) {
                nums[j] = Integer.toBinaryString(kbd.nextInt());
            }
            for(int j = 0; j < nums.length; j++) {
                char termJ = nums[j].charAt(nums[j].length()-1);
                for(int k = 0; k < nums.length; k++) {
                    char termK = nums[k].charAt(nums[k].length()-1);
                    if((termJ^termK) == 0 && j==k) {
                        grupos++;
                    }
                }
            }
            reses[i] = grupos;
        }
        
        kbd.close();
        for(int i = 0; i < reses.length; i++) {
            System.out.println(reses[i]);
        }
    }
}
