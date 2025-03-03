import java.util.Random;
import java.util.Scanner;

public class punto13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Random numAleatorio = new Random();
        System.out.println("Hola, para participar en el sorteo");
        System.out.println("Escribre H si eres hombre y M si eres mujer.");
       String sexo = sc.nextLine();
       if (sexo.equalsIgnoreCase("h")) {
        System.out.println("Has seleccionado hombre, ahora indica tu nombre:");
        String nombre = sc.nextLine();
        System.out.println("Hola, " + nombre + "ahora te daremos una pelota al azar");
        int numPelota = numAleatorio.nextInt(5)+1; 
        System.out.println("El número que te tocó es el: "+numPelota);
        String premio; 
        switch (numPelota) {
            case 1:
                premio = "un desodorante";
                break;
            case 2: 
            premio = "un sixpack de cerveza";
            break;
            case 3: 
            premio = "una camiseta del Millonarios o del America de Cali";
            break;
            case 4: 
            premio = "una pantaloneta Gucci";
            break;
            case 5: 
            premio = "un sudadera";
            break;
            default:
            premio = "Sin premio";
                break;
        }
       System.out.println("Felicidades "+nombre+" ganaste " + premio + ". Gracias por jugar.");
        
       } else if (sexo.equalsIgnoreCase("m")) {
        System.out.println("Has seleccionado mujer, ahora indica tu nombre:");
        String nombre = sc.nextLine();
        System.out.println("Hola, " + nombre + "ahora te daremos una pelota al azar");
        int numPelota = numAleatorio.nextInt(5)+1; 
        System.out.println("El número que te tocó es el: "+numPelota);
        String premio; 
        switch (numPelota) {
            case 1:
                premio = "una locion";
                break;
            case 2: 
            premio = "un bikini";
            break;
            case 3: 
            premio = "una crema para la cara";
            break;
            case 4: 
            premio = "una plancha para el cabello";
            break;
            case 5: 
            premio = "un esmalte para las uñaa";
            break;
            default:
            premio = "Sin premio";
                break;
        }
       System.out.println("Felicidades "+nombre+" ganaste " + premio + ". Gracias por jugar.");
        }

    }
}

    

