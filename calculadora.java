import java.util.*;

public class calculadora {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        String[] terms;
        String input = kbd.nextLine(), toBeParsed1 = "", toBeParsed2 = "";
        int vacio1=0, vacio2=0;
        long a,b;

        terms = input.split("");
        vacio1= input.indexOf(" ");
        vacio2= vacio1 + 2;
        for(int i = 0; i < terms.length; i++) {
            if(0<= i && i<=vacio1-1) {
                toBeParsed1+=terms[i];
            }
            if(vacio2+1<= i && i<=terms.length-1) {
                toBeParsed2+=terms[i];
            }
        }

        a = Long.parseLong(toBeParsed1);
        b = Long.parseLong(toBeParsed2);

        if(terms[vacio1+1].equals("+")) {
            System.out.println(a+b);
        } else if(terms[vacio1+1].equals("-")) {
            System.out.println(a-b);
        } else if(terms[vacio1+1].equals("*")) {
            System.out.println(a*b);
        } else if(terms[vacio1+1].equals("/") && b!= 0) {
            double a2 = (double) a;
            double b2 = (double) b;
            System.out.printf(Locale.ENGLISH, "%.2f", a2/b2);
        } else {
            System.out.println("ERROR");
        }
    }
}
