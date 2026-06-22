import java.util.Scanner;

public class AcumuladorNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double sumaNotas = 0;
        int contadorNotas = 0;
        char respuesta;
        
        System.out.println("--- Sistema de Acumulación de Notas ---");
        
        do {
            System.out.print("Ingresa una nota: ");
            double nota = scanner.nextDouble();
            
            sumaNotas += nota;     // Acumula la nota
            contadorNotas++;       // Cuenta la nota ingresada
            
            // Limpiamos el búfer del scanner antes de leer un texto/carácter
            scanner.nextLine(); 
            
            System.out.print("¿Deseas ingresar otra nota? (S/N): ");
            // Leemos la línea, tomamos la primera letra y la pasamos a mayúscula
            respuesta = scanner.nextLine().toUpperCase().charAt(0);
            System.out.println(); // Espacio en blanco
            
        } while (respuesta == 'S'); // El ciclo se repite MIENTRAS la respuesta sea 'S'
        
        // Al terminar el ciclo, calculamos y mostramos los resultados
        System.out.println("--- Resumen Final ---");
        System.out.println("Total de notas ingresadas: " + contadorNotas);
        System.out.println("Suma acumulada: " + sumaNotas);
        
        if (contadorNotas > 0) {
            double promedio = sumaNotas / contadorNotas;
            System.out.printf("El promedio final es: %.2f\n", promedio);
        }
        
        scanner.close();
    }
}