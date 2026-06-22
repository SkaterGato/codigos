import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce un número entero positivo: ");
        int numero = scanner.nextInt();
        
        boolean esPrimo = true;
        
        // Los números menores o iguales a 1 no son primos
        if (numero <= 1) {
            esPrimo = false;
        } else {
            // Evaluamos desde 2 hasta la raíz cuadrada del número
            // Expresar (i * i <= numero) es equivalente y más eficiente que usar Math.sqrt()
            for (int i = 2; i * i <= numero; i++) {
                if (numero % i == 0) {
                    esPrimo = false; // Se encontró un divisor, por lo tanto no es primo
                    break;           // Rompemos el ciclo for de inmediato para ahorrar tiempo
                }
            }
        }
        
        // Mostramos el resultado
        if (esPrimo) {
            System.out.println("El número " + numero + " ES primo.");
        } else {
            System.out.println("El número " + numero + " NO es primo.");
        }
        
        scanner.close();
    }
}