public class OmitirNegativos {
    public static void main(String[] args) {
        
        // Lista de números que contiene positivos y negativos
        int[] listaNumeros = {10, -5, 23, -12, 0, 45, -8, 90};
        int i = 0;
        
        System.out.println("=== Lista de Números Filtrada (Sin Negativos) ===");
        
        do {
            // Condición de cierre: cuando procesemos todo el arreglo, salimos
            if (i == listaNumeros.length) {
                break;
            }
            
            // Si el número es menor que 0, usamos (continue) para omitirlo
            if (listaNumeros[i] < 0) {
                i++;      // Incrementamos el índice antes de saltar
                continue; // Detiene la vuelta actual y vuelve al inicio del 'do'
            }
            
            // Este código solo se ejecuta si el número es 0 o positivo
            System.out.println("Número válido: " + listaNumeros[i]);
            i++;
            
        } while (true); // Bucle infinito controlado desde el interior
        
        System.out.println("\n¡Filtrado de lista finalizado con éxito!");
    }
}