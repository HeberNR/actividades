package ejercicios;

import java.util.Arrays;
import java.util.logging.Logger;

public class Ejercicio10 {

    static public final Logger LOG =
            Logger.getLogger(Ejercicio10.class.getName());


    public static void main(String[] args) {

        /*
        Ejercicio 10: Rotar un array una posición a la derecha.
        Crea un programa que rote los elementos de un array de enteros una posición a la derecha.
        El último elemento pasa a la primera posición. Usar una función rotarDerecha(int[] array)
        Mostrar el array antes y después de rotar. El array puede tener valores cargados manualmente o aleatorios.
        */

        int[] nros = {1, 2, 3, 4, 5};


        LOG.info("El orden original del array es: " + Arrays.toString(nros));
        rotarDerecha(nros);
        LOG.info("El orden de los elementos rotados una posicion a la derecha es: " + Arrays.toString(nros));


    }

    static public void rotarDerecha(int[] array) {
        if (array.length == 0) return;

        int ultimoNro = array[array.length - 1];

        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }

        array[0] = ultimoNro;
    }
}


