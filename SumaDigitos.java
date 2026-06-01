public class SumaDigitos {
    public static void main(String[] args) {
        // 1. Definimos y leemos el número solicitado
        int numero = 456; 
        int numeroOriginal = numero; // Guardamos el 456 para el mensaje final
        int suma = 0;

        // 2. Ciclo while para extraer y sumar cada cifra
        while (numero > 0) {
            int cifra = numero % 10;  // Extrae la última cifra (6, luego 5, luego 4)
            suma = suma + cifra;      // Suma la cifra al total acumulado
            numero = numero / 10;     // Elimina la última cifra procesada
        }

        // 3. Imprimimos el resultado en la consola
        System.out.println("El número leído es: " + numeroOriginal);
        System.out.println("La suma de sus cifras es: " + suma);
    }
}