package ejercicios;

import java.util.Scanner;

/**
 * 5.2. Programa que presente un menú y permita calcular repetidas veces a) el
 * área de círculo –necesitará el radio- , b) el área de cuadrado –necesitará el
 * lado - , c) el área de triángulo –necesitará base y altura – d) Salir. Usar
 * funciones para cada una de las 3 opciones.
 */

public class Ejercicio2 {
    static boolean ladoNegativo(float i) {
        boolean negativo = false;
        if (i < 0)
            negativo = true;
        return negativo;
    }

    static float areaCirculo(float i) {
        float circulo = -1;
        if (!ladoNegativo(i))
            circulo = (float) (3.1416 * (i * i));
        return circulo;
    }

    static float areaCuadrado(float i) {
        float cuadrado = -1;
        if (!ladoNegativo(i))
            cuadrado = (float) Math.pow(i, 2);
        return cuadrado;
    }

    static float areaTriangulo(float i, float j) {
        float triangulo = -1;
        if (!ladoNegativo(i) && !ladoNegativo(j))
            triangulo = (i * j) / 2;
        return triangulo;
    }

    static char leeCaracter(String cadena) {
        char caracter;
        cadena = cadena.toLowerCase();
        if (cadena.equals("salir"))
            cadena = "exit";
        if ((!cadena.equals("circulo")) && (!cadena.equals("square")) && (!cadena.equals("exit"))
                && (!cadena.equals("triangulo")))
            cadena = "404";
        caracter = cadena.charAt(0);
        return caracter;
    }

    static void intro() {
        System.out.printf("%nBienvenido a cálculos mitimáticos%n");
        System.out.println("\n'Circulo': Calcula el área del círculo");
        System.out.println("'Square': Calcula el área del cuadrado");
        System.out.println("'Triangulo': Calcula el área del triángulo");
        System.out.println("'Exit': Sale del menú");
    }

    static void error() {
        System.out.println("Error!! Los parámetros introducidos no son válidos");
    }

    public static void menu() {
        Scanner teclado = new Scanner(System.in);
        String cadena = "";
        float i = 0;
        float j = 0;
        char caracter;
        do {
            intro();
            System.out.println("\nQué vamos a hacer?");
            cadena = teclado.nextLine();
            caracter = leeCaracter(cadena);
            switch (caracter) {
                case 'c':
                    System.out.print("Introduce el radio del círculo: ");
                    i = Float.parseFloat(teclado.nextLine());
                    if (areaCirculo(i) != -1)
                        System.out.printf("%nEl área del círculo de radio %.2f es igual a: %.2f %n", i, areaCirculo(i));
                    else
                        error();
                    break;
                case 's':
                    System.out.print("Introduce el lado del cuadrado: ");
                    i = Float.parseFloat(teclado.nextLine());
                    if (areaCuadrado(i - 1) != -1)
                        System.out.printf("%nEl área del cuadrado de lado %.2f es igual a: %.2f", i, areaCuadrado(i));
                    else
                        error();
                    break;
                case 't':
                    System.out.print("Introduce la base del triángulo: ");
                    i = Float.parseFloat(teclado.nextLine());
                    System.out.print("%nIntroduce la altura del triángulo: ");
                    j = Float.parseFloat(teclado.nextLine());
                    if (areaTriangulo(i, j) != -1)
                        System.out.printf("%nEl área del cuadrado de base %.2f y altura %.2f es igual a: %.2f", i, j,areaTriangulo(i, j));
                    else
                        error();
                    break;
                case 'e':
                    System.out.printf("%nOh, ya te vas?%nEspero volver a verte pronto!");
                    break;
                default:
                    System.out.println("%nOh vaya! Algo no ha ido como debería, saliendo del programa.");
                    caracter = 'e';
                    break;
            }
        } while (caracter != 'e');

        teclado.close();
    }

    public static void main(String[] args) {
        menu();
    }
}
