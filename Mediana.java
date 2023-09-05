import java.util.ArrayList;
import java.util.Scanner;

public class Mediana {

   
    public static void main(String[] args) {
        //Solicite números ordenados al usuario hasta el el usuario ingrese el símbolo “.”. Luego
        //calcule la mediana de la lista de la siguiente forma:
        //1) Si la cantidad de números es impar, obtenga el número que se encuentra en la mitad
        //e imprímalo.
        //2) Si la cantidad de números es par, entonces obtenga la pareja de elementos de la
        //mitad e imprima el promedio entre estos dos números.
        
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> numeros = new ArrayList<>();

        System.out.println("Ingrese los números uno por uno");
        System.out.println("Para terminar de ingresar los datos, por favor ingrese el simbolo '.' para calcular la mediana.");

        while (true) {
            String entrada = sc.nextLine();
            if (entrada.equals(".")) {
                break; 
            }

            try {
                double numero = Double.parseDouble(entrada);
                numeros.add(numero);
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Ingrese un número válido o '.' para calcular la mediana.");
            }
        }

        if (numeros.isEmpty()) {
            System.out.println("No se ingresaron números.");
        } else {
            double mediana = calcularMediana(numeros);
            System.out.println("La mediana es: " + mediana);
        }
    }

    public static double calcularMediana(ArrayList<Double> numeros) {
        int n = numeros.size();
        double[] arreglo = new double[n];

        for (int i = 0; i < n; i++) {
            arreglo[i] = numeros.get(i);
        }


        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    
                    double temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }

        if (n % 2 != 0) {
            
            return arreglo[n / 2];
            
        } else {
            
            double medio1 = arreglo[(n - 1) / 2];
            double medio2 = arreglo[n / 2];
            return (medio1 + medio2) / 2.0;
        }
    }
}
