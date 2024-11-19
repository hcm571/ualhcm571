package org.IP.sesion04;

import java.util.Scanner;
public class Estadistica {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in );
		int programa =0 ;
		int aleatorio[]=null; 
		int arraymanual[]= null;
while (true) {
		
		System.out.println("Menú:");
		System.out.println("1.Cargar datos aleatoriamente:");
		System.out.println("2.Cargar datos manualmente:");
		System.out.println("3.Visualizar datos:");
		System.out.println("4.Operaciones a realizar:");
		System.out.println("5.Salir:");
		System.out.println("Seleccione una opcion:");
		
		programa=entrada.nextInt();

		
		
		switch(programa) {



		case 1 : 
			int tamaño=0;
			int N =0;
			System.out.println("Introduce el tamaño del array:");
			tamaño = entrada.nextInt();
			System.out.println("Introduce el tamaño de la muestra de numeros aleatorios (N)");
			N = entrada.nextInt();
			// Cargar datos aleatoriamente (Queremos hacer un programa que haga un array de un tamaño determinado y con unos valores aleatorios: 
			aleatorio  = new int[tamaño];

			for (int i=0 ; i<aleatorio.length;i++) {
				aleatorio[i]=(int) (Math.random() * N); // He definido N como naturales como int N = 0
				System.out.printf("%-5d", aleatorio[i] );
			}
			
		
		break;
		
		case 2 : 
			System.out.println("Introduzca el tamaño del array de datos ");
			int n = 0 ;
			n=entrada.nextInt() ;
			System.out.println("introduzca los valores del array de tamaño n: ");
			arraymanual = new int[n];
			
			for (int i=0; i<n ; i++) {
				arraymanual[i]=entrada.nextInt();

			}
			for (int i=0; i<arraymanual.length; i++) {
				 System.out.println("dato" + (i+1) +"  :" + arraymanual[i] );
							}
			break;
			
		case 3 : 
			// Visualizacion de datos: Esta opcion carga el ultimo array introducido 
			 if (aleatorio != null) {
                 System.out.println("Datos cargados aleatoriamente:");
                 for (int i = 0; i < aleatorio.length; i++) {
                     System.out.print(aleatorio[i] + "\t");
                 }
                 System.out.println();
             } else if (arraymanual != null) {
                 System.out.println("Datos cargados manualmente:");
                 for (int i = 0; i < arraymanual.length; i++) {
                     System.out.println("Dato " + (i + 1) + ": " + arraymanual[i]);
                 }
             } else {
                 System.out.println("No hay datos cargados. Por favor, cargue los datos primero.");
             }
             break;
		case 4:
			//Calculo de la media, la varianza y la desviacion estandar 
			
			double suma = 0; 
			double media ;
			double varianza =0;
			System.out.println("operaciones a realizar:");
			System.out.println("1. Calcular la media:");
			System.out.println("2.calcular la varianza:");
			System.out.println("3.Calcular la desviación estandar");
			System.out.println("4.Volver al menu anterior");
			System.out.println("seleccione una opcion");
			int x = entrada.nextInt(); 
			
			if (aleatorio != null & (x== 1|| x==2|| x==3)) {
				for (int i =0; i<aleatorio.length; i++) {
					suma += aleatorio[i];
				}
				media = (suma / aleatorio.length);
				
				for (int i=0 ; i<aleatorio.length ; i++) {
					varianza += Math.pow((aleatorio[i] - media),2); 
				}
				varianza = varianza / aleatorio.length;
				
				double desviacionestandar = Math.sqrt(varianza);
				if (x==1) {
					System.out.println("La media es igual a " + media);
				}else if (x==2) {
					System.out.println("La varianza es igual a "+ varianza);
				}else if (x==3) {
					System.out.println("La desviacion estandar es igual a "+ desviacionestandar);
				}
	
			
				
			}else if (arraymanual != null & (x== 1|| x==2|| x==3)) {
				if (arraymanual != null ) {
					for (int i =0; i<arraymanual.length; i++) {
						suma += arraymanual[i];
					}
					media = (suma / arraymanual.length);
					for (int i=0 ; i<arraymanual.length ; i++) {
						varianza += Math.pow((arraymanual[i] - media),2); 
					}
					varianza = varianza / arraymanual.length;
					double desviacionestandar = Math.sqrt(varianza);
				if (x==1) {
					System.out.println("La media es igual a " + media);
				}else if (x==2) {
					System.out.println("La varianza es igual a "+ varianza);
				}else if (x==3) {
					System.out.println("La desviacion estandar es igual a "+ desviacionestandar);
				}
				
			}
			}else if (x ==4) {
				programa =0;
			}
			
			
		case 5: 
			System.out.println("Hasta luego");
			
		}
		
             
		}}}

	








