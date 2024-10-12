package org.IP.sesion01;

public class ejerciciodistancia {

	public static void main(String[] args) {
		// vamos a hacer un programa que calcule la distancia entre dos coordenadas x e y al orgen 
		// los puntos son (3,4) ; (5,12) y (2,1) 
		double x0 = 0 ;
		double y0 = 0 ; 
		double x1= 3; 
		double y1 = 4;
		double x2=5;
		double y2 = 12; 
		double x3= 2 ; 
		double y3= 1; 
		
		double distancia1= Math.sqrt((Math.pow(x1-x0, 2.0)+Math.pow(y1-y0, 2.0)));
		System.out.println("la distancia del punto (3,4) al origen es igual a " + distancia1);
		System.out.println();
		double distancia2= Math.sqrt((Math.pow(x2-x0, 2.0)+Math.pow(y2-y0, 2.0)));
		System.out.println("la distancia del punto (5,12) al origen es "+ distancia2);
		System.out.println();
		double distancia3= Math.sqrt((Math.pow(x3-x0, 2.0)+Math.pow(y3-y0, 2.0)));
		System.out.println("La distancia del punto(2,1 al origen es "+ distancia3);
		
		
	}

}
