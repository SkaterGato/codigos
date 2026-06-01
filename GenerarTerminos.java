import java.util.Scanner; // Importamos la librería para leer datos del teclado

public class GenerarTerminos {
    public static void main(String[] args) {
        // Creamos el objeto Scanner para capturar lo que el usuario escriba
        Scanner teclado = new Scanner(System.in);

        // 1. Solicitamos al usuario la cantidad de términos (n)
        System.out.print("¿Cuántos términos deseas generar? (n): ");
        int n = teclado.nextInt();

        // 2. Inicializamos nuestra variable de control en 1
        int contador = 1;

        System.out.println("\nLos primeros " + n + " términos son:");

        // 3. Ciclo while: se ejecuta MIENTRAS el contador sea menor o igual a 'n'
        while (contador <= n) {
            System.out.print(contador + " "); // Imprime el número actual y un espacio
            contador++;                       // Suma 1 al contador para pasar al siguiente número
        }
        
        // Un salto de línea final para que la consola quede limpia
        System.out.println(); 
        
        // Cerramos el scanner por buena práctica de programación
        teclado.close();
    }
}