public class ArregloEnteros {
    public static void main(String[] args) {
        // Uso de 'var' para inferir el tipo de dato automáticamente
        var numeros = new int[5];

        // Se usa numeros.length en lugar del valor fijo 5
        for (var indice = 0; indice < numeros.length; indice++) {
            System.out.println("Índice: " + indice + ", Valor: " + numeros[indice]);
        }
        
        System.out.println(); // Línea en blanco

        // Asignación de valores
        numeros[0] = 10;
        numeros[1] = 30;
        numeros[2] = 50;
        numeros[3] = 70;
        numeros[4] = 90;

        for (var indice = 0; indice < numeros.length; indice++) {
            System.out.println("Índice: " + indice + ", Valor: " + numeros[indice]);
        }
    }
}