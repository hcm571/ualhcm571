package org.IP.sesion02;
import java.util.Scanner;
public class ImpuestoIRPF {

	public static void main(String[] args) {
		double baseimponible ;
		Scanner entrada = new Scanner (System.in);
		System.out.println("introduzca la base imponible");
		baseimponible = entrada.nextDouble();
		entrada.close();
		System.out.println("La base imponible es igual a " + baseimponible);
		
		 double impuesto;

	        // Cálculo de los tramos//
	        if(baseimponible<12450) {
	        	impuesto= baseimponible*0;
	        } else if(baseimponible<= 12450) {
	            impuesto = baseimponible * 0.19;
	        } else if (baseimponible <= 20200) {
	            impuesto = (12450 * 0.19) + ((baseimponible - 12450) * 0.24); 
	        } else if (baseimponible <= 35200) {
	            impuesto = (12450 * 0.19) + ((20200 - 12450) * 0.24) + ((baseimponible - 20200) * 0.30); 
	        } else if (baseimponible <= 60000) {
	            impuesto = (12450 * 0.19) + ((20200 - 12450) * 0.24) + ((35200 - 20200) * 0.30) + ((baseimponible - 35200) * 0.37); 
	        } else {
	            impuesto = (12450 * 0.19) + ((20200 - 12450) * 0.24) + ((35200 - 20200) * 0.30) + ((60000 - 35200) * 0.37) + ((baseimponible - 60000) * 0.47); 
	        }

	        System.out.printf("El impuesto a pagar es: %.2f €%n", impuesto); 
	    }
	}


