import java.util.Scanner;

public class punto21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        int xs = 0, s = 0, m = 0, l = 0, xl = 0, xxl = 0, xxxl = 0;
        String talla, nombre;
        boolean continuar = true;
        
        System.out.println("Ingrese los datos de los empleados. Escriba 'FIN' para terminar.");
        
        while (continuar) {
            System.out.print("Ingrese el nombre del empleado, o 'FIN' para acabar: ");
            nombre = scanner.nextLine();
            
            if (nombre.equalsIgnoreCase("FIN")) {
                break;
            }
            
            do {
                System.out.print("Ingrese la talla de la camisa (XS, S, M, L, XL, XXL, XXXL): ");
                talla = scanner.nextLine().toUpperCase();
            } while (!talla.equals("XS") && !talla.equals("S") && !talla.equals("M") &&
                     !talla.equals("L") && !talla.equals("XL") && !talla.equals("XXL") && !talla.equals("XXXL"));
            switch (talla) {
                case "XS": xs++; 
                    break;
                case "S": s++; 
                    break;
                case "M": m++; 
                    break;
                case "L": l++; 
                    break;
                case "XL": xl++; 
                    break;
                case "XXL": xxl++; 
                    break;
                case "XXXL": xxxl++;
                    break;
            }
            
            System.out.println(nombre + " - Talla: " + talla);
        }
        
        System.out.println("Cantidad de camisas por talla:");
        System.out.println("XS: " + xs);
        System.out.println("S: " + s);
        System.out.println("M: " + m);
        System.out.println("L: " + l);
        System.out.println("XL: " + xl);
        System.out.println("XXL: " + xxl);
        System.out.println("XXXL: " + xxxl);
        
        scanner.close();
    }
}
