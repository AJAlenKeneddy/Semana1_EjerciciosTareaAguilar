
package com.mycompany.semana1_ejerciciostareaaguilar.Ejercicios;

import java.util.Scanner;

public class Ejercicio4_Aguilar {
    public static void main(String[] args) {
        Scanner Lector = new Scanner(System.in);
        double n1, n2, n3, n4, suma, multiplicacion, media;

        System.out.println("Ingrese el primer numero...");
        n1 = Lector.nextDouble();

        System.out.println("Ingrese el segundo numero...");
        n2 = Lector.nextDouble();

        System.out.println("Ingrese el tercer numero...");
        n3 = Lector.nextDouble();

        System.out.println("Ingrese el cuarto numero...");
        n4 = Lector.nextDouble();
       
        suma = n1 + n2 + n3 + n4;
        System.out.println("La suma de dichos numeros es: " + suma);
        
        multiplicacion = n1 * n2 * n3 * n4;
        System.out.println("La multiplicación de dichos numeros es: " + multiplicacion);
        
        media = suma / 4;
        System.out.println("La media aritmética o promedio es: " + media);
        
    }
}

    

