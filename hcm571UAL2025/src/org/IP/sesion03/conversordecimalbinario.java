package org.IP.sesion03;
import java.util.Scanner ;
public class conversordecimalbinario {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);

		System.out.println("Menú:");
		System.out.println("1.Convertir de sistema decimal a binario.");
		System.out.println("2.Convertir de sistema binario a decimal.");
		System.out.println("3.Mostrar la tabla de conversion de sistema decimal a binario.");
		System.out.println("4.Salir.");
		System.out.println("Introduzca una opcion del 1 al 4 : ");
		int programa = entrada.nextInt();


		while(programa==1) {

			System.out.println("introduzca el numero en el sistema decimal que quiera convertir:");

			int decimal = entrada.nextInt();
			int resto ;
			String binario="" ; 


			// Aqui lo que vamos a hacer es primero calcular el resto dado que los restos en orden inverso nos dan el numero en sistema binario
			// Después lo que vamos a hacer es redefinir el numero decimal como decimal= decimal/2 , si cumple que decimal /2=0 habremos acabado.
			// En caso contrario, el programa vueve a calcular el modulo de decimal y nos sumara un resto nuevo hasta que decimla/2==0.
			do {
				resto = decimal % 2 ;
				binario = resto + binario;
				decimal = decimal / 2;

			} while (decimal>0);
			System.out.println("El numero en sistema binario es :"+ binario);
		}
		while(programa==2) {
			System.out.println("introduce un numero en sistema binario: ");
			int decimal2=0;
			// Queremos introducir lo primero un numero en el sistema binario 1010 y calcular su numero en el sistema decimal de forma que lo hacemos
			// cogiendo la posicion de cada 1 y elevandolos a 2 segun su posicion de derecha a izquierda, es decir, 1010 = 2^3 + 2^2 = 6 + 4 = 10
			// Para ello pedimos primero un numero en sistema binario, contamos su longitud y a cada 1 le calculamos su expresion y la sumamos.
			String binario2 = entrada.next();
			System.out.println("el numero en el sistema binario es igual a "+ binario2);
			int longitud = binario2.length() ;
			System.out.println("la longitud del numero es igual a " + longitud);
			for (int i=0 ;i<=longitud-1;i++ ) {
				char c = binario2.charAt(longitud - 1 - i); // Empieza desde el último carácter

				// Comprobamos  si la c  es '1'
				if (c == '1') {
					// Sumar la potencia de 2 correspondiente a la posición
					decimal2 += Math.pow(2, i);
				}else if (c != 0) {
					System.out.println("El numero no es un numero en codigo binario.");
					break;
				}  
			}

			System.out.println("El número en sistema decimal es: " + decimal2);
			break; // Rompe el bucle después de la conversión
		}	
		while(programa==3) {

			System.out.println("introduzca el numero limite de la tabla, en el sistema decimal :");


			int limite = entrada.nextInt();
			System.out.println("Decimal"+"   "+"Binario");
			System.out.println("-----------------------");

			for (int i = 0; i <= limite; i++) {
				String binario = ""; 
				int numero = i; 


				if (numero == 0) {
					binario = "0"; 
				} else {
					while (numero > 0) {
						int resto = numero % 2;
						binario = resto + binario; 
						numero = numero / 2; 
					}
				}


				System.out.printf("%d\t\t%s%n", i, binario);
			}

			entrada.close(); // Cerrar el escáner
			break;
		}

		while (programa<1| programa>3 ) {
			System.out.println ("Introduzca un numero del 1 al 3");
			programa = 0;
		}
	}
}






