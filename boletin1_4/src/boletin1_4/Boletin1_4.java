
package boletin1_4;

import java.util.Scanner;


public class Boletin1_4 {

   
    public static void main(String[] args) {
        Scanner ler= new Scanner (System.in);
        double Num1, Num2;
        System.out.println("Introduzca Num1");
        Num1=ler.nextDouble();
        System.out.println("Introduzca Num2");
        Num2=ler.nextDouble();
        System.out.println("Suma=" +(Num1+Num2)+ "\nResta=" + (Num1-Num2)+"\nProducto=" +(Num1*Num2) +"\nCociente=" + (Num1/Num2) );
        // TODO code application logic here
    }
    
}
