package org.IP.sesion01;

import java.util.Scanner;

public class ejerciciocircunferenciaentrada {

	public static void main(String[] args) {
		double radio;
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduzca el radio de la circunferencia");
		 radio = teclado.nextDouble();
		
		double longitud = 2.0 * Math.PI * radio;
		double area = Math.PI * Math.pow(radio, 2.0);
		
		System.out.println("Radio = " + radio);
		System.out.println();
		System.out.printf("Perimetro de la circunferencia = %.3f", longitud);
		System.out.println();
		System.out.printf("Area de la circunferencia = %.3f", area);
		System.out.println();
		teclado.close();
	}

}
