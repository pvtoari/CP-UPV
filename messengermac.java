public class messengermac {
    public static void main(String[] args) {
        java.util.Scanner kbd = new java.util.Scanner(System.in);

        int intput1 = kbd.nextInt(), numMsg = 0, maxT = 0, suma = 0, maxK = 0, resto = 0;

        for(int i = 0; i < intput1; i++) {
            maxK = suma = resto = 0;
            numMsg = kbd.nextInt();
            maxT = kbd.nextInt();

            int[] msgA = new int[numMsg];
            int[] msgB = new int[numMsg];

            /*for(int j = 0; j < (numMsg*2); j++) {
                if(j%2==0) {
                    msgA[j/2] = kbd.nextInt();
                } else {
                    msgB[(j-1)/2] = kbd.nextInt();
                }
            } */
            
            for (int j = 0; j < numMsg * 2; j++) {
                int indiceA = j / 2;
                int indiceB = (j - 1) / 2;
              
                if (j % 2 == 0) {
                  if (indiceA < numMsg) {
                    msgA[indiceA] = kbd.nextInt();
                  }
                } else {
                  if (indiceB < numMsg) {
                    msgB[indiceB] = kbd.nextInt();
                  }
                }
            }

            kbd.close();
            
            if(numMsg==1) {
                maxK = 1;
            } else {
                for(int k = 1; k < numMsg; k++) {
                    suma += msgA[k] + Math.abs(msgB[k]-msgB[k+1]);
                    resto = maxT - Math.abs(msgB[k-1]-msgB[k]);
                    if(suma > resto) {
                        maxK = k;
                        k = numMsg;
                    } 
                }
            }

            System.out.println(maxK);
        }

    }
}
