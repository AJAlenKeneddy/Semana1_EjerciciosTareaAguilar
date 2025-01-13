
package com.mycompany.semana1_ejerciciostareaaguilar.Ejercicios;

import java.util.Scanner;

public class Ejercicio8_Aguilar {

    public static void main(String[] args) {
        
        Scanner Lector = new Scanner(System.in);
        double base, altura, area;

        System.out.println("Ingrese la base del triangulo:");
        base = Lector.nextDouble();

        System.out.println("Ingrese la altura del triangulo:");
        altura = Lector.nextDouble();

        
        area = (base * altura) / 2;

        System.out.println("El area del triangulo es: " + area);

    }
    
}
