package org.IP.sesion01;

public class DensidadPPI {

	public static void main(String[] args) {
		double alto1 = 1920;
		double alto2 = 3840;
		double alto3 = 2340;
		double ancho1 = 1080;
		double ancho2 = 2160;
		double ancho3 = 1080;
		double diagonal1= 27;
		double diagonal2 = 32;
		double diagonal3 = 6.5;
		double PPI1 = (Math.sqrt((Math.pow(alto1, 2)+(Math.pow(ancho1, 2)))) / diagonal1);
		double PPI2 = (Math.sqrt((Math.pow(alto2, 2)+(Math.pow(ancho2, 2)))) / diagonal2);
		double PPI3 = (Math.sqrt((Math.pow(alto3, 2)+(Math.pow(ancho3, 2)))) / diagonal3);
		
		System.out.println("La densidad PPI del monitor Full HD de 27 pulgadas es "+ PPI1);
		System.out.println("La densidad PPI del monitor 4K de 32 pulgadas es "+ PPI2);
		System.out.println("La densidad PPI del dispositivo movil de 6.5 pulgadas es "+ PPI3);
		

	}

}
