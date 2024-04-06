public class calculadora {
    public static void main(String[] args) {
        java.util.Scanner kbd = new java.util.Scanner(System.in);

        String input = kbd.nextLine();
        kbd.close();

        boolean sum = false, rest = false, mult = false, div = false;
        String ops = "+-*/"; int mempos = 0;
        double a = 0, b = 0;

        for(int i = 0; i < input.length(); i++) {
            int temp = input.charAt(i);
            for(int j = 0; j < ops.length(); j++) {
                if(temp == ops.charAt(j) && i != 0) {
                    mempos = i;
                    i = input.length();
                }
            }
        }

        if(input.charAt(mempos) == ops.charAt(0)) {
            sum = true;
        } else if(input.charAt(mempos) == ops.charAt(1)) {
            rest = true;
        } else if(input.charAt(mempos) == ops.charAt(2)) {
            mult = true;
        } else if(input.charAt(mempos) == ops.charAt(3)) {
            div = true;
        }

        a = Integer.parseInt(input.substring(0, mempos-1));
        b = Integer.parseInt(input.substring(mempos+2));
        //System.out.println(a + ", " + mempos + ", " + b);

        if(sum) {
            System.out.println(a+b);
        } else if(rest) {
            System.out.println(a-b);
        } else if(mult) {
            System.out.println(a*b);
        } else if(div) {
            if(b == 0) {
                System.out.println("ERROR");
            } else {
                System.out.println(Math.round(((double) a / b)*100d)/100d);
            }
        }

        //System.out.println((double) 44456*789846545);
    }

    public static char toChar(String s) {
        return s.charAt(0);
    }
}
