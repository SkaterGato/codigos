public class EntornoJavaFuncional {
    public static void main(String[] args) {
        
        String texto = "Validando Entorno En VS Code 2026";
        int i = 0;
        
        System.out.println("=== PRUEBA DE EXTENSIÓN DE JAVA ===");
        System.out.println("Texto Original: " + texto);
        System.out.print("Resultado: ");
        
        do {
            // 1. Condición de salida con (break) al llegar al final del texto
            if (i == texto.length()) {
                break;
            }
            
            char letra = texto.charAt(i);
            
            // 2. Filtro con (continue) si encontramos un espacio en blanco
            if (letra == ' ') {
                i++; // Avanzamos el índice para no quedar en bucle infinito
                continue; // Salta el print de abajo y vuelve al inicio del do
            }
            
            // Este código solo se ejecuta si la letra NO es un espacio
            System.out.print(letra);
            i++;
            
        } while (true); // Bucle infinito controlado desde el interior
        
        System.out.println("\n===================================");
    }
}