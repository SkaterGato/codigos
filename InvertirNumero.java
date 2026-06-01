public class InvertirNumero {
    public static void main(String[] args) {
        // 1. Definimos el número a invertir
        int numero = 123; 
        int numeroOriginal = numero; // Guardamos el valor original para el mensaje final
        int numeroInvertido = 0;

        // 2. Ciclo while para voltear el número
        while (numero > 0) {
            int cifra = numero % 10;                     // Extrae la última cifra (3, luego 2, luego 1)
            numeroInvertido = (numeroInvertido * 10) + cifra; // "Empuja" el número a la izquierda y suma la cifra
            numero = numero / 10;                        // Elimina la última cifra procesada
        }

        // 3. Mostramos el resultado en la consola
        System.out.println("El número original es: " + numeroOriginal);
        System.out.println("El número invertido es: " + numeroInvertido);
    }
}