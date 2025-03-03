import java.util.Scanner;

public class punto16 {
    static final String[] SABORES = {"Limón", "Nuez", "Lulo", "Fresa", "Crema"};
    static final int[] PRECIOS = {2500, 2800, 2600, 2000, 3000};
    static int[] cantidades = new int[SABORES.length];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            procesarVenta(sc);
            continuar = preguntarContinuar(sc, "¿Desea procesar otra factura? (S/N)");
        }

        mostrarReporte();
        sc.close();
    }

    public static void procesarVenta(Scanner sc) {
        boolean seguirComprando = true;

        while (seguirComprando) {
            int sabor = seleccionarSabor(sc);
            if (sabor != -1) {
                System.out.print("Cantidad vendida: ");
                int cantidad = sc.nextInt();
                sc.nextLine();
                cantidades[sabor] += cantidad;
            }

            seguirComprando = preguntarContinuar(sc, "¿Desea incluir otro sabor? (S/N)");
        }
    }

    public static int seleccionarSabor(Scanner sc) {
        System.out.println("*** Sabores ***");
        for (int i = 0; i < SABORES.length; i++) {
            System.out.println((i + 1) + ". " + SABORES[i]);
        }

        System.out.print("Seleccione un sabor (1-" + SABORES.length + "): ");
        int opcion = sc.nextInt();
        sc.nextLine();

        if (opcion < 1 || opcion > SABORES.length) {
            System.out.println("Sabor no identificado, error.");
            return -1;
        }
        return opcion - 1;
    }

    public static boolean preguntarContinuar(Scanner sc, String mensaje) {
        while (true) {
            System.out.println(mensaje);
            String respuesta = sc.nextLine().trim().toUpperCase();
            if (respuesta.equals("S")) return true;
            if (respuesta.equals("N")) return false;
            System.out.println("¡Error! Ingrese 'S' o 'N'.");
        }
    }

    public static void mostrarReporte() {
        System.out.println("\nSabor      Cantidad    Valor");
        int totalVentas = 0;

        for (int i = 0; i < SABORES.length; i++) {
            int totalSabor = cantidades[i] * PRECIOS[i];
            System.out.println(SABORES[i] + "    " + cantidades[i] + "        " + totalSabor);
            totalVentas += totalSabor;
        }

        System.out.println("Ventas Totales: " + totalVentas);
    }
}
