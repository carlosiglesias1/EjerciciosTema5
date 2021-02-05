package ejercicios;

/**
 * 5.9. El siguiente programa tiene una variable global llamada saldo sobre la
 * que se ejecutan las funciones ingresar() y retirar() que aumentan y reducen
 * el saldo respectivamente, no pudiendo quedar el saldo por debajo de cero.
 * ¿Hay algún error? ¿Cuánto vale la variable saldo al finalizar la ejecución
 * del programa?
 */

public class Ejercicio9 {
    static float saldo = 0;

    protected Ejercicio9() {
    }

    static void ingresar(float cantidad) {
        saldo += cantidad;
    }

    static boolean retirar(float cantidad) {
        boolean retirada = false;
        if (saldo - cantidad >= 0) {
            saldo -= cantidad;
            retirada = true;
        } else
            System.out.println("Error, no puedes sacar más dinero del que tienes.");
        return retirada;
    }

    public static void main(String[] args) {
        ingresar(30);
        retirar(10);
        if (!retirar(10))
            System.out.println("No se puede retirar tanto");
        System.out.println("Saldo final: " + saldo);
        
        System.out.println("La variable saldo es igual a "+saldo);
    }
}
