
package boletin1_3;

import java.util.Scanner;


public class Boletin1_3 {

    
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);  //Importar libreria de Scanner
        double dolares, euros, cambio;
        System.out.println("Introduzca euros");
        euros=ler.nextDouble(); //solicitar la introducción del dato euros
        System.out.println("introduzca cambio");
        cambio=ler.nextDouble(); //solicitar la introducción del dato cambio
        dolares=euros*cambio;
        System.out.println("Dolares=" + dolares +"$");
        // TODO code application logic here
    }
    
}
