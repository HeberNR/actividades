package ejercicios;

import java.util.Scanner;
import java.util.logging.Logger;

public class Ejercicio5 {

    static public final Logger LOG =
            Logger.getLogger(Ejercicio5.class.getName());

    /*
    Ejercicio 5: Vector de Números
    Realizar un programa que defina un vector llamado “vectorNumeros” de 10 enteros, a continuación lo inicialice con
    valores aleatorios (del 1 al 10) y posteriormente muestre en pantalla cada elemento del vector junto con su cuadrado y su cubo.
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vectorNumeros = new int[10];
        int[] cuadradoNumeros = new int[vectorNumeros.length];
        int[] cuboNumeros = new int[vectorNumeros.length];

        for (int i = 0; i < vectorNumeros.length; i++) {
            vectorNumeros[i] = (int) (Math.random() * 10) + 1;
            cuadradoNumeros[i] = (int) Math.pow(vectorNumeros[i], 2);
            cuboNumeros[i] = (int) Math.pow(vectorNumeros[i], 3);

            LOG.info("El número es " + vectorNumeros[i]
                    + " | Cuadrado: " + cuadradoNumeros[i]
                    + " | Cubo: " + cuboNumeros[i]);
        }


    }
}
