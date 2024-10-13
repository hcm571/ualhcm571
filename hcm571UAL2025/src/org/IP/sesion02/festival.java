package org.IP.sesion02;

import java.util.Scanner;
public class festival {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca el tipo de entrada :dia, abono o VIP)");
		String tipodeentrada = entrada.nextLine();
		System.out.println("Indique si es estudiante escribiendo estudiante, en caso negativo, pulse enter");
		String estudiante = entrada.nextLine();
		System.out.println("Escriba si necesita parking escribiendo parking, en caso negativo pulse enter ");
		String parking = entrada.nextLine();
		System.out.println("Escriba si quiere camping escribiendo camping, en caso negativo pulse enter ");
		String camping =  entrada.nextLine();
		System.out.println("Introduzca la edad ");
		double edad = entrada.nextDouble();
		System.out.println("Introduzca los dias naturales que quedan para el festival: ");
		int dias = entrada.nextInt();
		
		System.out.println("Si saca la entrada en grupo, escriba grupo :");
		String grupo = entrada.nextLine();
		
		entrada.close();
		
	        double precioinicial =0;
	        double suplementoparking =0;
	        double suplementocamping=0 ;
	        double precio =0;
	        
		 
	        System.out.println("========================================");
	        System.out.println("             Festival greebeach         ");
	        System.out.println("                15-17 Julio             ");
	        System.out.println("========================================");
	        System.out.println();
	        System.out.println("Tarifas del festival: ");
	        System.out.println("Entrada de un dia : 50,00€");
	        System.out.println("Abono 3 dias : 120€");
	        System.out.println("Entrada VIP: 150€");
	        System.out.println("Descuento menores: 20%");
	        System.out.println("Descuento estudiantes: 15%");
	        System.out.println("Descuento jubilados: 10%");
	        System.out.println("Descuento grupo: 5%");
	        System.out.println("Descuento entrada anticipada: 10%");
	        System.out.println("");
	        System.out.println("========================================");
	        System.out.println("caso de uso: Cálculo de la entrada ticket");
	        System.out.println("");
	        System.out.println("");
	        System.out.println("==================TICKET================");
	        System.out.println("");
	        
	        
	        
	        
	        
	        
	        
		// AQUI SE SELECCIONARA EL TIPO DE ENTRADA QUE COGEMOS ASI COMO ENSEÑAREMOS EL PRECIO DEL FESTIVAL// 
	        
		if (tipodeentrada.equals("dia")){
			precioinicial = 50 ;
			}
		else if (tipodeentrada.equals("abono")) {
			precioinicial = 120 ;
		} else if (tipodeentrada.equals("VIP")) {
			precioinicial = 150 ;
		}else {
			System.out.println("el tipo de entrada es incorrecto, revise las mayúsculas y los caracteres");
			precioinicial = 0;
		}
		System.out.println("la entrada elegida es " + entrada );
		
		
		// AQUI SE SELECCIONARA SI LA ENTRADA TIENE PARKING O CAMPING Y SE SUMARA AL PROCESO DICIENDO EL PRECIO INICIAL FINAL //
		
		 if (parking.equals("parking")) {
	            suplementoparking = 10;
	            System.out.println("Suplemento de parking");
	            
	        }
	        
	    // Determinación del suplemento por camping
	        if (camping.equals("camping")) {
	            suplementocamping = 20;
	            System.out.println("Suplemento de camping ");
	        }
	        
	    // Cálculo del precio total sin descuentos
	        precio = precioinicial + suplementoparking + suplementocamping;
	        
	    // AHORA CALCULAMOS SI EXISTE ALGUN DESCUENTO EN EL PRECIO EN BASE DE LOS DESCUENTOS ESTABLECIDOS POR EL FESTIVAL//
	        
	        System.out.println("El precio sin descuentos: " + precio + "€");
		
		if (edad < 0  ) {
			System.out.println("introduzca una edad valida");
			precio = 0 ;
		}
		else if (edad <18 ) { 
		precio = (precio * 0.8) ; 
		System.out.println("Por ser estudiante, se queda un descuento del 20% siendo el precio igual a " + precio + "€");
	}  
	    else if (edad >18 && edad <65){
		System.out.println("El precio de su entrada es de " + precio + "€");
	}   else   {
		precio = (precio * 0.9 );
		System.out.println("se puede beneficiar de un 10% de descuento por ser mayor de 65 años siendo su precio ahora de " + precio + "€");
	}   
		
	if ( tipodeentrada.equals("estudiante" )) {
		precio = (precio*0.85);
	} 
	if (tipodeentrada.equals("grupo")) {
		precio = precio *0.95 ;
	}
	
	if (dias >= 30 ) {
		precio = (precio * 0.9 );
		System.out.println("El precio de su abono, por su compra anticipada, ahora es de " + precio + "€");
	}
	
	System.out.println("Precio final = "+ precio);
	System.out.println("========================================");
	}

}
