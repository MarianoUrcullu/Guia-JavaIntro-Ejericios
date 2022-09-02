/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
package guia.javaintro.ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una frase");
        String frase = leer.next();
        frase = frase.toUpperCase();
        
        System.out.println("La frase que ingresaste en mayuscula es: "+frase);
        
        frase = frase.toLowerCase();
        
        System.out.println("La frase que ingresaste en minuscula es: "+frase);
        
    }
    
}
