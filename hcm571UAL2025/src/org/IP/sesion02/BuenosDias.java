package org.IP.sesion02;

import java.util.Scanner;

public class BuenosDias {

	public static void main(String[] args) {

	
			int  hora , minutos ;
			
			Scanner teclado = new Scanner(System.in);
			System.out.println("introduzca la hora (0-24)");
			 hora = teclado.nextInt(); 
		    System.out.println("introduzca los minutos ");
			 minutos = teclado.nextInt(); 
			teclado.close();
			
				 if ( 6 < hora && hora < 13 ) {
				 System.out.println("Buenos dias");
				 }else if (13 < hora && hora  < 20 ){
				 System.out.println ("Buenas tardes");
				 }else   {
				 System.out.println("Buenas noches");
	}
				 
	 System.out.println("son las  "+ hora +" horas " + "con " + minutos + "  minutos" );
}}
			
