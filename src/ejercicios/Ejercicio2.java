package ejercicios;

import java.util.Scanner;
import java.util.logging.Logger;

public class Ejercicio2 {

    public static final Logger LOG =
            Logger.getLogger(Main.class.getName());


    public static void main(String[] args) {
        /*
        Ejercicio 2: Numero veces letra en texto
        Escribe un programa que pida al usuario que introduzca un texto y una letra. Después el programa tiene que calcular y
        presentar por pantalla, cuantas veces aparece la letra en el texto.
        Pista: Un string es un array de caracteres. Para acceder a un elemento del string, usa la función chartAt(posición).
        Por ejemplo. Si el string es “Hola Mundo”, con la sentencia text.charAt(3), recuperamos el carácter ‘a’. Recuerda que las posiciones empiezan en 0.
        */

        Scanner sc = new Scanner(System.in);
        String texto = "";
        String letra = "";
        String seguir = "si";

        do {

            int contador = 0;
            LOG.info("Por favor ingrese un texto: ");
            texto = sc.nextLine().toLowerCase();

            LOG.info("Ahora por favor ingrese una letra: ");
            letra = sc.nextLine().toLowerCase();
            char primeraLetra = letra.charAt(0);

            for (int i = 0; i<texto.length(); i++){
                if (texto.charAt(i) == primeraLetra)
                    contador++;
            }

            LOG.info(String.valueOf("La cantidad de veces que aparece la letra: " + primeraLetra + " es: " + contador));

            LOG.info("Desea continuar? (si/no)");
            seguir = sc.nextLine().toLowerCase();

        } while (seguir.equals("si"));


    }
}
