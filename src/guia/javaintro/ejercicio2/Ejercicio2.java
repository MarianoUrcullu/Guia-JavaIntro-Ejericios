/*
Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla.
 */
package guia.javaintro.ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa tu nombre");
        String nombre = leer.next();

        System.out.println("El nomnre que ingresaste es: " + nombre);

    }

}
