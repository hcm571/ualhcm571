package org.IP.sesion01;

public class Enteroaleatorio {

	public static void main(String[] args) {
		
		// a continuacion seleccionare dentro de la funcion math random un intervalo de 31 numeros dado que 
		// La funcion me va a dar un numero aleatorio entre 0 y 30, de esta forma restandole 15 tendre un numero 
		// aleatorio entre -15 y 15 
		int numeroaleatorio = (int) (Math.floor(Math.random()*(31)-15));
		System.out.println(numeroaleatorio);

	}

}
