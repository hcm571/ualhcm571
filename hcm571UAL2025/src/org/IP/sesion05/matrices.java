package org.IP.sesion05;
import java.util.Scanner;
public class matrices {

	public static void main(String[] args) {

		boolean continuar =true;
		int n=0;
		int m=0;
		int e =0;
		while (continuar == true ) {
			System.out.println("Menú de operaciones:");
			System.out.println("1. Producto por un Escalar");
			System.out.println("2. Suma de Matrices");
			System.out.println("3. Multiplicación de Matrices");
			System.out.println("4. Salir del Programa");
			System.out.println("Seleccione una opción:");
			Scanner entrada = new Scanner (System.in);
			int programa=entrada.nextInt();



			switch(programa) {

			case 1: 
				// Producto de una matriz por un escalar: 
				System.out.println("Introduzca el número de filas ");
				n=entrada.nextInt();
				System.out.println("Introduzca el número de columnas");
				m=entrada.nextInt();
				int[][]matriz1 = new int [n][m];
				for (int i = 0; i < matriz1.length; i++) {
					for (int k = 0; k< matriz1[i].length ; k++) {
						matriz1[i][k] = (int) (Math.random() * 10);}}

				System.out.println("La matriz introducida es igual a :");
				for (int i = 0; i < matriz1.length; i++) {
					for (int k = 0; k < matriz1[i].length; k++) {
						System.out.print(matriz1[i][k] + " ");
					}

					System.out.println();

				}
				System.out.println("introduzca el escalar por el que quiere multiplicar la matriz");
				e = entrada.nextInt();

				int[][] matrizfinal = new int [n][m];
				for (int i = 0; i < matriz1.length; i++) {
					for (int k = 0; k< matriz1[i].length ; k++) {
						matrizfinal[i][k] = e*matriz1[i][k];}}

				System.out.println("La matriz introducida multiplicada por  "+e+"  es igual a :");
				for (int i = 0; i < matrizfinal.length; i++) {
					for (int k = 0; k < matrizfinal[i].length; k++) {
						System.out.print(matrizfinal[i][k] + " ");
					}
					System.out.println();
				}
			case 2:
				//suma de matrices OJO tienen que ser misma dimension!! 
				System.out.println("Introduzca el número de filas de la primera matriz ");
				n=entrada.nextInt();
				System.out.println("Introduzca el número de columnas de la primera matriz");
				m=entrada.nextInt();
				System.out.println("Introduzca el número de filas de la segunda matriz ");
				int n2=entrada.nextInt();
				System.out.println("Introduzca el número de columnas de la segunda matriz");
				int m2=entrada.nextInt();
				boolean pautadesuma = true;

				if(n2!=n || m2!=m) {
					pautadesuma= false ;
					System.out.println("Error, numero de filas y columnas incorrecto para sumar 2 matrices");
					break;
				}else {


					int[][]matrizsuma1 = new int [n][m];
					for (int i = 0; i < matrizsuma1.length; i++) {
						for (int k = 0; k< matrizsuma1[i].length ; k++) {
							matrizsuma1[i][k] = (int) (Math.random() * 10);}}

					System.out.println("La primera matriz generada es igual a :");
					for (int i = 0; i < matrizsuma1.length; i++) {
						for (int k = 0; k < matrizsuma1[i].length; k++) {
							System.out.print(matrizsuma1[i][k] + " ");
						}

						System.out.println();
					}

					int[][]matrizsuma2 = new int [n][m];
					for (int i = 0; i < matrizsuma2.length; i++) {
						for (int k = 0; k< matrizsuma2[i].length ; k++) {
							matrizsuma2[i][k] = (int) (Math.random() * 10);}}

					System.out.println("La primera matriz generada es igual a :");
					for (int i = 0; i < matrizsuma2.length; i++) {
						for (int k = 0; k < matrizsuma2[i].length; k++) {
							System.out.print(matrizsuma2[i][k] + " ");
						}

						System.out.println();
					}

					int [][] sumadematrices = new int [n][m];
					for (int i = 0; i < sumadematrices.length; i++) {
						for (int k = 0; k< sumadematrices[i].length ; k++) {
							sumadematrices[i][k] = matrizsuma1[i][k]+matrizsuma2[i][k] ;}}

					System.out.println("La matriz de la suma de matrices es igual a :");
					for (int i = 0; i < sumadematrices.length; i++) {
						for (int k = 0; k < sumadematrices[i].length; k++) {
							System.out.print(sumadematrices[i][k] + " ");

						}
						System.out.println();
					}
				}
			case 3:
				System.out.println("Introduzca el número de filas de la primera matriz ");
				n=entrada.nextInt();
				System.out.println("Introduzca el número de columnas de la primera matriz");
				m=entrada.nextInt();
				System.out.println("Introduzca el número de filas de la segunda matriz ");
				int n1=entrada.nextInt();
				System.out.println("Introduzca el número de columnas de la segunda matriz");
				int m1=entrada.nextInt();
				boolean pautademultiplicacion = true;

				if(m!=n1) {
					pautadesuma= false ;
					System.out.println("Error, las filas de la matriz 1 y las columnas de la matriz 2 deben ser iguales");
					break;
				}else {
					int[][]matrizmult1 = new int [n][m];
					for (int i = 0; i < matrizmult1.length; i++) {
						for (int k = 0; k< matrizmult1[i].length ; k++) {
							matrizmult1[i][k] = (int) (Math.random() * 10);}}

					System.out.println("La primera matriz generada es igual a :");
					for (int i = 0; i < matrizmult1.length; i++) {
						for (int k = 0; k < matrizmult1[i].length; k++) {
							System.out.print(matrizmult1[i][k] + " ");
						}

						System.out.println();
					}

					int[][]matrizmult2 = new int [n1][m1];
					for (int i = 0; i < matrizmult2.length; i++) {
						for (int k = 0; k< matrizmult2[i].length ; k++) {
							matrizmult2[i][k] = (int) (Math.random() * 10);}}

					System.out.println("La segunda matriz generada es igual a :");
					for (int i = 0; i < matrizmult2.length; i++) {
						for (int k = 0; k < matrizmult2[i].length; k++) {
							System.out.print(matrizmult2[i][k] + " ");
						}

						System.out.println();
					}
					int [][] multiplicacionmatrices = new int [n][m1];
					for(int i=0 ; i<n ; i++) {
						for(int k=0; k<m1 ; k++) {
							for(int j=0; j<m; j++) {
								multiplicacionmatrices[i][k] += matrizmult1[i][j] * matrizmult2[j][k];
							}
							
						}
					}
					System.out.println("La matriz resultante es igual a :");
					for (int i = 0; i < multiplicacionmatrices.length; i++) {
						for (int k = 0; k < multiplicacionmatrices[i].length; k++) {
							System.out.print(multiplicacionmatrices[i][k] + " ");
						}

						System.out.println();
					}
				}
				
			case 4:
				System.out.println("Saliendo del programa...");
				continuar = false;
				break;

			}

		}

	}
}
