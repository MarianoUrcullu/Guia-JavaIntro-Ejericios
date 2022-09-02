/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package guia.javaintro.ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa la temperatura actual");
        double temperatura = leer.nextDouble();
        
        double fahrenheit = 32 + (9 * temperatura / 5);
        
        System.out.println("La temperatura equivalente a Fahrenheit es: "+fahrenheit);
        
    }
    
}
