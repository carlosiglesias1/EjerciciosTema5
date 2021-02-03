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
    
    static int obtainYear(String fecha){
        int year = 0;
        year = Integer.parseInt(fecha.substring(fecha.lastIndexOf("/")+1));
        return year;
    }
    
    static int diasEntreAnos(String fecha1, String fecha2){
        int diferencia= 0;
        int ano1 = 0;
        int ano2 = 0;
        
        //OBTENGO LOS AÑOS DE AMBAS FECHAS
        ano1 = obtainYear(fecha1);
        ano2 = obtainYear(fecha2);
        
        //Cuento los días de cada año entre los dos años
        if(ano1<ano2){
            for (int i = ano1; i < ano2; i++) {
                if(Ejercicio3.esBisiesto(i))
                    diferencia += 366;
                else
                    diferencia +=365;
            }
        }else{
            diferencia = 0;
        }
        return diferencia;
    }

    static int diasComprendidos(String fecha, String fecha1){
        int dias = 0;
        dias += diasEntreAnos(fecha, fecha1);
        dias += Ejercicio3.contarDias(fecha1)-Ejercicio3.contarDias(fecha);
        return dias;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        String fecha = "";
        String fecha1="";
        System.out.print("Introduce una fecha: ");
        fecha = teclado.nextLine();
        System.out.print("Introduce la segunda fecha: ");
        fecha1 = teclado.nextLine();
        System.out.printf("Entre ambas fechas hay: %d",diasComprendidos(fecha, fecha1));
        teclado.close();
    }
}
