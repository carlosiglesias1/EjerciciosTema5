package ejercicios;

import java.util.Scanner;

/**
 * 5.4. Partiendo de la función del programa anterior, hacer un programa al que
 * se le introduzcan dos fechas del mismo año y nos informe de los días
 * comprendidos entre ellas (no usar clases Java de fechas)
 */
/**
 * días = contarDias(fecha mayor)-contarDias(fecha menor)
 */
public class Ejercicio4 {
    static int diasComprendidos(String fecha, String fecha1){
        int dias = 0;
        dias = Ejercicio3.contarDias(fecha1)-Ejercicio3.contarDias(fecha);
        
        return dias;
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        String cadena = "";
        
    }
}
