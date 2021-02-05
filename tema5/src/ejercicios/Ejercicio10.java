package ejercicios;

/**
 * 5.10. Este código es erróneo ¿Qué mostraría por pantalla? ¿Por qué?
 */

public class Ejercicio10 {
    static float ingresar(float saldo, float increm) {
        return saldo + increm;
    }

    public static void main(String[] args) {
        float saldo = 500f;
        saldo = ingresar(saldo, 400f);
        if (ingresar(saldo, 400f) > 1000f)
            System.out.println("Ya tienes más de 1000 euros: " + saldo);
        else
            System.out.println("No tienes más de 1000 euros: " + saldo);
    }
}
