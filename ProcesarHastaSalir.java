import java.util.Scanner;

public class ProcesarHastaSalir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String entrada;
        int contadorDatos = 0;
        
        System.out.println("=== Procesador de Datos Continuo ===");
        System.out.println("Escribe cualquier dato para procesar o la palabra 'salir' para terminar.\n");
        
        do {
            System.out.print("Ingresa un dato: ");
            entrada = scanner.nextLine();
            
            // Evaluamos la condición de cierre usando tu regla (break)
            if (entrada.equalsIgnoreCase("salir")) {
                System.out.println("\nDetectada orden de salida.");
                break; // Rompe el bucle do-while(true) de inmediato
            }
            
            // Si no se escribió "salir", el programa procesa el dato aquí abajo
            System.out.println("-> ¡Dato \"" + entrada + "\" procesado con éxito!\n");
            contadorDatos++;
            
        } while (true); // Bucle infinito controlado desde adentro
        
        // Código fuera del bucle
        System.out.println("====================================");
        System.out.println("Programa terminado.");
        System.out.println("Total de datos procesados: " + contadorDatos);
        
        scanner.close();
    }
}