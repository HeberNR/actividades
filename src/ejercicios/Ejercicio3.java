package ejercicios;

import java.util.Arrays;
import java.util.logging.Logger;

public class Ejercicio3 {

    public static final Logger LOG =
            Logger.getLogger(Ejercicio3.class.getName());

    public static void main(String[] args) {

        /*
        Ejercicio 3: Invertir valores array
        Escribe un programa java que invierta el orden de los valores de un array. Al invertir el orden de los valores de un array,
        el último pasa a ser el primero, el penúltimo el segundo y así sucesivamente.
        El array está previamente  completo de valores enteros, que puede tener cualquier longitud.
        El programa primero dibujara por pantalla los elementos del array en orden y luego los elementos del array invertido.
         */


        String[] lista = {"Heber", "Javier", "Santiago", "Hector", "Wilson"};
        String texto = Arrays.toString(lista);
        LOG.info("El array original es: " + texto);

        for (int i = 0; i < lista.length / 2; i++) {
            String listaInvertida = lista[i];
            lista[i] = lista[lista.length - 1 - i];
            lista[lista.length - 1 - i] = listaInvertida;
        }

        System.out.println("El array invertido es: " + Arrays.toString(lista));


    }
}
