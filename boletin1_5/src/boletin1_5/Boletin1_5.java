
package boletin1_5;

import java.util.Scanner;

public class Boletin1_5 {

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        double millas;
        final double m=1852;
        System.out.println("introduzca millas");
        millas= ler.nextDouble();
        System.out.println(millas + " millas equivale a " + (millas*m)+" metros");
        
        // TODO code application logic here
    }
    
}
