public class FactorialWhile {
    public static void main(String[] args) {
        // 1. Definimos el número solicitado
        int numero = 8;
        
        // Inicializamos el factorial en 1 (no en 0, porque cualquier multiplicación por 0 da 0)
        long factorial = 1; 
        
        // Usamos una variable auxiliar para no perder el valor original del 8
        int contador = numero; 

        // 2. Ciclo while para multiplicar en cuenta regresiva
        while (contador > 0) {
            factorial = factorial * contador; // Multiplica el acumulado por el número actual
            contador--;                       // Resta 1 para pasar al siguiente número menor
        }

        // 3. Mostramos el resultado en la consola
        System.out.println("El factorial de " + numero + " (" + numero + "!) es: " + factorial);
    }
}