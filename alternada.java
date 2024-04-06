import java.util.*;

public class alternada {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        
        int intput = kbd.nextInt();
        int[] arr1 = new int[intput], arr2= new int[intput];
        String res1= "", res2= "";
        for(int i = 0; i < intput; i++) {
            arr1[i] = kbd.nextInt();
        } 
        for(int i = 0; i < intput; i++) {
            arr2[i]= kbd.nextInt();
        }

        kbd.close();

        for(int i = 0; i < intput; i++) {
            if(i%2==0) {
                res1 += arr1[i] + " ";
                res2 += arr2[i] + " ";
            } else {
                res1 += arr2[i] + " ";
                res2 += arr1[i] + " ";
            }
        }

        System.out.println(res1+"\n"+res2);
    }
}