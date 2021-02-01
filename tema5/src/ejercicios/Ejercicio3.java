package ejercicios;

import java.util.Scanner;

/**
 * 5.3. Hacer una función llamada CalcularDiasMes que se le pase como parámetro
 * un año y un mes y devuelva los días que tiene ese mes, teniendo en cuenta los
 * anos bisiestos. A continuación, realizar un programa al que se le introduzca
 * una fecha y nos informe de los días pasados desde el 1 de enero de ese año
 * (no usar clases Java de fechas).
 */
public class Ejercicio3 {
    static int dia; 
    static int mes;
    static int ano;
    static boolean esBisiesto (int ano){
        boolean bisiesto = false;
        if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0)
            bisiesto=true;
        return bisiesto;
    }
    static int calcularDiasMes (int ano, int mes){
        int dias = 0;
        switch (mes){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dias = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dias = 30;
                break;
            case 2:
                if (esBisiesto(ano))
                    dias = 29;
                else
                    dias = 28;
                break;
            default: System.out.println("Error! Algo no ha ido como debería.");
        }
        return dias;
    }
    static void troceaFecha (String fecha){
        dia=Integer.parseInt(fecha.substring(0,fecha.indexOf("/")));
        mes=Integer.parseInt(fecha.substring(fecha.indexOf("/")+1, fecha.lastIndexOf("/")));
        ano=Integer.parseInt(fecha.substring(fecha.lastIndexOf("/")+1));
    }

    static int contarDias (String fecha){
        int dias = 0;
        troceaFecha(fecha);
        for (int i = 1; i <= mes ; i++) {
            if (i==mes){
                for (int j = 1; j < dia; j++) {
                    dias++;
                }
            }else{
                dias=calcularDiasMes(ano, i);
            }
        }
        return dias;
    }
    public static void main(String[] args) {
        String fecha = "";
        Scanner teclado = new Scanner (System.in);
        System.out.print("Introduce una fecha (DD/MM/AAAA): ");
        fecha=teclado.nextLine();
        System.out.printf("%nHan pasado %d días desde el 1 de enero de ese año",contarDias(fecha));
        teclado.close();
    }
}
