package ejercicios;

import com.sun.source.tree.SynchronizedTree;

import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Logger;

public class Ejercicio6 {

    public static final Logger LOG =
            Logger.getLogger(Ejercicio6.class.getName());

    public static void main(String[] args) {

        /*
        Ejercicio 6: Invertir array
        Crear un vector de 5 elementos de cadenas de caracteres, inicializa el vector con datos leídos por el teclado.
        Copia los elementos del vector en otro vector pero en orden inverso, y muéstralo por la pantalla.
         */

        Scanner sc = new Scanner(System.in);
        String[] texto = new String[5];
        String[] textoInvertido = new String[5];

        for (int i = 0; i<texto.length; i++){
            LOG.info("Ingrese una palabra: ");
            texto[i] = sc.nextLine();
        }

        for (int j = 0; j<texto.length; j++){
            textoInvertido[j] = texto[texto.length -1 -j];
        }

        LOG.info("El arreglo original es: " + Arrays.toString(texto));
        LOG.info("El arreglo invertido es: " + Arrays.toString(textoInvertido));

    }
}
