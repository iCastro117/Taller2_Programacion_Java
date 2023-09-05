import java.util.Scanner;

public class NumerosPalindromos {
    
    public static void main(String[] args) {
        
            //Un número natural es un palíndromo si se lee igual de izquierda a derecha y de derecha a
            //izquierda.
            //Por ejemplo, 14941 es un palíndromo, mientras que 81924 no lo es.
            //Escriba un programa que indique si el número ingresado es o no palíndromo:
            
            Scanner sc = new Scanner(System.in);

            System.out.print("Ingrese un numero: ");
            String cadena = sc.nextLine();

            if (esPalindromo(cadena)) {
                System.out.println(cadena + " es palindromo.");
            } else {
                System.out.println(cadena + " no es palindromo.");
            }
        }

        // Función para verificar si una cadena es un palíndromo
        public static boolean esPalindromo(String cadena) {
            // Eliminar espacios y convertir a minúsculas
            cadena = cadena.replaceAll(" ", "").toLowerCase();

            int longitud = cadena.length();

            for (int i = 0; i < longitud / 2; i++) {
                if (cadena.charAt(i) != cadena.charAt(longitud - i - 1)) {
                    return false;
                }
            }

            return true;
        }
    }
