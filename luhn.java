import java.util.*;

public class luhn {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        String input = kbd.next();
        String[] splitted = input.split("");

        kbd.close();

        int[] nums = new int[splitted.length];
        for(int i = 0; i < splitted.length; i++) {
            int term = Integer.valueOf(splitted[i]);
            nums[i] = term;
        }

        int sumaPares = 0, sumaImpares = 0;
        for(int i = nums.length-1; i >= 0; i--) {
            if(i%2==0) {
                nums[i] *= 2;
                sumaPares += sumaDigitos(nums[i]);
            } else {
                sumaImpares += nums[i];
            }
        }
        
        System.out.println((sumaPares + sumaImpares)%10==0 ? "YES" : "NO");
        
    }

    static int sumaDigitos(int a) {
        int suma = 0;

        if(a<=9) {
            return a;
        }

        while(a!=0) {
            suma += a%10;
            a/=10;
        }

        return suma;
    }
}