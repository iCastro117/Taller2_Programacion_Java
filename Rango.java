import java.util.Scanner;


public class Rango {

    public static void main(String[] args) {

        //En estadística descriptiva, se define el rango de un conjunto de datos reales como la
        //diferencia entre el mayor y el menor de los datos.
        //Por ejemplo, si los datos son:
        //[5.96, 6.74, 7.43, 4.99, 7.20, 0.56, 2.80],
        //entonces el rango es 7.43 − 0.56 = 6.87.
        //Escriba un programa que:
        //● pregunte al usuario cuántos datos serán ingresados,
        //● pida al usuario ingresar los datos uno por uno, y
        //● entregue como resultado el rango de los datos.
        //Suponga que todos los datos ingresados son válidos

        Scanner sc = new Scanner(System.in);

        // Solicitar la cantidad de datos al usuario
        System.out.print("Ingrese la cantidad de datos: ");
        int cantidadDatos = sc.nextInt();

        // Crear un arreglo para almacenar los datos de tipo double
        double[] datos = new double[cantidadDatos];

        // Solicitar al usuario ingresar los datos uno por uno
        for (int i = 0; i < cantidadDatos; i++) {
            System.out.print("Ingrese el dato #" + (i + 1) + ": ");
            datos[i] = sc.nextDouble();
        }

        // Llamar a la función para calcular el rango
        double rango = calcularRango(datos);

        // Mostrar el resultado
        System.out.println("El rango de los datos es: " + rango);
    }

    public static double calcularRango(double[] datos) {
        if (datos.length == 0) {
            // Si no hay datos, el rango es 0
            return 0;
        } else {
            // Encontrar el valor máximo y mínimo en el arreglo
            double maximo = datos[0];
            double minimo = datos[0];

            for (int i = 1; i < datos.length; i++) {
                if (datos[i] > maximo) {
                    maximo = datos[i];
                }
                if (datos[i] < minimo) {
                    minimo = datos[i];
                }
            }

            // Calcular el rango como la diferencia entre el máximo y el mínimo
            return maximo - minimo;
        }
    }
}