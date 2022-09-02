/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
 */
package guia.javaintro.ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero entero");
        int num = leer.nextInt();
        
        int doble = num*2;
        int triple = num*3;
        double raizcuadrada = Math.sqrt(num);
        
        System.out.println("El doble del numero es: "+doble);
        System.out.println("El el triple del numero es: "+triple);
        System.out.println("La raiz cuadrada del numero es: "+raizcuadrada);
        
    }
    
}

