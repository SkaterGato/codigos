// El nombre de aquí abajo DEBE ser idéntico al del archivo en tu carpeta
public class BuscarArregloBandera {
    public static void main(String[] args) {
        
        int[] numeros = {12, 45, 78, 92, 34, 56, 81};
        int numeroBuscado = 34;
        int i = 0;
        
        do {
            if (i == numeros.length) {
                break; 
            }
            if (numeros[i] == numeroBuscado) {
                System.out.println("¡Número " + numeroBuscado + " encontrado en índice: " + i);
                break; // Aplicando tu regla (break)
            }
            i++;
        } while (true);
    }
}