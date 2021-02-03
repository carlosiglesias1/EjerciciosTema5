package ejercicios;

import java.util.Scanner;

/**
 * 5.6. Realiza una función llamada cantidadDivisores al que se le pase como
 * parámetro un número entero y devuelva el número de divisores o bien cero si
 * el número es negativo. Usa dicha función en un main
 */

public class Ejercicio6 {
    static int cantidadDivisores(int numero) {
        int cantidad = 0;
        if (numero > 0) {
            for (int i = 1; i < numero / 2; i++) {
                if (numero % i == 0)
                    cantidad++;
            }
        }
        return cantidad;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = 0;
        System.out.println("Vamos a calcular la cantidad de los divisores de un número");
        System.out.print("Introduce un número: ");
        numero = teclado.nextInt();
        System.out.println("Este numero tiene " + cantidadDivisores(numero) + " divisores.");
        teclado.close();
    }
}
