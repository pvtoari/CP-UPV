public class ensalada {
    public static void main(String[] args) {
        java.util.Scanner kbd = new java.util.Scanner(System.in);
        long intput1, intput2, intput3, res;

        intput1 = kbd.nextInt();
        intput2 = kbd.nextInt();
        intput3 = kbd.nextInt();

        if(intput3 != 0) {
            intput3--;
        } else {
            if(intput2 != 0) {
                intput2--;
            } else {
                if(intput1 != 0) {
                    intput1--;
                }
            }
        }

        res = intput1*5 + intput2*7 + intput3*13;
        System.out.println(res);
    }
}
