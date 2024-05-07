import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class alcayatas {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<Integer>();
        int n = kbd.nextInt();

        while(kbd.hasNextInt()) {
            nums.add(kbd.nextInt());
        }

        Collections.sort(nums);

        int res1 = nums.get(n-1)-nums.get(n-2);
        int res2 = nums.get(1)-nums.get(0);
        System.out.println(Math.min(res1, res2));
    }
}