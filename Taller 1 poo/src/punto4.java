import java.util.Scanner;

public class punto4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double descuento=0.0; 
        int precioManzanaKilo=500;
        double pesoManzana;
        System.out.println("¿Cuántos kilos de manzanas desea llevar?");
        System.out.println("De 2 a 5 kilos tiene un descuento de 10%.");
        System.out.println("De 5 a 10 tiene el 15% menos y de 10 en adelante obtiene un 20%");
        pesoManzana=sc.nextDouble();
        if (pesoManzana>=2.01 && pesoManzana <5){
            descuento=0.10;
        } else if (pesoManzana >=5.01 && pesoManzana <10) {
            descuento=0.15;
        } else if (pesoManzana>=10.01) {
            descuento=0.20;
        }
                double precio=pesoManzana*precioManzanaKilo;
        double descuentoManzana=precio*descuento;
        double precioTotal=precio-descuentoManzana;
        System.out.println("El precio total a pagar es: "+precioTotal);
        sc.close();
        }
    }
     

