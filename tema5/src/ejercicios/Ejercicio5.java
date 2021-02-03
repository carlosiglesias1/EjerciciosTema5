package ejercicios;

import java.util.Scanner;

/**
 * 5.5. Programa que calcule el factorial de números menores de 20. El programa
 * permite al usuario meter los números que desee y finalizará cuando meta un
 * número menor que 1 o mayor que 20. Crea las funciones que consideres útiles y
 * que puedas reutilizar en otros programas.
 */

public class Ejercicio5 {
    static boolean salir(int numero) {
        boolean exit = false;
        if (numero < 1 || numero > 20)
            exit = true;
        return exit;
    }

    static int factorial(int numero) {
        int resultado = 1;
        int i = numero;
        while (i != 0) {
            resultado *= i;
            i--;
        }
        return resultado;
    }

    static void menu() {
        Scanner teclado = new Scanner(System.in);
        int numero = 4;
        System.out.println("\n BIENVENIDO A CÁLCULO DE FACTORIALES \n");

        while (!salir(numero)) {
            System.out.println("Introduce un número para calcular su factorial");
            numero = teclado.nextInt();
            if (!salir(numero)) {
                System.out.println("El factorial de "+numero+" es "+factorial(numero));
            }
        }

        teclado.close();
    }
    public static void main(String[] args) {
        menu();
    }
}
