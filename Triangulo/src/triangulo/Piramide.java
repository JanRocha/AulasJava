package triangulo;

import java.util.Scanner;

public class Piramide {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.printf("Determine o tamanho da figura:");
        int N = entrada.nextInt();
        int L=0, C =0;
        for(L=0;L < N;L++){
           for (C=0;C<(N *2-1);C++){
               if ((L + C >=N-1)^(C>=N+L))
               System.out.printf("* ");
                else
               System.out.printf("  "); 
<<<<<<< HEAD
            
=======
               //janailson
               
>>>>>>> 0e08ebc2f7d90ddc262129e71e7c5234f69619fa
               
           } 
            System.out.println("");
        }
               
    }
}
