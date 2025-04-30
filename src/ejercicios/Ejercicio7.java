package ejercicios;

import java.util.Scanner;
import java.util.logging.Logger;

public class Ejercicio7 {

    static public final Logger LOG =
            Logger.getLogger(Ejercicio7.class.getName());

    public static void main(String[] args) {
        /*
        Ejercicio 7: Días del Mes
        Crea un programa que pida un número al usuario un número de mes (por ejemplo, el 4)
        y diga cuántos días tiene (por ejemplo, 30) y el nombre del mes. Debes usar un vector.
        Para simplificarlo vamos a suponer que febrero tiene 28 días.
        */

        Scanner sc = new Scanner(System.in);
        String[] mes = {
                "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
                "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };
        int[] diasMes = {
                31, 28, 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31
        };

        LOG.info("Ingrese un numero: ");
        int mesElegido = sc.nextInt();


        for ( int i = 0; i < mes.length; i++){
            if(mesElegido >= 1 && mesElegido <= 12){
                LOG.info("El mes elegido fue: " + mes[mesElegido-1] + " y tiene " + diasMes[mesElegido-1] + " días.");
                break;
            } else {
                LOG.warning("No ingresó un número válido.");
                break;
            }
        }


    }

}
