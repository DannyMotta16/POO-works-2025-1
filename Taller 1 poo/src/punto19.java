import java.util.ArrayList;
import java.util.Scanner;

public class punto19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> condena = new ArrayList<>();
        ArrayList<String> nombres = new ArrayList<>();
        boolean continuar = true; 
        while (continuar) {
            System.out.println("Ingrese el nombre del recluso:  (Escriba 'FIN' para terminar)");
            String nombre = sc.nextLine();
            if (nombre.equalsIgnoreCase("FIN")) {
                break;
            }
            nombres.add(nombre);
            System.out.println("Ingrese la cantidad de tiempo de condena en meses: ");
            while (!sc.hasNextInt()) {
                System.out.println("Error: Ingrese un número válido.");
                sc.next();
                }
            int condenaTiempo = sc.nextInt();   
            sc.nextLine();
            condena.add(condenaTiempo);
        }
       System.out.println("/n Nombre recluso     Meses preso:");

        for (int i = 0; i < nombres.size(); i++) {
            if (condena.get(i) < 36) { 
                System.out.printf("%-20s | %d meses%n", nombres.get(i), condena.get(i));
            }
        }

       sc.close();
    
    }
    }
    
