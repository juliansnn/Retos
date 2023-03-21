import java.util.Scanner;

public class Reto5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String cliente, empleado;
        double total = 0, pago, cambio;
        boolean registrado = false;
        System.out.print("Nombre del cliente: ");
        cliente = in.nextLine();
        System.out.print("Nombre del empleado: ");
        empleado = in.nextLine();   
        while (!registrado) {
            System.out.print("¿Está registrado el cliente? (S/N): ");
            String respuesta = in.nextLine().toUpperCase();
            
            if (respuesta.equals("S")) {
                registrado = true;
            } else {
                System.out.println("El cliente debe estar registrado para realizar una compra.");
            }
        }
        while (true) {
            System.out.print("Nombre del producto (o fin para terminar): ");
            String producto = in.nextLine();
            
            if (producto.equalsIgnoreCase("fin")) {
                break;
            }
            System.out.print("Precio del producto: ");
            double precio = in.nextDouble();
            in.nextLine(); 
            total += precio;
        }
        System.out.println("Total: " + total);
        System.out.print("Pago: ");
        pago = in.nextDouble();
        while (pago < total) {
            System.out.println("El pago debe ser igual o mayor que el total.");
            System.out.print("Pago: ");
            pago = in.nextDouble();
        }
        cambio = pago - total;
        System.out.println("Cambio: " + cambio);
        in.close ();
    }
}