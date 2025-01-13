
package com.mycompany.semana1_ejerciciostareaaguilar.Ejercicios;

import java.util.Scanner;

public class Ejercicio2_Aguilar {

   
    public static void main(String[] args) {
        Scanner Lector = new Scanner(System.in);
        double n1, n2, suma, raizCuadrada, raizCubica;

        System.out.println("Ingrese el primer numero...");
        n1 = Lector.nextDouble();

        System.out.println("Ingrese el segundo numero...");
        n2 = Lector.nextDouble();
        
        suma = n1 + n2;
        
        raizCuadrada = Math.sqrt(suma);
        System.out.println("La raiz cuadrada de la suma es: " + raizCuadrada);
        
        raizCubica = Math.cbrt(suma);
        System.out.println("La raiz cúbica de la suma es: " + raizCubica);        
    }
    
}
