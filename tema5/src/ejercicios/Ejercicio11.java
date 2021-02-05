package ejercicios;

/**
 * 5.11. ¿Qué mostraría este código por pantalla? ¿Por qué?
 */
public class Ejercicio11 {
    public static void main(String[] args) {
        float saldo = 500f;
        ingresar(saldo, 600f);
        if (saldo > 1000f)
            System.out.println("Ya tienes más de 1000 euros: " + saldo);
        else
            System.out.println("No tienes más de 1000 euros: " + saldo);
    }

    static void ingresar(float saldo, float increm) {
        saldo += increm;
    }
}
