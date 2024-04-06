import java.util.*;

public class metrovalencia {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        
        int intput = kbd.nextInt();
        kbd.nextLine();
        ArrayList<Integer> nums = new ArrayList<>();

        String input = kbd.nextLine(), parsing="";
        input+=" ";
        String[] splitted = input.split("");
        kbd.close();
        for(int i = 0; i < splitted.length; i++) {
            if(!splitted[i].equals(" ")) {
                parsing += splitted[i];
            } else {
                nums.add(Integer.valueOf(parsing));
                parsing = "";
            }
        }
        parsing = Collections.min(nums) + " " + Collections.max(nums);
        System.out.println(parsing);
    }
}