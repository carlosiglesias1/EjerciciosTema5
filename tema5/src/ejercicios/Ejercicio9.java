package ejercicios;

/**
 * 5.9. El siguiente programa tiene una variable global llamada saldo sobre la
 * que se ejecutan las funciones ingresar() y retirar() que aumentan y reducen
 * el saldo respectivamente, no pudiendo quedar el saldo por debajo
 * de cero. ¿Hay algún error? ¿Cuánto vale la variable saldo al finalizar la
 * ejecución del programa?
 */

public class Ejercicio9 {
    public float saldo = 0;

    public void ingresar(float cantidad) {
        saldo += cantidad;
    }

    public void retirar(float cantidad) {
        if (saldo-cantidad>=0)
            saldo -= cantidad;
        else
            System.out.println("Error, no puedes sacar más dinero del que tienes.");
    }
}
