package ejercicios;

import java.util.Scanner;
import java.util.logging.Logger;

public class Ejercicio9 {

    static public final Logger LOG =
            Logger.getLogger(Ejercicio9.class.getName());

    public static void main(String[] args) {
        /*
        Ejercicio 9: Conversión de temperaturasEnunciado: Escribe un programa que permita al usuario convertir temperaturas entre Celsius y Fahrenheit.
        El programa debe incluir al menos dos funciones:
        celsiusAFahrenheit(double celsius). Formula: F=(C * 9/5) + 32
        fahrenheitACelsius(double fahrenheit) Formula: C=(F-32) * 5/9
        El usuario elige el tipo de conversión y luego introduce el valor a convertir.
         */

        Scanner sc = new Scanner(System.in);

        LOG.info("Seleccione el tipo de conversion: ");
        LOG.info("1. Celsius a Fahrenheit. | 2. Fahrenheit a Celsius.");
        int seleccion = sc.nextInt();

        LOG.info("Ingrese un valor como temperatura: ");
        double temp = sc.nextDouble();

        if (seleccion == 1) {
            LOG.info("La temperatura en Celsius de " + temp + " convertida a Fahrenheit es de: " + celsiusAFahrenheit(temp));
        } else {
            LOG.info("La temperatura en Fahrenheit de " + temp + " convertida a Celsius es de: " + fahrenheitACelsius(temp));
        }
    }

    static public double celsiusAFahrenheit(double celsius) {
        double F = (celsius * 9 / 5) + 32;
        return F;
    }

    static public double fahrenheitACelsius(double fahrenheit) {
        double C = (fahrenheit - 32) * 5 / 9;
        return C;
    }
}
