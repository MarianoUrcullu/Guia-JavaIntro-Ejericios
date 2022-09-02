/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 */
package guia.javaintro.ejercicio10;

import java.util.Scanner;

/**
 *
 * @author Mariano
 */
public class Ejercicio10 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el limite");
        int limite = leer.nextInt();
        int num=0,suma=0;
        
        do {            
            System.out.println("Ingrese un numero");
            num = leer.nextInt();
            suma=num;
        } while (true);
        
    }
    
}
