
package com.mycompany.semana1_ejerciciostareaaguilar.Ejercicios;

import java.util.Scanner;

public class Ejercicio7_Aguilar {

    public static void main(String[] args) {
        
         Scanner Lector = new Scanner(System.in);
        int n1, n2, resto, divisionEntera;

        System.out.println("Ingrese el primer numero:");
        n1 = Lector.nextInt();

        System.out.println("Ingrese el segundo numero:");
        n2 = Lector.nextInt();

        
        resto = n1 % n2;
        divisionEntera = n1 / n2;

        System.out.println("El resto de la division es: " + resto);
        System.out.println("La division entera es: " + divisionEntera);

        
    }
    
}
