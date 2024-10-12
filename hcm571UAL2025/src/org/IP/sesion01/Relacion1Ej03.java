package org.IP.sesion01;

public class Relacion1Ej03 {

	public static void main(String[] args) {
	 double altura = 0.1 ;
	 double radio = 0.3 ; 
	 double densidadcarga = 1.0E-6;
	 double volumencilindro =( Math.PI * Math.pow(radio, 2.0)*altura);
	 double cargatotal = densidadcarga * volumencilindro ; 
	 System.out.println("Solución al ejercicio 3 de la relacion 1 : Relacion1Ej03");
	 System.out.println("=================");
	 System.out.println("ENUNCIADO");
	 System.out.println("3) Un cilindro de 10 cm de altura y radio de la base 3 cm tiene una densidad");
	 System.out.println("de carga volumétrica de 1UC/M^3. Calcular la carga total que almacena.");
	 System.out.println("=================");
	 System.out.println("DATOS:");
	 System.out.println("Altura=0.1 cm ");
	 System.out.println("Radio = 0.03 cm");
	 System.out.println("Densidad de carga = 1.0E-6");
	 System.out.println("=================");
	 System.out.println("SOLUCION:");
	 System.out.println("La carga total almacenada de de "+ cargatotal); 
	 System.out.println();
	 

	}

}
