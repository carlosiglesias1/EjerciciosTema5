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
    
    static int getYear(String fecha){
        int year = 0;
        year = Integer.parseInt(fecha.substring(fecha.lastIndexOf("/")+1));
        return year;
    }

    static int getMonth(String date){
        int month = 0;
        month = Integer.parseInt(date.substring(date.indexOf("/")+1, date.lastIndexOf("/")));
        return month;
    }

    static int getDay (String date){
        int day = 0;
        day = Integer.parseInt(date.substring(date.lastIndexOf("/")+1));
        return day;
    }

    static String [] orderDate (String date1, String date2){
        //ESTA FUNCIÓN ORDENARÁ LAS FECHAS, DE TAL FORMA QUE AUNQUE EL USUARIO INTRODUZCA LAS FECHAS DEL REVÉS, EL PROGRAMA CALCULARÁ CORRECTAMENTE LOS DÍAS
        //LA FECHA MÁS GRANDE IRÁ EN LA PRIMERA POSICIÓN
        
        String date [] = new String [2];
        if(getYear(date1)>getYear(date2)||getYear(date1)==getYear(date2)&&getMonth(date1)>getMonth(date2)||getMonth(date1)==getMonth(date2)&&getDay(date1)>getDay(date2)){
            date [0] = date1;
            date [1] = date2;
        }
        else{
            date [0] = date2;
            date [1] = date1;
        }
        return date;
    }

    static int diasEntreAnos(String fecha1, String fecha2){
        int diferencia= 0;
        int ano1 = 0;
        int ano2 = 0;
        
        //OBTENGO LOS AÑOS DE AMBAS FECHAS
        ano1 = getYear(orderDate(fecha1,fecha2)[1]);
        ano2 = getYear(orderDate(fecha1, fecha2)[0]);
        
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
        dias += Ejercicio3.contarDias(orderDate(fecha, fecha1)[0])-Ejercicio3.contarDias(orderDate(fecha, fecha1)[1]);
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
        System.out.printf("Entre ambas fechas hay %d días",Math.abs(diasComprendidos(fecha, fecha1)));
        teclado.close();
    }
}
