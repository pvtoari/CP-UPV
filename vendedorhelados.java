import java.util.*;

public class vendedorhelados {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);  
        int intput = kbd.nextInt();
        String res = "";
        int[] arr1 = new int[intput];
        for(int i = 0; i < intput; i++) {
            arr1[i] = kbd.nextInt();
        } 
        for(int i = 0; i < intput; i++) {
            res += (arr1[i]+kbd.nextInt()) + " ";
        }

        System.out.println(res);
    }
}