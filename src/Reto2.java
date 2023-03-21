import java.util.Scanner;

public class Reto2 {
    public static void main(String[] args){
       Scanner lectura = new Scanner(System.in);
       System.out.println("Ingrese el peso del bebé en kilogramos:");
       double peso = lectura.nextDouble();
       System.out.println("Ingrese la edad del bebé en meses:");
       int edad = lectura.nextInt();

       double dosis = (peso + 10) / (edad * 10.0) * 8;

       System.out.println("La dosis de la vacuna que se debe aplicar es: " + dosis);
       lectura.close();
    } 
}