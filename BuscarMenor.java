import java.util.Scanner;

public class BuscarMenor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("--- Buscador del Número Menor ---");
        System.out.print("Introduce un número (escribe 0 para terminar): ");
        int numero = teclado.nextInt(); // Leemos el primer número

        // Si el primer número es 0, el programa termina de inmediato
        if (numero == 0) {
            System.out.println("No se ingresaron números válidos.");
        } else {
            // Inicializamos 'menor' con el primer número ingresado
            int menor = numero; 

            // El ciclo continúa MIENTRAS el número ingresado NO sea 0
            while (numero != 0) {
                
                // Si el número actual es más pequeño que el que teníamos guardado...
                if (numero < menor) {
                    menor = numero; // ...actualizamos el trono del número menor
                }

                // Pedimos el siguiente número
                System.out.print("Introduce otro número (escribe 0 para terminar): ");
                numero = teclado.nextInt();
            }

            // Al salir del ciclo, mostramos cuál fue el menor de todos
            System.out.println("\n---------------------------------");
            System.out.println("El número menor ingresado fue: " + menor);
            System.out.println("---------------------------------");
        }

        teclado.close();
    }
}