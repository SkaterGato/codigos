import java.util.Scanner;

public class FiltrarVocales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce una frase o palabra: ");
        String texto = scanner.nextLine();
        
        System.out.print("Vocales encontradas: ");
        
        // El ciclo for recorre cada índice del texto, desde 0 hasta el largo de la cadena - 1
        for (int i = 0; i < texto.length(); i++) {
            char caracterActual = texto.charAt(i);
            
            // Convertimos el carácter a minúscula temporalmente para facilitar la comparación
            char minuscula = Character.toLowerCase(caracterActual);
            
            // Verificamos si el carácter actual es una vocal (incluyendo vocales con tilde)
            if (minuscula == 'a' || minuscula == 'e' || minuscula == 'i' || minuscula == 'o' || minuscula == 'u' ||
                minuscula == 'á' || minuscula == 'é' || minuscula == 'í' || minuscula == 'ó' || minuscula == 'ú') {
                
                // Imprimimos la vocal original (mantiene su mayúscula/minúscula o tilde original)
                System.out.print(caracterActual + " ");
            }
        }
        
        System.out.println(); // Salto de línea final
        scanner.close();
    }
}