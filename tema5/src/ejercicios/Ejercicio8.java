package ejercicios;

import java.util.Scanner;

/**
 * 5.8. Realizar un programa al que se le introduzcan dos números enteros
 * positivos y nos diga cuál de los dos tiene más divisores (usar función
 * previa).
 */

public class Ejercicio8 {
    static int compararDivisores(int numero1, int numero2) {
        int masDivisores = 0;
        if (Ejercicio6.cantidadDivisores(numero1) > Ejercicio6.cantidadDivisores(numero2))
            masDivisores = numero1;
        else
            masDivisores = numero2;

        return masDivisores;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, numero1;
        System.out.println("Introduce dos números y te diré cual tiene más divisores:");
        numero = teclado.nextInt();
        System.out.println();
        numero1 = teclado.nextInt();
        System.out.println("De ambos números tiene más divisores el número "+compararDivisores(numero, numero1));
        teclado.close();
    }
}
