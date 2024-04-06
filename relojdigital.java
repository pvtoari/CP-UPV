public class relojdigital {
    public static void main(String[] args) {
        java.util.Scanner kbd = new java.util.Scanner(System.in);

        int intput = kbd.nextInt();
        kbd.close();
        
        long res = (720 + intput)%1440;

        if(res/60 < 10 && res%60 < 10) {
            System.out.println("0" + res/60 + ":" + "0" + res%60);
        } else if(res/60 > 10 && res%60 < 10) {
            System.out.println(res/60 + ":" + "0" + res%60);
        } else if(res/60 < 10 && res%60 > 10) {
            System.out.println("0" + res/60 + ":" + res%60);
        } else{
            System.out.println(res/60 + ":" + res%60);
        }
    }
}
