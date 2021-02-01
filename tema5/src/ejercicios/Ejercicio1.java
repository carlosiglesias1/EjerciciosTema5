package ejercicios;

import java.util.Random;

/* 
5.1. Realizar funciones que realicen los siguientes supuestos, y un main() desde el que se
llame a dichas funciones:
 Función llamada par() que se le pasa un entero y devuelve true si es par, false si
no lo es.
 Función llamada mayor() que se le pasan 3 double y devuelve el mayor de ellos.
 Función llamada sumaIntervalo() que le pasan dos long y devuelve otro long
con la suma de los números comprendidos entre los números pasados (el
primero es menor que el segundo, y ambos mayores que cero, en caso contrario
devuelve -1)
 Función llamada contarCeros() que se le pasa una cadena y devuelve la
cantidad de ceros que tiene.
 Función llamada aleatorio() que se le pasan dos valores enteros devuelve un
entero al azar comprendido entre esos dos valores (el primero es menor que el
segundo, y ambos mayores que cero, en caso contrario devuelve -1)
*/

public class Ejercicio1 {

    public static boolean par(int i) {
        boolean bool = false;
        if (i % 2 == 0)
            bool = true;
        return bool;
    }

    public static double mayor(double i, double j, double m) {
        double grande;
        if (i > j && i > m)
            grande = i;
        else {
            if (j > i && j > m)
                grande = j;
            else
                grande = m;
        }
        return grande;
    }

    public static long sumaIntervalo(long i, long j) {
        long suma = 0;
        if (i > j || i < 0 || j < 0)
            suma = -1;
        else {
            while (i < j) {
                i++;
                suma += i;
            }
        }
        return suma;
    }

    public static int contarCeros (String s){
        int contador = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='0') {
                contador++;
            }
        }
        return contador;
    }

    public static int aleatorio (int i, int j){
        int numero = 0;
        Random loco = new Random();
        if(i>j||i<0||j<0)
            numero=-1;
        else{
            numero = loco.nextInt(j-i+1)+i;
        }
        return numero;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

}
