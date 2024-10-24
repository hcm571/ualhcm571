package org.IP.sesion03;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		//Escribe un programa en Java Fibonacci que permita obtener el término n-ésimo de la sucesión de Fibonacci. La
		//sucesión de Fibonacci es una sucesión infinita de números naturales que comienza con los números 0 y 1 y a partir de
		//estos, cada término es la suma de los dos anteriores.
		
		Scanner entrada = new Scanner (System.in);
		int f0 = 0  ;
		int f1 = 1; 
		int a=f0; 
		int b=f1 ;
	
		System.out.println("¿Hasta que término de la sucesión de Fibonacci quiere que se muestre?");
		int n = entrada.nextInt();
		entrada.close();
		
		// El algoritmo debe de buscar el fi e ir haciendo la sucesion de fi = fi-2 + fi-1
		if (n<=0 ) {
			System.out.println("El numero debe ser mayor igual que 0");
			return;
		} else if (n==1) {
			System.out.println("El termino de la sucesión de fibonacci es f(0)" + f0);
			
			
		} else  if (n==2){
			System.out.println("El termino de la sucesion de fibonacci es f(2) = 1"  );
			System.out.println("El termino de la sucesión de fibonacci es f(1)" + f1);
		}
System.out.println("F(0) = " + f0);
System.out.println("F(1) = " + f1);
	
        for (int i=2; i <= n ; i++) {
            int siguiente = a + b;  // F(i) = F(i-1) + F(i-2)
            System.out.println("F(" + (i) + ") = " + siguiente);
            a = b;
            b = siguiente;
        }
		
		
		
	}

}
