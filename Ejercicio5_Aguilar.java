
package com.mycompany.semana1_ejerciciostareaaguilar.Ejercicios;

import java.util.Scanner;

public class Ejercicio5_Aguilar {

    public static void main(String[] args) {
        Scanner Lector = new Scanner(System.in);
        double n1, n2, n3, suma, promedio, raizCuadrada;

        System.out.println("Ingrese el primer numero:");
        n1 = Lector.nextDouble();

        System.out.println("Ingrese el segundo numero:");
        n2 = Lector.nextDouble();

        System.out.println("Ingrese el tercer numero:");
        n3 = Lector.nextDouble();

        
        suma = n1 + n2 + n3;
        promedio = suma / 3;
        raizCuadrada = Math.sqrt(suma);

        System.out.println("La suma de los numeros es: " + suma);
        System.out.println("El promedio de los numeros es: " + promedio);
        System.out.println("La raiz cuadrada de la suma es: " + raizCuadrada);
    }
    
}
