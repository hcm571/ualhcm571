package org.IP.sesion01;

public class Ejerciciocircunferencia {

	public static void main(String[] args) {
	double radio = 4.5;
	double altura = 10;
	double perimetro = Math.PI * 2 * radio ;
	double area = Math.PI * 2 * Math.pow(radio, 2.0);
	double volumenesfera = (4/3) * Math.PI * Math.pow(radio, 3.0);
	double volumencilindro = area * altura;
	
	System.out.printf("El perimetro de la circunferencia es igual a "+ perimetro);
	System.out.println();
	System.out.println("El área de la circunferencia es "+ area );
	System.out.println();
	System.out.println("El volumen de la esfera es "+ volumenesfera);
	System.out.println();
	System.out.println("el volumen del cilindro con el radio y la altura indicado es "+ volumencilindro);
	

	}

}
