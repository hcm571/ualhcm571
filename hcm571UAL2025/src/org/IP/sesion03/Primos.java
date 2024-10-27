package org.IP.sesion03;

import java.util.Scanner;

public class Primos {

	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in );
		int programa  ; 
		System.out.println("Menú:");
		System.out.println("1. Verificar si un número es primo");
		System.out.println("2. Generar listado de números primos hasta un número dado");
		System.out.println("3. Salir");
		System.out.println("Seleccione una opción: ");


		programa = entrada.nextInt(); 
		int x =0; 
		while (programa < 1 | programa >3) {

			System.out.println("Escriba un valor igual a 1, 2 ó 3 ");
			break;
		}while (programa == 1 ) {
			// Aqui vamos a calcular si un número es primo o no para ello, x debe de tener modulo 0 para y=xç
			// el programa da varias vueltas, aunque funciona adecuadamente, voy a generar una entrada que a traves de una booleana me diga si la funcion esprimo es verdadera o falsa para dar un resultado mejor. 
			System.out.println("Escriba un valor de X para calcular si es primo ");
			x = entrada.nextInt();
			boolean esprimo = true ;
			if (x<=1) {
				esprimo=false;

			}else {
				for (int i=2;i<x;i++) {
					if(x%i==0) {
						esprimo=false;	
					}
				}	
			}
			if (esprimo) {
				System.out.println("el numero "+x+" es primo.");
			}else {
				System.out.println("El numero "+x+ " no es primo.");
			}
			programa=0;
		}
		while (programa ==2 ){
			// Aqui vamos a calcular si todos los numeros primos menores que x y vamos a imprimirlos en forma de lista 
			// Lo primero es comprobar si el numero es primo o no lo es, para ello, reutilizare el bucle de la opcion 1 
			System.out.println("introduce el valor de x ");
			x= entrada.nextInt();

				System.out.println("El listado de los numeros primos menores que  "+x + " son:");
				for (int j =2 ; j<x ; j++) {
					boolean esprimomenor = true ;
					 for (int k=2;k<j ; k++) {
						 if (j%k==0) {
							 esprimomenor=false;
							 break;
						 }
					 }
					if (esprimomenor) {

						System.out.print(j +" ");
						programa=0;
					}
				}
		}
		
		while(programa ==3) {
			System.out.println("Saliendo del programa. ¡Hasta luego!");
			programa=0;
		}
	}
}




