public class ParesConContinue {
    public static void main(String[] args) {
        
        int numero = 1;
        
        System.out.println("=== Números Pares del 1 al 100 ===");
        
        do {
            // Condición de cierre para no dejar el bucle infinito
            if (numero > 100) {
                break; 
            }
            
            // Si el número es impar, usamos (continue) para saltarlo
            if (numero % 2 != 0) {
                numero++; // Avanzamos el contador para evitar bucle infinito
                continue; // Salta el System.out.print y vuelve al inicio del do
            }
            
            // Este bloque solo se ejecuta si el número es par
            System.out.print(numero + " ");
            numero++;
            
        } while (true);
        
        System.out.println("\n\n¡Proceso completado!");
    }
}