import java.util.Locale;

public class estadisticaoptimista {
    public static void main(String[] args) {
        java.util.Scanner kbd = new java.util.Scanner(System.in).useLocale(Locale.ENGLISH);

        int intput = kbd.nextInt(), j = 0;
        double sum = 0;
        for(int i = 0; i < intput; i++) {
            double nTerm = kbd.nextDouble();
            if(nTerm >= 5) {
                sum += nTerm;
                j++;
            }
        }

        kbd.close();

        double res = sum/j;
        System.out.println(String.format(Locale.ENGLISH, "%.2f", res));
    }
}