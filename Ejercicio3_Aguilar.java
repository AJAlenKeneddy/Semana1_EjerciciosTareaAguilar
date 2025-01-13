
package com.mycompany.semana1_ejerciciostareaaguilar.Ejercicios;

import java.awt.BorderLayout;
import java.util.Scanner;

public class Ejercicio3_Aguilar {

   
    public static void main(String[] args) {
        Scanner Lector = new Scanner(System.in);
        double n1,porcentaje;
        
        System.out.println("Ingrese el numero...");
        n1=Lector.nextDouble();
        
        porcentaje=n1*0.4;
        System.out.println("El 40% del numero ingresado es: "+(porcentaje));
    }
    
}
