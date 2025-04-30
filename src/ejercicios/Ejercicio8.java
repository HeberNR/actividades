package ejercicios;

import java.util.Scanner;
import java.util.logging.Logger;

public class Ejercicio8 {

    static public final Logger LOG =
            Logger.getLogger(Ejercicio8.class.getName());

    public static void main(String[] args) {
        /*
        Ejercicio 8: Promedio y nota más alta
        Crear un programa que contenga una función que calcule el promedio de un array de notas de estudiantes y otra función que devuelva la nota más alta.
        Cargar el array notas de forma manual con 5 valores. Mostrar en consola: el promedio y la nota más alta.
         */

        Scanner sc = new Scanner(System.in);
        int[] notas = new int[5];

        for (int i = 0; i < notas.length; i++) {
            LOG.info("Ingrese la nota por favor: ");
            notas[i] = sc.nextInt();
        }

        double promedioNotas = promedio(notas);
        int notaMayor = notaAlta(notas);

        LOG.info("El promedio del alumno es: " + promedioNotas);
        LOG.info("La nota mas alta es: " + notaMayor);


    }

    static public double promedio(int[] num) {
        int numNotas = 0;
        for (int j : num) numNotas += j;
        return (double) numNotas / num.length;
    }

    static public int notaAlta(int[] num) {
        int nota = num[0];

        for (int i = 1; i < num.length; i++) {
            if (num[i] > nota) {
                nota = num[i];
            }
        }

        return nota;
    }
}
