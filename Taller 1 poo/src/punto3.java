import java.util.Scanner;

public class punto3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double iva = 0.19;
        double descuento = 0.0; 
        int precio;
        System.out.println("Ingrese el nombre de la marca que desea adquirir: ");
        String nosy = "Nosy";
        String answer = sc.nextLine();
        System.out.println("Ingrese el precio del producto: ");
        precio = sc.nextInt();
        if (answer.equalsIgnoreCase(nosy)) { 
            if (precio >= 500) {
                descuento = 0.15;
            } else {
                descuento = 0.05; 
            }
        } else { 
            if (precio >= 500) {
                descuento = 0.10;  
            }
        }
        double totalDescuento = precio * descuento;
        double precioConDescuento = precio - totalDescuento;
        double totalIva = precioConDescuento * iva;
        double totalFinal = precioConDescuento + totalIva;
        System.out.printf("El precio total a pagar es de: U$%.2f\n", totalFinal);

        sc.close();
    }
}
