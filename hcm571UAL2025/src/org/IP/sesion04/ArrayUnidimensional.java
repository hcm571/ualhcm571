package org.IP.sesion04;
import java.util.Scanner;
public class ArrayUnidimensional {

	public static void main(String[] args) {

		int array []=null;
		boolean continuar = true;
		while (continuar) {

			System.out.println("Menú:");
			System.out.println("1.Introduzca un array de forma ascendente.");
			System.out.println("2.Visualizar los datos.");
			System.out.println("3.Invertir el array para ordenarlo de forma inversa.");
			System.out.println("4.Mostrar los valores maximos y minimos del array.");
			System.out.println("5.Salir:");
			System.out.println("Seleccione una opcion:");
			Scanner entrada = new Scanner (System.in);
			int programa=entrada.nextInt();



			switch(programa) {



			case 1 : 

				System.out.println("Introduce el tamaño del array");
				int n = entrada.nextInt();
				array = new int [n];
				System.out.println("Introduce un valor inicial para el array mayor que 0: ") ;
				for (int i=0; i<n;i++) {
					boolean valorValido = false;
					while (!valorValido) {
						array[i] = entrada.nextInt();
						System.out.println("Introduce un valor numérico para el array mayor que: "+ array[i]);
						
						if (i == 0 || array[i] > array[i - 1]) {
							valorValido = true; 
						} else {
							System.out.println("Error, introduce un nuevo valor mayor o igual que" + array[i]);
						}
						
					}

				}
				break;
			case 2 :
				if (array==null ) {
					System.out.println("Error, inicie el programa 1 para describir un array");
				
				}else {
				// Visualizacion del array introducido: 
				for (int i=0; i<array.length; i++) {
					 System.out.print(array[i] + "\t");
				}
				}
				System.out.println();
				break;
				
			case 3: 
				//Los ultimos seran los primeros sea como sea esto es correcto, porque ya hemos comprobado en 1 que los datos van en orden creciente.
				if (array==null ) {
					System.out.println("Error, inicie el programa 1 para describir un array");
				
				}else {
				// Visualizacion del array introducido: 
				for (int i=array.length-1 ; i>=0; i--) {
					 System.out.print(array[i] + "\t");
				}
				break;
				}
				case 4:
					// Mostrar el valor mayor y el valor menor, tenemos que recorrer el array y mostrar el valor mayor y el valor menor. 
					int arraymax=0;
					int arraymin=0;
					for (int i=0; i<array.length; i++) {
						 
						  // voy a encontrar el valor maximo del array 
						  while (array[i]> arraymax ) {
							  arraymax = array[i];
						  }
					      while (array[i]<arraymin) { 
						  arraymin=array[i];
					      }
					}
					System.out.println("El valor maximo es " + arraymax);
					System.out.println("El vamor minimo es " + arraymin);
				break;
				
				case 5: 
					System.out.println("Saliendo del programa...");
					continuar = false;
					break;
				
				
			}}}}
