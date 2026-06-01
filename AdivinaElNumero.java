import java.util.Scanner;

public class AdivinaElNumero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // 1. Generar un número aleatorio entre 1 y 100
        // Math.random() da un decimal entre 0.0 y 0.999... Al multiplicar por 100 da entre 0 y 99.
        // Le sumamos 1 para que el rango sea exactamente de 1 a 100.
        int numeroSecreto = (int) (Math.random() * 100) + 1;
        
        int intento = 0; // Variable para guardar el número que escribe el usuario
        int contadorIntentos = 0; // Para contar cuántas veces falló antes de ganar

        System.out.println("¡Bienvenido al juego! He pensado un número entre 1 y 100.");
        System.out.println("Intenta adivinar cuál es.");
        System.out.println("---------------------------------------------------------");

        // 2. El ciclo while continúa MIENTRAS el intento sea DIFERENTE al número secreto
        while (intento != numeroSecreto) {
            System.out.print("Introduce tu número: ");
            intento = teclado.nextInt();
            contadorIntentos++; // Sumamos un intento

            // 3. Damos pistas al usuario
            if (intento < numeroSecreto) {
                System.out.println("¡No! El número secreto es MAYOR. Intenta de nuevo.\n");
            } else if (intento > numeroSecreto) {
                System.out.println("¡No! El número secreto es MENOR. Intenta de nuevo.\n");
            }
        }

        // 4. Si sale del while, significa que intento == numeroSecreto (¡Ganó!)
        System.out.println("=========================================================");
        System.out.println("¡FELICIDADES! Has adivinado el número secreto.");
        System.out.println("El número era: " + numeroSecreto);
        System.out.println("Número de intentos totales: " + contadorIntentos);
        System.out.println("=========================================================");

        teclado.close();
    }
}