// Guarda este archivo exactamente con el nombre: ControlLimiteCalculo.java
public class ControlLimiteCalculo {
    public static void main(String[] args) {
        
        int resultado = 1;
        int multiplicador = 2;
        int limiteMaximo = 500;
        int iteracion = 1;
        
        System.out.println("=== CÁLCULO DE POTENCIAS DE 2 (Límite: " + limiteMaximo + ") ===");
        
        do {
            // Realizamos el cálculo multiplicativo en cada vuelta
            resultado = resultado * multiplicador;
            
            System.out.println("Iteración " + iteracion + " -> Resultado actual: " + resultado);
            
            // Evaluamos la condición límite usando tu regla (break)
            if (resultado > limiteMaximo) {
                System.out.println("\n[ALERTA] ¡El resultado (" + resultado + ") superó el límite permitido de " + limiteMaximo + "!");
                break; // Rompe el bucle do-while(true) de inmediato
            }
            
            iteracion++;
            
        } while (true); // Bucle infinito controlado desde el interior
        
        System.out.println("=========================================");
        System.out.println("Programa detenido de forma segura fuera del bucle.");
    }
}