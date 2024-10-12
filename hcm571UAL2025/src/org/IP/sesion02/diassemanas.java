package org.IP.sesion02;

import java.util.Scanner ;

public class diassemanas {

	public static void main(String[] args) {
		
		int numero ;
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduzca un numero del 1 al 7");
		numero = entrada.nextInt();
		entrada.close();
		
		if (numero == 1 ) {
			System.out.println("Lunes ");
		} else if (numero == 2) {
			System.out.println("Martes");
		} else if ( numero == 3 ) {
			System.out.println("Miercoles");
		} else if (numero == 4 ) {
			System.out.println("Jueves");
		} else if (numero == 5) {
			System.out.println("Viernes");
		} else if (numero == 6) {
			System.out.println("Sabado");
		} else if (numero == 7) {
			System.out.println("Domingo");
		}else { 
			System.out.println("Error.Introduzca un valor valido del 1 al 7");
		}
		}
		

	}

