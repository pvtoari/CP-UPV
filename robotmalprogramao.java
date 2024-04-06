import java.util.*;

public class robotmalprogramao {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        long n = 0, ant = 0;
        
        //String res = "";
        do {
            n += kbd.nextLong();
            //res += n + " ";
            System.out.print(n + " ");
            //ant = n;
        }while(kbd.hasNextLong());

        //System.out.println(res);
    }
}