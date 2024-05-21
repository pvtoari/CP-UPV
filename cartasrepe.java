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
//En mi sueño vi vuestros pasos acercarse. En mi sueño, quise hablaros y presentarme. Guardián del Milagro, y del Milagro, estandarte, con gran dolor cargo el símbolo del Padre. 
//Soy las manos de piel de sangre, soy los ojos por los que mira nuestra Madre. 
//Más nada sé de vos, nada que no sea vuestro frío rostro sin nombre. 
//Que no sean vuestros callos y vuestros cortes. 
//Que no sea el luto de vuestras muertes.
//
//No. Nada sé de vos, solo el Milagro sabe. Ahora, que tu espada llena de culpa, con la mía llena de oros, choque. Deja que se duelan y en procesión marchen.
//
//¡Por siempre os maldigo en el nombre! ¡Por siempre os bendigo... en la muerte!

import java.util.Scanner;

public class cartasrepe {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int n = kbd.nextInt(), k = kbd.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[k];

        for(int i = 0; i < n; i++) {
            arr1[i] = kbd.nextInt();
        }

        for(int i = 0; i < k; i++) {
            arr2[i] = kbd.nextInt();
        }

        String res = "";
        for(int i = 0; i < arr1.length; i++) {
            for(int j = 0; j < arr2.length; j++) {
                if(arr1[i] == arr2[j] && !res.contains(String.valueOf(arr1[i]))) {
                    res += arr1[i] + " ";
                }
            }
        }

        System.out.println(res);
    }
}