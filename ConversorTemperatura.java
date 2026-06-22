import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        System.out.println("=== CONVERSOR DE TEMPERATURA ===");
        
        do {
            // 1. Mostrar las opciones del menú
            System.out.println("\n¿Qué deseas hacer?");
            System.out.println("1. Convertir Celsius a Fahrenheit");
            System.out.println("2. Salir del programa");
            System.out.print("Selecciona una opción (1-2): ");
            opcion = scanner.nextInt();
            
            // 2. Procesar la opción elegida
            if (opcion == 1) {
                System.out.print("Introduce los grados Celsius (°C): ");
                double celsius = scanner.nextDouble();
                
                // Aplicamos la fórmula matemática de conversión
                double fahrenheit = (celsius * 9 / 5) + 32;
                
                // Mostramos el resultado con dos decimales de precisión
                System.out.printf("\nResultado: %.2f°C equivalen a %.2f°F\n", celsius, fahrenheit);
                System.out.println("-----------------------------------------");
                
            } else if (opcion == 2) {
                System.out.println("\nFinalizando el programa... ¡Gracias por usar el conversor!");
            } else {
                System.out.println("\nOpción no válida. Por favor, marca 1 o 2.");
            }
            
        } while (opcion != 2); // El ciclo se repite MIENTRAS la opción NO sea 2 (Salir)
        
        scanner.close();
    }
}