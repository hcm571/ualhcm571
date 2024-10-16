package org.IP.sesion02;


public class Ecuacionsegundogradoargumentos {

	public static void main(String[] args) {
		int a =0;
		int b = 0; 
		int c = 0 ; 
		 a = Integer.parseInt(args [0]);
		 b = Integer.parseInt(args [1]);
		 c = Integer.parseInt(args [2]);
		 
		 System.out.println("Los valores de los argumentos son : " +a + " , " + b + " , "+ c );
		 
			double x1 =0 ;
			double x2 = 0;
		
			// Definimos el algoritmo de la ecuacion de segundo grado para aquellos casos que 
			// sabemos que no nos va a dar problemas en cuanto a la existencia de soluciones
			System.out.println(" SOLUCION A UNA ECUACION DE SEGUNDO GRADO ");
			System.out.println("Valores de los coeficientes : ");
			System.out.println("a = " + a + ", b = "+ b + ", c =" + c);
			if (a==0 ){
				System.out.println("la ecuacion no es una ecuacion de segundo grado");
			}else if (Math.pow(b, 2.0)<(4*a*c)){
				System.out.println("La ecuacion no tiene soluciones Reales");
			}else  {
				x1 = ((-b + (Math.sqrt(Math.pow(b, 2)-(4*a*c))))/2*a);
				x2 = ((-b -(Math.sqrt(Math.pow(b, 2)-(4*a*c))))/2*a);
				System.out.println("Las raíces de la ecuacion son:");
				System.out.println("x1 =  "+ x1);
				System.out.println("x2 =  "+ x2);
			}

		}



	}


