import java.util.Scanner;

public class bubblesort {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int n = kbd.nextInt();

        int[] nums = new int[n];
        int i = 0;

        while(kbd.hasNextInt()) {
            nums[i]=kbd.nextInt();
            i++;
        }

        for(int p = 0; p < n; p++) {
            for(int q = 0; q < n-p-1; q++) {
                if(nums[q] > nums[q + 1]) {
                    int temp = nums[q];
                    nums[q] = nums[q + 1];
                    nums[q + 1] = temp;
                }
            }
        }

        for(int p : nums) {
            System.out.print(p + " ");
        }
    }
}