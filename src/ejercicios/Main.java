package ejercicios;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {

    public static final Logger LOG =
            Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        /*Ejercicio 1: Notas  de estudiantes
        Crea un programa que muestre por pantalla la nota de un estudiante buscándola de entre una lista de estudiantes
        con sus respectivas notas. Estos datos estarían previamente cargados.
        El nombre del estudiante lo introduce el usuario por teclado (usa la clase Scanner). Usa dos arrays, uno para guardar los nombres de los estudiantes,
        y el otro para guardar las notas de los mismos.
        Ambos tendrán 5 elementos. Puedes guardar la información relacionada en ambos arrays con el mismo valor del índice.
        Por ejemplo el estudiante Pedro está en la posición 2 del array de estudiantes, su nota estaría en la posición 2 del array de notas.
        Para comparar el nombre del estudiante introducido por teclado con los nombres de los estudiantes en el array de estudiantes,
        puedes usar el método equals de la Clase String. */


        Scanner sc = new Scanner(System.in);

        String[] alumnos = {"javier", "santiago", "heber", "wilson", "hector"};
        int[] notas = {8, 9, 7, 7, 5};
        String seguir = "si";
        boolean encontrado = true;

        do {
            LOG.info("Ingrese el nombre del alumno para saber su nota: ");
            String nombre = sc.next().toLowerCase();
            encontrado = false;

            for (int i = 0; i < alumnos.length; i++) {
                if (alumnos[i].equals(nombre)) {
                    LOG.info("La nota de " + nombre + " es " + notas[i]);
                    encontrado = true;
                    break;
                }
            }

            if (!encontrado) {
                LOG.info("No se encontró al alumno: " + nombre);
            }

            LOG.info("Desea consultar por otro alumno? (si/no)");
            seguir = sc.next().toLowerCase();

        } while (seguir.equals("si"));

    }
}