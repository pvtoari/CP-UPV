import java.util.*;

public class relojdigital {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        int inputMins = kbd.nextInt(), nHours, nMins;
        nHours = ((inputMins+720)/60)%24;
        nMins = (inputMins+720)%60;

        String hh = ""+nHours, mm = ""+nMins;
        if(nHours <= 9) {
            hh = "0" + nHours;
        } if(nMins <= 9) {
            mm = "0" + nMins;
        }
        System.out.println(hh+":"+mm);
    }
}
