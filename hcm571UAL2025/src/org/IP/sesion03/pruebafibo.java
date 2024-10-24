package org.IP.sesion03;
import java.util.Scanner;

public class pruebafibo {


    public static void main(String[] args) {
        // Programa para obtener el término n-ésimo de la sucesión de Fibonacci.

        Scanner entrada = new Scanner(System.in);
        int f0 = 0;
        int f1 = 1;

        System.out.println("¿Hasta qué término de la sucesión de Fibonacci quiere que se muestre?");
        int n = entrada.nextInt();

        // Validación de la entrada
        if (n <= 0) {
            System.out.println("El número debe ser mayor o igual que 0.");
            return;
        } else if (n == 1) {
            System.out.println("El término de la sucesión de Fibonacci en la posición 1 es: " + f0);
            return;
        } else if (n == 2) {
            System.out.println("El término de la sucesión de Fibonacci en la posición 1 es: " + f0);
            System.out.println("El término de la sucesión de Fibonacci en la posición 2 es: " + f1);
            return;
        }

        // Inicializamos los dos primeros términos de Fibonacci
        int a = f0;  // F(1) = 0
        int b = f1;  // F(2) = 1

        // Mostramos los dos primeros términos de Fibonacci
        System.out.println("F(1) = " + f0);
        System.out.println("F(2) = " + f1);

        // Bucle para calcular y mostrar la sucesión de Fibonacci hasta el término n
        for (int i = 3; i <= n; i++) { // i comienza en 3, ya que los primeros dos términos ya fueron impresos
            int siguiente = a + b;  // F(i) = F(i-1) + F(i-2)
            System.out.println("F(" + i + ") = " + siguiente);
            a = b;  // Actualizamos 'a' para que sea F(i-1)
            b = siguiente;  // Actualizamos 'b' para que sea F(i)
        }
    }}

