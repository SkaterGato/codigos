public class InicializacionArreglos {
    public static void main(String[] args) {
        // Declaración moderna usando 'var'
        var intArreglo = new int[4];
        var doubleArreglo = new double[4];
        var charArreglo = new char[4];
        var booleanArreglo = new boolean[4];
        var stringArreglo = new String[4];

        // Iteración dinámica con .length
        for (var indice = 0; indice < intArreglo.length; indice++) {
            System.out.print(intArreglo[indice] + "-");
        }
        System.out.println();

        for (var indice = 0; indice < doubleArreglo.length; indice++) {
            System.out.print(doubleArreglo[indice] + "-");
        }
        System.out.println();

        for (var indice = 0; indice < charArreglo.length; indice++) {
            System.out.print(charArreglo[indice] + "-");
        }
        System.out.println();

        for (var indice = 0; indice < booleanArreglo.length; indice++) {
            System.out.print(booleanArreglo[indice] + "-");
        }
        System.out.println();

        for (var indice = 0; indice < stringArreglo.length; indice++) {
            System.out.print(stringArreglo[indice] + "-");
        }
        System.out.println();
    } // Fin del método main
} // Fin de la clase InicializacionArreglos