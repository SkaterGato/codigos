// Guarda este archivo estrictamente con el nombre: MultiploDiecisiete.java
public class MultiploDiecisiete {
    public static void main(String[] args) {
        
        int numero = 1;
        
        System.out.println("=== Buscando Múltiplos de 17 (1 al 100) ===");
        
        do {
            // Protección por si el bucle supera el límite máximo solicitado
            if (numero > 100) {
                break;
            }
            
            // Imprimimos el número en el que vamos
            System.out.println("Evaluando número: " + numero);
            
            // Condición de parada obligatoria usando tu regla (break)
            if (numero % 17 == 0) {
                System.out.println("\n¡Múltiplo encontrado! El número " + numero + " es divisible entre 17.");
                break; // Rompe el bucle do-while(true) inmediatamente
            }
            
            numero++; // Incrementamos para revisar el siguiente valor
            
        } while (true); // Bucle infinito controlado desde adentro
        
        System.out.println("==========================================");
        System.out.println("Bucle finalizado. Programa fuera del ciclo.");
    }
}