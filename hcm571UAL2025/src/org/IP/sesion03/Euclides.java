package org.IP.sesion03;

import java.util.Scanner;
public class Euclides {

	public static void main(String[] args) {
		
	
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduzca un termino x e y con x>y");
		System.out.println("Introduzca el termino x : ");
		int x = entrada.nextInt();
		System.out.println("Introduzca el termino y : ");
		int y = entrada.nextInt();
		
		entrada.close();
		if (x<y ){
        System.out.println(" Valor incorrecto, x es menor que y");
		}      if (x < y) {
            System.out.println("Valor incorrecto, x es menor que y");
        } else {
            // Algoritmo de Euclides para encontrar el MCD
            while (y != 0) {
                int resto = x % y; // Calcular el resto
                x = y;             // Actualizar x con el valor de y
                y = resto;         // Actualizar y con el valor del resto
            }
            // Al terminar el bucle, x contiene el MCD
            System.out.println("El máximo común divisor es: " + x);
        }
    }

	}


