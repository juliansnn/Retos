import java.util.Scanner;

public class Reto4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String jugador1;
        String jugador2 = "Computadora";
        int apuesta;
        System.out.print("Ingresa tu nombre: ");
        jugador1 = in.nextLine();
        System.out.print("Ingresa tu apuesta (debe ser mayor a 10000): ");
        apuesta = in.nextInt();
        if (apuesta < 10000) {
            System.out.println("La apuesta debe ser mayor a 10000.");
            return;
        }
        System.out.println("Bienvenido a Piedra, Papel y Tijera, " + jugador1 + ".");
        System.out.println("Tu oponente es " + jugador2 + ".");
        System.out.println("La apuesta es de " + apuesta + ".");
        System.out.print("Elige piedra (p), papel (pa) o tijera (t): ");
        String opcionJugador1 = in.next();

        int seleccionComputadora = (int) (Math.random() * 3);
        String seleccionJugador2 = "";
        switch (seleccionComputadora) {
            case 0:
                seleccionJugador2 = "p";
                System.out.println(jugador2 + " elige piedra.");
                break;
            case 1:
                seleccionJugador2 = "pa";
                System.out.println(jugador2 + " elige papel.");
                break;
            case 2:
                seleccionJugador2 = "t";
                System.out.println(jugador2 + " elige tijera.");
                break;
        }
        if (opcionJugador1.equals("p") && seleccionJugador2.equals("t") ||
            opcionJugador1.equals("pa") && seleccionJugador2.equals("p") ||
            opcionJugador1.equals("t") && seleccionJugador2.equals("pa")) {
            System.out.println(jugador1 + " gana!");
            System.out.println(jugador1 + " gana " + apuesta + " pesos.");
        } else if (opcionJugador1.equals("p") && seleccionJugador2.equals("pa") ||
            opcionJugador1.equals("pa") && seleccionJugador2.equals("t") ||
            opcionJugador1.equals("t") && seleccionJugador2.equals("p")) {
            System.out.println(jugador2 + " gana!");
            System.out.println(jugador1 + " pierde " + apuesta + " pesos.");
        } else {
            System.out.println("Empate!");
        }in.close();
    }
}