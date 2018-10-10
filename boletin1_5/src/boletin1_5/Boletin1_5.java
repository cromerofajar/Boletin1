
package boletin1_5;

import java.util.Scanner;

public class Boletin1_5 {

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        double millas;
        final double M=1852;
        System.out.println("introduzca millas");
        millas= ler.nextDouble();
        System.out.println(millas + " millas equivale a " + (millas*M)+" metros");
        
        // TODO code application logic here
    }
    
}
