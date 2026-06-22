public class ContadorHastaTreinta {
    public static void main(String[] args) {
        
        int numero = 1; // Inicializamos nuestro contador en 1
        
        System.out.println("=== Incremento del 1 al 50 (Detenido en 30) ===");
        
        do {
            // Imprimimos el número actual
            System.out.print(numero + " ");
            
            // Condición de parada obligatoria usando BREAK
            if (numero == 30) {
                System.out.println("\n\n¡Bucle interrumpido! Se alcanzó el número 30.");
                break; // Rompe el bucle infinito do-while de inmediato
            }
            
            numero++; // Incrementamos el contador para la siguiente vuelta
            
        } while (true); // Bucle infinito controlado desde adentro
        
        System.out.println("El programa ha continuado con éxito fuera del ciclo.");
    }
}