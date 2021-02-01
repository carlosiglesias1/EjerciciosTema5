package ejercicios;

/**
 * 5.3. Hacer una función llamada CalcularDiasMes que se le pase como parámetro
 * un año y un mes y devuelva los días que tiene ese mes, teniendo en cuenta los
 * años bisiestos. A continuación, realizar un programa al que se le introduzca
 * una fecha y nos informe de los días pasados desde el 1 de enero de ese año
 * (no usar clases Java de fechas).
 */
public class Ejercicio3 {
    static boolean esBisiesto (int año){
        boolean bisiesto = false;
        if (año % 4 == 0 && año % 100 != 0 || año % 400 == 0)
            bisiesto=true;
        return bisiesto;
    }
    static int calcularDiasMes (int año, int mes){
        int dias = 0;
        switch (mes){
            
        }
        return dias;
    }
}
