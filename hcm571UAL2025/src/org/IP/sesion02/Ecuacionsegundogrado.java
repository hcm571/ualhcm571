package org.IP.sesion02;

import java.util.Scanner;

public class Ecuacionsegundogrado {

	public static void main(String[] args) {
	 double  a , b , c  ;
	 
		Scanner entrada = new Scanner(System.in);
		System.out.println("introduzca el valor a (coeficiente x^2)");
		a = entrada.nextDouble();
		System.out.println("introduzca el valor b (coeficiente de x)");
		b= entrada.nextDouble();
		System.out.println("introduzca el valor c (termino independiente)");
		c=entrada.nextDouble();
		System.out.println();
		
		entrada.close();
		double x1 =0 ;
		double x2 = 0;
	
		// Definimos el algoritmo de la ecuacion de segundo grado para aquellos casos que 
		// sabemos que no nos va a dar problemas en cuanto a la existencia de soluciones
		System.out.println(" SOLUCION A UNA ECUACION DE SEGUNDO GRADO ");
		System.out.println("Valores de los coeficientes : ");
		System.out.println("a = " + a + ", b = "+ b + ", c =" + c);
		if (a==0 ){
			System.out.println("la ecuacion no es una ecuacion de segundo grado");
		}else if (Math.pow(b, 2.0)<(4*a*c)){
			System.out.println("La ecuacion no tiene soluciones Reales");
		}else  {
			x1 = ((-b + (Math.sqrt(Math.pow(b, 2)-(4*a*c))))/2*a);
			x2 = ((-b -(Math.sqrt(Math.pow(b, 2)-(4*a*c))))/2*a);
			System.out.println("Las raíces de la ecuacion son:");
			System.out.println("x1 =  "+ x1);
			System.out.println("x2 =  "+ x2);
		}

	}

}
