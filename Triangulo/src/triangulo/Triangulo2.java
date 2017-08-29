package triangulo;

import java.util.Scanner;

public class Triangulo2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.printf("Determine o tamanho da figura:");
        int N = entrada.nextInt();
        int L=0, C =0;
        for(L=0;L < N;L++){
           for (C=0;C<N;C++){
               if (L<=C)
               System.out.print("* ");
                else
               System.out.print("  ");    
           } 
            System.out.println("");
        } 
               
    }
    
}
