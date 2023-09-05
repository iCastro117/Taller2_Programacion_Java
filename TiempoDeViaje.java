import java.util.Scanner;


public class TiempoDeViaje {


    public static void main(String[] args) {
        //Un viajero desea saber cuánto tiempo tomó un viaje que realizó. Él tiene la duración en
        //minutos de cada uno de los tramos del viaje.
        //Desarrolle un programa que permita ingresar los tiempos de viaje de los tramos y entregue
        //como resultado el tiempo total de viaje en formato horas:minutos.
        //El programa deja de pedir tiempos de viaje cuando se ingresa un 0.
        Scanner sc = new Scanner(System.in);

        int minutos;
        int horas = 0;

        int totalHorasMinutos = 0;


        System.out.println("Ingrese el tiempo total del viaje realizado (MINUTOS)");


        while (true) {
            minutos = sc.nextInt();

            if (minutos == 0) {
                break; // Salir del bucle si el usuario ingresa 0
            }

            // Sumar los minutos ingresados al total
            totalHorasMinutos += minutos;
        }

        //operaciones
        horas = totalHorasMinutos / 60;
        totalHorasMinutos %= 60;

        System.out.println("Tiempo total de viaje: " + horas + ":" + totalHorasMinutos + " horas");

    }

}