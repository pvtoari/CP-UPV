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

        int[] aux = new int[max-min+1];
        for(int i = 0; i < aux.length; i++) {
            aux[i]=i+min;
        }

        printArray(aux);
    }

    public static void printArray(int[] arr) {
        for(int a : arr) {
            System.out.print(a + " ");
        }
    }
}