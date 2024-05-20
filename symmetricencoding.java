//                     pvtoari
//    .,, ,,,,,,,,.......................,,,,,,,,   
//  ,,,  .                      ..,,,.  .. ..... ,, 
//     ...              ..%,.           ...,,,...,, 
//  ,,,                 ,,(((                ,   ,, 
//  ,,               ,,,     %%%                 ,, 
//  ,,              ,,,.       %%%               .. 
//  ..          *%((,((.        ..(,,            .. 
//  ..            ((,..(..     .,,,              .. 
//  ..               %%,((%,.(((                 .. 
//  ..                 (%%(**%%                  .. 
//  ..               (((..%((,,%                 .. 
//  ..            ,,,..    ..((,..(              .. 
//  ..          .,((.        ..(,,(%%            .. 
//  ..              %%%      ..,,,               .. 
//  ,,               ..%//.,,,,                  ,, 
//  ,,   ,              (((,,                   ,,, 
//  ,,...,,,...         ..%,.                ...    
//  ,, ..... .. ..,,,..                      .  ,,, 
//    ,,,,,,,........................,,,,,,,, ,,.   
//
//En mi sueño vi vuestros pasos acercarse. En mi sueño, quise hablaros y presentarme. 
//Guardián del Milagro, y del Milagro, estandarte, con gran dolor cargo el símbolo del Padre. 
//Soy las manos de piel de sangre, soy los ojos por los que mira nuestra Madre. 
//Más nada sé de vos, nada que no sea vuestro frío rostro sin nombre. 
//Que no sean vuestros callos y vuestros cortes. 
//Que no sea el luto de vuestras muertes.

//No. Nada sé de vos, solo el Milagro sabe. Ahora, que tu espada llena de culpa, con la mía llena de oros, choque. 
//Deja que se duelan y en procesión marchen.

//¡Por siempre os maldigo en el nombre! ¡Por siempre os bendigo... en la muerte!

import java.util.Arrays;
import java.util.Scanner;

public class symmetricencoding {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int n = kbd.nextInt();

        solveTestCases(n, kbd);
    }

    public static String solve(Scanner sc) {
        int length = sc.nextInt();
        String input = sc.next();
        String auxString = nrcSubsequence(input);

        char[] auxChars = auxString.toCharArray();
        Arrays.sort(auxChars);

        char[] chars = input.toCharArray();
        
        for(int i = 0; i < length; i++) {
            for(int j = 0; j < auxChars.length; j++) {
                if(chars[i] == auxChars[j]) {
                    chars[i]= auxChars[auxChars.length-j-1];
                    break;
                }
            }
        }

        return new String(chars);
    }

    static void solveTestCases(int n, Scanner sc) {
        for(int i = 0; i < n; i++) {
            System.out.println(solve(sc));
        }
    }

    static String nrcSubsequence(String s) {

        String res = String.valueOf(s.charAt(0));
        for(int i = 1; i < s.length(); i++) {
            String casted = String.valueOf(s.charAt(i));
            
            if(!res.contains(casted)) {
                res+=casted;
            }
        }

        return res;
    }

    static boolean isSubstring(String s, String sub) {
        return s.indexOf(sub) != -1;
    }
}