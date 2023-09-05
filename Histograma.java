import java.util.Scanner;


public class Histograma {


    public static void main(String[] args) {
        
        //Escriba un programa que pida al usuario que ingrese varios valores enteros, que pueden ser
        //positivos o negativos. Cuando se ingrese un cero, el programa debe terminar y mostrar un
        //gráfico de cuántos valores positivos y negativos fueron ingresados (debe imprimir un * por
        //cada número positivo y negativo):
        
         Scanner sc = new Scanner(System.in);
        
        int contadorPositivos = 0;
        int contadorNegativos = 0;
        
        System.out.println("Ingrese números positivos o negativos (ingrese 0 para terminar):");
        
        while (true) {
            int valor = sc.nextInt();
            
            if (valor == 0) {
                break; // Termina el programa si se ingresa 0
            }
            
            if (valor > 0) {
                contadorPositivos++;
            } else {
                contadorNegativos++;
            }
        }
        
        System.out.println("Gráfico de valores positivos:");
        for (int i = 0; i < contadorPositivos; i++) {
            System.out.print("*");
        }
        System.out.println();
        
        System.out.println("Gráfico de valores negativos:");
        for (int i = 0; i < contadorNegativos; i++) {
            System.out.print("*");
        }
    }
