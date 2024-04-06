import java.util.*;

public class rudolfugly {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int intput = kbd.nextInt(), length, res = 0;
        kbd.nextLine();
        String[] letras;
        int[] reses = new int[intput];

        for(int i = 0; i < intput; i++) {
            length = kbd.nextInt();
            kbd.nextLine();
            String input = kbd.next();
            kbd.nextLine();
            letras = input.split("");

            boolean contains = input.contains("pie") || input.contains("map");
            while(contains) {
                contains = input.contains("pie") || input.contains("map");
                for(int j = 0; j < length; j++) {
                    String letra = letras[j];
                    if(letra.equals("i") || letra.equals("e") || letra.equals("a")) {
                        letras[j] = "";
                        res++;
                        input="";
                        for(int k = 0; k < letras.length; k++) {
                            input += letras[k];
                        }
                        break;
                    }
                }
            }

            reses[i] = res;
        }
    }
}
