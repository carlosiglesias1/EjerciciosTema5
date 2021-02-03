package ejercicios;

/**
 * 5.5. Programa que calcule el factorial de números menores de 20. El programa
 * permite al usuario meter los números que desee y finalizará cuando meta un
 * número menor que 1 o mayor que 20. Crea las funciones que consideres útiles y
 * que puedas reutilizar en otros programas.
 */

public class Ejercicio5 {
    static boolean salir (int numero){
        boolean exit = false;
        if(numero < 1 || numero > 20)
            exit = true;
        return exit;
    }

    static int factorial (int numero){
        int resultado = 0;
        int i = numero;
        while (i != 0){
            resultado*=i;
            i--;
        }
        return resultado;
    }

    static void menu (){
        System.out.println("\n BIENVENIDO A CÁLCULO DE FACTORIALES \n");
        
        System.out.println("Introduce un número para calcular su factorial");
        
        System.out.println("");
    }

}
