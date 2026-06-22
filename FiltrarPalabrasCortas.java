// Guarda este archivo estrictamente con el nombre: FiltrarPalabrasCortas.java
public class FiltrarPalabrasCortas {
    public static void main(String[] args) {
        
        String texto = "Java es un lenguaje de programación de alto nivel";
        
        // El método .split(" ") rompe el texto por cada espacio y lo convierte en un arreglo de palabras
        String[] palabras = texto.split(" ");
        int i = 0;
        
        System.out.println("Texto original: " + texto);
        System.out.print("Palabras filtradas: ");
        
        do {
            // Condición de cierre para finalizar cuando recorramos todas las palabras
            if (i == palabras.length) {
                break;
            }
            
            // Evaluamos la longitud de la palabra actual usando tu regla (continue)
            if (palabras[i].length() < 3) {
                i++;      // Avanzamos al siguiente índice antes del salto
                continue; // Ignora el print de abajo y salta directo al inicio del 'do'
            }
            
            // Este código solo se ejecuta si la palabra tiene 3 o más caracteres
            System.out.print(palabras[i] + " ");
            i++;
            
        } while (true); // Bucle infinito controlado internamente
        
        System.out.println("\n=======================================================");
    }
}