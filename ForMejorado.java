public class ForMejorado {
    public static void main(String[] args) {
        // Uso de 'var' para inferir automáticamente el tipo String[]
        var dias = new String[]{"LUN", "MAR", "MIE", "JUE", "VIE", "SAB", "DOM"};

        // Bucle for-each utilizando 'var' para el elemento iterado
        for (var dia : dias) {
            System.out.println(dia);
        }
    } // Fin del método main
} // Fin de la clase ForMejorado