import java.util.Scanner;

public class ValidarEdadBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int edad;
        
        System.out.println("--- Registro de Edad Válida (Método Break) ---");
        
        do {
            System.out.print("Por favor, ingresa tu edad (rango de 0 a 120): ");
            edad = scanner.nextInt();
            
            // Evaluamos si la edad es correcta (está en el rango válido)
            if (edad >= 0 && edad <= 120) {
                break; // Rompe el ciclo de inmediato y salta a la línea de éxito
            }
            
            // Si el break no se ejecuta, el programa continúa aquí abajo:
            System.out.println("Error: La edad ingresada no es válida. Inténtalo de nuevo.\n");
            
        } while (true); // "while(true)" crea un bucle que correría para siempre si no fuera por el break
        
        System.out.println("\n¡Edad registrada con éxito!");
        System.out.println("Tu edad actual es: " + edad + " años.");
        
        scanner.close();
    }
}