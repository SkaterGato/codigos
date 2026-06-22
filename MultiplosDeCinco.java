public class MultiplosDeCinco {
    public static void main(String[] args) {
        
        int numero = 1;
        
        System.out.println("=== Múltiplos de 5 del 1 al 50 ===");
        
        do {
            // Condición de cierre para detener el bucle infinito al llegar a 50
            if (numero > 50) {
                break;
            }
            
            // Si el número NO es múltiplo de 5, usamos (continue) para ignorarlo
            if (numero % 5 != 0) {
                numero++;   // Incrementamos antes de saltar para evitar bucle infinito
                continue;   // Salta el System.out.print y regresa al inicio del 'do'
            }
            
            // Este código solo se ejecuta si el número es divisible por 5
            System.out.print(numero + " ");
            numero++;
            
        } while (true);
        
        System.out.println("\n\n¡Proceso completado con éxito!");
    }
}