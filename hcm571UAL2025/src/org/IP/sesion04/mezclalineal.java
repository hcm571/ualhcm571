package org.IP.sesion04;

import java.util.Scanner;

public class mezclalineal {

	public static void main(String[] args) {

		boolean continuar = true;
		int n=0;
		int m=0;
		int[] array1 = null;
		int[] array2 = null;

		while (continuar) {

			System.out.println("Menú:");
			System.out.println("1.Definir el tamaño de dos arrays.");
			System.out.println("2.Introducir los arrays de forma ascendente y manual.");
			System.out.println("3.Mostrar el array resultante.");
			System.out.println("4.Finalizar el programa.");
			System.out.println("5.Ayuda-Explicación de las opciones del menú.");
			System.out.println("Seleccione una opcion:");
			Scanner entrada = new Scanner (System.in);
			int programa=entrada.nextInt();

			switch(programa) {

			case 1: // Introducir el tamaño de los arrays 

				System.out.print ("Introduzca el tamaño del array numero 1: ");
				n = entrada.nextInt();
				System.out.println();
				System.out.print("Introduzca el tamaño del array numero 2: ");
				m = entrada.nextInt();
				System.out.println();
				break;

			case 2: // Introducir los arrays de forma ascendente y manual 
				array1 = new int [n];
				array2 = new int [m];
				if (n<=0 || m <=0 ) {
					System.out.println("Introduzca un valor de n y de m usando el programa 1");
				}else {

					System.out.println("introduzca los valores del primer array de forma ascendente: ");
					for(int i=0;i<array1.length;i++) {
						boolean valorvalido=false;
						while(!valorvalido) {
							array1[i]=entrada.nextInt();
							System.out.println("Introduce un valor numérico para el array mayor que: "+ array1[i]);
							if (i == 0 || array1[i] > array1[i - 1]) {
								valorvalido = true; 
							} else {
								System.out.println("Error, introduce un nuevo valor mayor o igual que" + array1[i]);
							}

						}
					}
					for (int i=0;i<array2.length;i++) {
						boolean valorvalido=false;
						while(!valorvalido){
							System.out.println("introduzca los valores del segundo array de forma ascendente: ");
							array2[i]=entrada.nextInt();
							System.out.println("Introduce un valor numérico para el array mayor que: "+ array2[i]);
							if( i==0 || array2[i]>array2[i-1]) {
								valorvalido=true;
							}else {
								System.out.println("Error, introduce un valor mayor o igual que: " + array2[i]);
							}
						}
					}
					System.out.println("Array 1:");
				}for (int i=0;i<array1.length;i++) {
					System.out.print(+array1[i]+"\t");

				}
				System.out.println();
				System.out.println("Array 2:");
				for (int i=0;i<array2.length;i++) {
					System.out.print(array2[i]+"\t");

				}
				System.out.println();
				break;


			case 3: // Mostrar el array resultante tenemos que comparar los valores de cada array e irlos colocando en orden ascendente generando un array3 
				int [] array3 =new int[n+m];
				int j=0;
				int i=0;
				int k =0;

				if (n<=0 || m <=0 ||array1==null ||array2==null) {
					System.out.println("Introduzca un valor de n y de m usando el programa 1");
				}else {
					while (i < n && j < m) {
						if (array1[i] < array2[j]) {
							array3[k++] = array1[i++];
						} else {
							array3[k++] = array2[j++];
						}
					}
					while (i < n) {
						array3[k++] = array1[i++];
					}
					while (j < m) {
						array3[k++] = array2[j++];
					}

					// Imprimir el array resultante
					System.out.print("Array combinado y ordenado: ");
					for (int num : array3) {
						System.out.print(num + " ");
					}
				}
				break;
			case 4: // Finalizar el programa 
				System.out.println("Saliendo del programa...");
				continuar=false;
				break;
			case 5:// Menu de ayuda 
				System.out.println("para un correcto uso, ejecutar y seguir las instrucciones de los programas del menu en orden:");
				System.out.println("1;2;3 y seguir en todo momento las instrucciones que salen en pantalla");
				break;


			}

		}
	}}
