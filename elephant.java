import java.util.*;

public class elephant {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int intput = kbd.nextInt();
        ArrayList<Integer> divs = new ArrayList<>();
        divs.is
        for(int i = 1; i <=5; i++) {
            if(intput%i == 0) {
                divs.add(intput/i);
            }
            else {
                divs.add(intput/i+(i - intput%i));
            }
        }
        //System.out.println(divs);
        System.out.println(Collections.min(divs));
    }
}
