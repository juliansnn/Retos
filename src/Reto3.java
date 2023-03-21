import java.util.Scanner;

public class Reto3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = in.nextLine();
        System.out.print("Ingrese su apuesta: ");
        int apuesta = in.nextInt();
        if (apuesta < 10000) {
            System.out.println("Usted no puede jugar");
        } else {
            int resultado = (int) (Math.random() * 2);
            int premio = resultado == 0 ? apuesta : apuesta * 2;
            String suerte = resultado == 0 ? "perdió" : "ganó";
            System.out.println(nombre + ", " + suerte + " " + premio + " pesos.");
            in.close();
        }
    }
}