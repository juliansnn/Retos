import java.util.Random;
import java.util.Scanner;

public class Reto7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int saldo = 50;
        do {
            System.out.println("¿Cara o Sello? (c/s)");
            String eleccion = in.nextLine();
            if (eleccion.equalsIgnoreCase("c")) {
                System.out.println("Lanzando la moneda...");
                int resultado = random.nextInt(2); 
                if (resultado == 0) {
                    System.out.println("¡Es Cara! Ganaste 10.");
                    saldo += 10;
                } else {
                    System.out.println("¡Es Sello! Perdiste 10.");
                    saldo -= 10;
                }
            } else if (eleccion.equalsIgnoreCase("s")) {
                System.out.println("Lanzando la moneda...");
                int resultado = random.nextInt(2); 

                if (resultado == 1) {
                    System.out.println("¡Es Sello! Ganaste 10.");
                    saldo += 10;
                } else {
                    System.out.println("¡Es Cara! Perdiste 10.");
                    saldo -= 10;
                }
            } else {
                System.out.println("Elección inválida. Inténtalo de nuevo.");
            }
            System.out.println("Tu saldo actual es: " + saldo);
        } while (saldo > 0);
        System.out.println("Lo siento, no tienes más saldo para apostar.");
        in.close();
    }
}