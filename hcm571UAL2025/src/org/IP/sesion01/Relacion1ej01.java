package org.IP.sesion01;

public class Relacion1ej01 {

	public static void main(String[] args) {
	//	1. 400 millones de electrones se encuentran distribuidos en una superficie de 1 mm2.
	//	Calcular la densidad de carga superficial que suponen, en C m-2
		double numeroelectrones = 400E6;
		double cargaelectron = -1.6E-19 ; 
		double areadelasuperficie = 1E-6 ; 
		
		double Cargatotal = numeroelectrones* cargaelectron  ;
		double densidadcargasuperficial = Cargatotal / areadelasuperficie;
		 System.out.println("Solución al ejercicio 1  de la relacion 1 : Relacion1Ej01");
		 System.out.println("=================");
		 System.out.println("ENUNCIADO");
		 System.out.println("1) 400 millones de electrones se encuentran distribuidos en una superficie de 1 mm2.\r\n");
		 		
		 System.out.println("Calcular la densidad de carga superficial que suponen, en C m-2\")");
		 System.out.println("=================");
		 System.out.println("DATOS:");
		 System.out.println("numero de electrones = "+ numeroelectrones);
		 System.out.println("Carga de un electron ="+ cargaelectron);
		 System.out.println("Area de la superficie = "+ areadelasuperficie);
		 System.out.println("=================");
		 System.out.println("SOLUCION:");
		 System.out.println("La densidad de carga superficial es igual a  "+ densidadcargasuperficial); 
		 System.out.println();

	}

}
