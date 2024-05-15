import java.util.Scanner;

public class pigeonholesort {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int n = kbd.nextInt();

        int[] nums = new int[n];
        int p = 0;

        while(kbd.hasNextInt()) {
            nums[p]=kbd.nextInt();
            p++;
        }

        int min, max;
        min = max = nums[0];
        for(int i = 0; i < n; i++) {
            if(nums[i] < min) {
                min = nums[i];
            }

            if(nums[i] > max) {
                max = nums[i];
            }
        }

        int offset = max-min+1;
        int[] aux = new int[offset];
        
        for(int i = 0; i < n; i++) {
            aux[nums[i]-min]++;
        }

        String res = "";
        res += min;
        int k = 0;
        for(int i = 0; i<max; i++) {
            k=0;
            if(aux[i]==1) {
                res += " " + i;
            } else if(aux>1) {
                while(k<aux[i]) {
                    res += " " + i;
                    k++;
                }
            }
        }

        printArray(aux);
    }

    public static void printArray(int[] arr) {
        for(int a : arr) {
            System.out.print(a + " ");
        }
    }
}