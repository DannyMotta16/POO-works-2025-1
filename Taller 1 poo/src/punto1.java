import java.util.Scanner; 

public class punto1 {

    public static void main(String[] args) {
        Scanner pc = new Scanner(System.in);
        int precioCompu=500;
        System.out.println("El precio de computadora por unidad es de: " + precioCompu);
        System.out.println("¿Cuántas computadoras desea comprar?");
        double  descuento, descuentTotal;
        int total ;
       int numCompu = pc.nextInt(); 
       if (numCompu<=5){
        total=numCompu*precioCompu;
        descuento = total*0.10;
        descuentTotal= total-descuento;
        System.out.println("El precio total a pagar con el descuento, es de: " + descuentTotal);
System.out.println("El precio total sin el descuento es de: " + total);
       } else if (numCompu > 5 && numCompu <= 10) {
       total=numCompu*precioCompu;
       descuento=total*0.20;
       descuentTotal= total-descuento;
       System.out.println("El precio total a pagar con el descuento es de: " + descuentTotal); 
       System.out.println("El descuento es de: " + descuento);
       } else if (numCompu>10){
        total=numCompu*precioCompu;
       descuento=total*0.40;
       descuentTotal= total-descuento;
       System.out.println("El precio total a pagar con el descuento es de: " + descuentTotal); 
       System.out.println("El descuento es de: " + descuento);

       }
       pc.close();


    }
}