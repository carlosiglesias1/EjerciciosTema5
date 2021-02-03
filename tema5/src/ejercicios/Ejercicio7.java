package ejercicios;

/**
 * 5.7. Un número primo es aquel que solo tiene como divisores el número 1 y a
 * él mismo. Usando la función del programa anterior, haz un programa que
 * muestre la suma de los números primos comprendidos entre 1 y 1000.
 */

public class Ejercicio7 {
    static boolean esPrimo (int numero){
        boolean primo = false;
        
        //SABEMOS QUE ES PRIMO SI SÓLO MARCA COMO DIVISOR EL 1
        
        if(Ejercicio6.cantidadDivisores(numero)==1)
            primo = true;
        return primo;
    }

    static int sumaPrimos (){
        int suma = 0;
        for (int i = 1; i < 1000; i++) {
            if(esPrimo(i))
                suma += i;
        }
        return suma;
    }
    public static void main(String[] args) {
        System.out.println("La suma de los 1000 primeros números primos da como resultado: " + sumaPrimos());
    } 
}
