import java.util.Scanner;
import java.util.Random;
public class Reto6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int apuesta = 10;
        int saldo = 100;
        while (saldo > 0) {
            System.out.println("Saldo: " + saldo);
            System.out.println("Apuesta: " + apuesta);
            System.out.print("¿Cara o sello? (C/S): ");
            String eleccion = in.nextLine().toUpperCase();
            if (!eleccion.equals("C") && !eleccion.equals("S")) {
                System.out.println("Elección inválida. Inténtalo de nuevo.");
                continue;
            }
            int moneda = random.nextInt(2);
            if (moneda == 0) {
                System.out.println("Cara");
            } else {
                System.out.println("Sello");
            }
            if ((eleccion.equals("C") && moneda == 0) || (eleccion.equals("S") && moneda == 1)) {
                saldo += apuesta;
                System.out.println("¡Ganaste! Ganaste $" + apuesta + ".");
            } else {
                saldo -= apuesta;
                System.out.println("Perdiste. Perdiste $" + apuesta + ".");
                if (saldo > 0) {
                    apuesta *= 2;
                    System.out.println("La computadora apuesta $" + apuesta + ".");
                }
            }
        }
        System.out.println("Se acabó el juego. Tu saldo es $0.");
        in.close();
    }
}