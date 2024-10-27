package org.IP.sesion03;
import java.util.Scanner;
public class DibujarFiguras {

	public static void main(String[] args) {

		System.out.println("Menú :");
		System.out.println("1.Dibujar cuadrado.");
		System.out.println("2.Dibujar triangulo.");
		System.out.println("3.Dibujar piramide.");
		System.out.println("Seleccione una opción: ");
		int programa =0; 
		Scanner entrada = new Scanner (System.in);
		programa = entrada.nextInt();
		int tamaño ;
		char caracter ;

		while (programa==1) {
			//Aqui vamos a dibujar el cuadrado, lo primer, es encontrar los datos de tamaño de cuadrado y el caracter que vamos a pintar:
			System.out.println("introduce el tamaño del cuadrado:");
			tamaño = entrada.nextInt();
			System.out.println("Introduce el carácter para dibujar:");
			caracter = entrada.next().charAt(0);
			entrada.close();
			// Ahora vamos a configurar el bucle que nos pinte con el caracter seleccionado el cuadrado de tamaño n: 
			// El bucle consiste en hacer un bucle anidado, de forma que i itera sobre las filas y j sobre las columnas pintando (1,1), (1,2)...(4,4).

			for (int i = 0; i < tamaño; i++) {        
				for (int j = 0; j < tamaño; j++) {    
					System.out.print(caracter + " "); 
				}
				System.out.println(); // Nueva línea después de cada fila
			}

			break;

		}
		while (programa==2) {
			// Aqui vamos a dibujar un triangulo, primero solicitamos la entrada del tamaño y del caracter que usaremos para pintar: 
			System.out.println("introduce la altura del triangulo:");
			tamaño = entrada.nextInt();
			System.out.println("Introduce el carácter para dibujar:");
			caracter = entrada.next().charAt(0);
			entrada.close();

			for (int i=1; i<=tamaño; i++) {
				for (int j=1 ;j<=i; j++) {
					System.out.print(caracter + " ");

				}System.out.println();
			}
			break;
		}

		while (programa==3) {
			// Aqui vamos a dibujar un rombo hueco, primero solicitamos la entrada del tamaño y del caracter que usaremos para pintar: 
			System.out.println("introduce el tamaño del rombo:");
			tamaño = entrada.nextInt();
			System.out.println("Introduce el carácter para dibujar:");
			caracter = entrada.next().charAt(0);
			
			if (caracter %2 ==0) {
				System.out.println("introduzca un numero impar para pintar un rombo");
				return;
			}
			entrada.close();
			 int mitad = tamaño / 2;

		        // Parte superior del rombo (incluyendo la línea central)
		        for (int i = 0; i <= mitad; i++) {
		            for (int j = 0; j < mitad - i; j++) {
		                System.out.print(" ");
		            }
                    // este bucle lo que hace es pintar los espacios, para hacer el rombo, necesitamos una progresion de espacios desde 
		            // 0 hasta la mitad del rombo 
		            // Imprimir el borde del rombo
		            System.out.print(caracter); 

		            if (i > 0) {
		                // Espacios internos
		                for (int j = 0; j < 2 * i - 1; j++) {
		                    System.out.print(" ");
		                }
		                System.out.print(caracter); 
		            }

		            System.out.println(); 
		        }
		        // Parte inferior del rombo (sin incluir la linea central (IDEM ARRIBA, pero para la parte de abajo) 
		        for (int i = mitad - 1; i >= 0; i--) {
		            for (int j = 0; j < mitad - i; j++) {
		                System.out.print(" ");
		            }
		            System.out.print(caracter); 
		            if (i > 0) {
		                
		                for (int j = 0; j < 2 * i - 1; j++) {
		                    System.out.print(" ");
		                }
		                System.out.print(caracter); 
		            }

		            System.out.println(); 
		        }
		break;
	}
	}}







