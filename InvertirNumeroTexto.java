import java.util.Scanner;

public class InvertirNumeroTexto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce un número entero: ");
        int numero = scanner.nextInt();
        
        // Convertimos el número a una cadena de texto
        String numeroTexto = Integer.toString(numero);
        String resultadoInvertido = "";
        
        // Recorremos la cadena desde el último carácter hasta el primero (al revés)
        for (int i = numeroTexto.length() - 1; i >= 0; i--) {
            resultadoInvertido += numeroTexto.charAt(i);
        }
        
        // Convertimos la cadena invertida de nuevo a un número entero
        int numeroInvertido = Integer.parseInt(resultadoInvertido);
        
        System.out.println("El número invertido es: " + numeroInvertido);
        
        scanner.close();
    }
}