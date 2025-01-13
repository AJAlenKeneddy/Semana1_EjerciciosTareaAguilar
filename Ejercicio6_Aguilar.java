
package com.mycompany.semana1_ejerciciostareaaguilar.Ejercicios;

import java.util.Scanner;

public class Ejercicio6_Aguilar {

   
    public static void main(String[] args) {
        
        Scanner Lector = new Scanner(System.in);
        double n1, n2, n3, n4, suma, resta;

        System.out.println("Ingrese el primer numero:");
        n1 = Lector.nextDouble();

        System.out.println("Ingrese el segundo numero:");
        n2 = Lector.nextDouble();

        System.out.println("Ingrese el tercer numero:");
        n3 = Lector.nextDouble();

        System.out.println("Ingrese el cuarto numero:");
        n4 = Lector.nextDouble();

        
        suma = n1 + n2;
        resta = n3 - n4;

        System.out.println("La suma de los dos primeros numeros es: " + suma);
        System.out.println("La resta de los dos ultimos numeros es: " + resta);

        
    }
    
}
