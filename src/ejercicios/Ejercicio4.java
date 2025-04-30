package ejercicios;

import java.util.Scanner;
import java.util.logging.Logger;

public class Ejercicio4 {

    public static final Logger LOG =
            Logger.getLogger(Ejercicio4.class.getName());

    public static void main(String[] args) {
        /*
        Ejercicio 4: Cargar Ticket
        Escribe un programa que pida al usuario que introduzca los datos de un ticket y luego los presente por pantalla.
        El Ticket tendrá tres partes. La cabecera, el listado de productos con sus datos, y el pie con el total .
        La cabecera tendrá la siguiente información: Producto, unidades, precio/unidad y total.
        Le pediremos al usuario que introduzca los datos anteriores para tres productos. Por lo que el cuerpo de la factura tendrá 3 líneas.
        Calcular y Mostrar el Total del ticket
         */

        Scanner sc = new Scanner(System.in);

        String[] producto = new String[3];
        double[] precioUnidad = new double[3];
        int[] cantidad = new int[3];
        double[] total = new double[3];
        double totalFinal = 0;
        int contadorProducto = 0;


        while (contadorProducto < 3) {
            System.out.println("Por favor ingrese el nombre del producto: ");
            String nombreProducto = sc.next();
            producto[contadorProducto] = nombreProducto;

            System.out.println("Ingrese la cantidad comprada de ese producto: ");
            String cantidadProducto = sc.next();
            cantidad[contadorProducto] = Integer.parseInt(cantidadProducto);

            System.out.println("Ingrese el precio del producto: ");
            String precioProducto = sc.next();
            precioUnidad[contadorProducto] = Double.parseDouble(precioProducto);

            total[contadorProducto] = precioUnidad[contadorProducto] * cantidad[contadorProducto];


            contadorProducto++;
        }


        System.out.printf("%-15s %-10s %-15s %-10s\n", "Producto", "Unidades", "Precio/Unidad", "Total");
        System.out.println("-------------------------------------------------------------");

        for (int i = 0; i < producto.length; i++) {
            System.out.printf(
                    "%-15s %-10d $%-14.2f $%-10.2f\n",
                    producto[i], cantidad[i], precioUnidad[i], total[i]
            );
        }

        for (double t : total) {
            totalFinal += t;
        }
        System.out.printf("\n%-42s $%-10.2f\n", "TOTAL FINAL", totalFinal);


    }
}
