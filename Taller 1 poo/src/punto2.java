import java.util.Scanner;

public class punto2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de llantas que desea comprar: ");
        int cantidad = sc.nextInt();
        int precioPorLlanta;

        if (cantidad < 5) {
            precioPorLlanta = 100;
        } else if (cantidad >= 5 && cantidad <= 10) {
            precioPorLlanta = 75;
        } else {
            precioPorLlanta = 50;
        }
        int total = cantidad * precioPorLlanta;
        System.out.println("El precio total es: " + total + " dolares"); 
        sc.close();
    }
}
