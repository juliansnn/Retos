import java.util.Random;
import java.util.Scanner;
public class Reto8 {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100) + 1;
        Scanner in = new Scanner(System.in);
        System.out.println("Adivina el número aleatorio del 1 al 100.");
        System.out.println("Tienes 10 intentos para adivinar el número.");
        for (int i = 1; i <= 10; i++) {
            System.out.print("Intento #" + i + ": ");
            int intento = in.nextInt();

            if (intento == numeroAleatorio) {
                System.out.println("¡Felicidades! Adivinaste el número en " + i + " intentos.");
                return;
            } else if (intento < numeroAleatorio) {
                System.out.println("El número a adivinar es mayor.");
            } else {
                System.out.println("El número a adivinar es menor.");
            }
        }
        System.out.println("Lo siento, no lograste adivinar el número. El número aleatorio era: " + numeroAleatorio);
        in.close();
    }
}