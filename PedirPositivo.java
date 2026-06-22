import java.util.Scanner;

public class PedirPositivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero; // Declaramos la variable fuera para que esté disponible en la condición del while
        
        // El bloque "do" se ejecutará siempre la primera vez
        do {
            System.out.print("Introduce un número positivo: ");
            numero = scanner.nextInt();
            
            // Mensaje de advertencia si el usuario se equivoca
            if (numero <= 0) {
                System.out.println("Error: El número ingresado no es positivo. Inténtalo de nuevo.\n");
            }
            
        } while (numero <= 0); // El ciclo se repite MIENTRAS el número sea negativo o cero
        
        System.out.println("\n¡Perfecto! Has ingresado el número positivo: " + numero);
        
        scanner.close();
    }
}