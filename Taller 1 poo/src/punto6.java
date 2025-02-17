import java.util.Scanner;
public class punto6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad;
        double nivelHemoglobina;
        char opcionEdad, genero; 
        System.out.println("Escoja la opción 1 si su edad es en meses.");
        System.out.println("Y si su edad es en años escoja la opción 2");
        opcionEdad=sc.next().charAt(0); 
        if (opcionEdad=='2') {
            System.out.println("Ingrese su edad según la opción escojida anteriormente.");
        edad=sc.nextInt();
        if (edad>15) {
            System.out.println("Ingrese su género: M(masculino) F(femenino).");
       genero=sc.next().charAt(0);
       genero = Character.toUpperCase(genero);
       System.out.println("Ingrese su nivel de hemoglobina.");
        nivelHemoglobina=sc.nextDouble();
        if (genero == 'M') {
            if (nivelHemoglobina>=14 && nivelHemoglobina<=18) {
                System.out.println("Su nivel de hemoglobina está bien.");
            } else if (nivelHemoglobina<14){
                System.out.println("Su nivel de hemoglobina es bajo. POSITIVO para anemia.");
            } else if (nivelHemoglobina>18){
                System.out.println("Su nivel de hemoglobina es mayor. POSITIVO para erictrocitosis.");
            }
        }    else if (genero=='F'){
            if (nivelHemoglobina>=12 && nivelHemoglobina<=16) {
                System.out.println("Su nivel de hemoglobina está bien.");
            } else if (nivelHemoglobina<12){
                System.out.println("Su nivel de hemoglobina es bajo. POSITIVO para anemia.");
            } else if (nivelHemoglobina>16){
                System.out.println("Su nivel de hemoglobina es mayor. POSITIVO para erictrocitosis.");
        }       
       }
    } else if (edad>1 && edad<=5) {System.out.println("Ingrese su nivel de hemoglobina.");
    nivelHemoglobina=sc.nextDouble();
    if (nivelHemoglobina>=11.5 && nivelHemoglobina<=15) {
        System.out.println("Su nivel de hemoglobina está bien.");
    } else if (nivelHemoglobina<11.5){
        System.out.println("Su nivel de hemoglobina es bajo. POSITIVO para anemia.");
    } else if (nivelHemoglobina>15){
        System.out.println("Su nivel de hemoglobina es mayor. POSITIVO para erictrocitosis.");   
}
    } else if (edad>5 && edad<=10) {System.out.println("Ingrese su nivel de hemoglobina.");
    nivelHemoglobina=sc.nextDouble();
    if (nivelHemoglobina>=12.6 && nivelHemoglobina<=15.5) {
        System.out.println("Su nivel de hemoglobina está bien.");
    } else if (nivelHemoglobina<12.6){
        System.out.println("Su nivel de hemoglobina es bajo. POSITIVO para anemia.");
    } else if (nivelHemoglobina>15.5){
        System.out.println("Su nivel de hemoglobina es mayor. POSITIVO para erictrocitosis.");   
        
    } 
}else if (edad>10 && edad<=15) {
        System.out.println("Ingrese su nivel de hemoglobina.");
    nivelHemoglobina=sc.nextDouble();
    if (nivelHemoglobina>=11.5 && nivelHemoglobina<=15) {
        System.out.println("Su nivel de hemoglobina está bien.");
    } else if (nivelHemoglobina<11.5){
        System.out.println("Su nivel de hemoglobina es bajo. POSITIVO para anemia.");
    } else if (nivelHemoglobina>15){
        System.out.println("Su nivel de hemoglobina es mayor. POSITIVO para erictrocitosis.");   
    }
        }
    
}if (opcionEdad=='1') {
    System.out.println("Ingrese su edad según la opción escojida anteriormente.");
edad=sc.nextInt();
if (edad>=0 && edad<=1) {
    System.out.println("Ingrese su nivel de hemoglobina.");
    nivelHemoglobina=sc.nextDouble();
    if (nivelHemoglobina>=13 && nivelHemoglobina<=26) {
        System.out.println("Su nivel de hemoglobina está bien.");
    } else if (nivelHemoglobina<13){
        System.out.println("Su nivel de hemoglobina es bajo. POSITIVO para anemia.");
    } else if (nivelHemoglobina>26){
        System.out.println("Su nivel de hemoglobina es mayor. POSITIVO para erictrocitosis.");

    
    }
} else if (edad>1 && edad<=6) {
    System.out.println("Ingrese su nivel de hemoglobina.");
    nivelHemoglobina=sc.nextDouble();
    if (nivelHemoglobina>=10 && nivelHemoglobina<=18) {
        System.out.println("Su nivel de hemoglobina está bien.");
    } else if (nivelHemoglobina<10){
        System.out.println("Su nivel de hemoglobina es bajo. POSITIVO para anemia.");
    } else if (nivelHemoglobina>18){
        System.out.println("Su nivel de hemoglobina es mayor. POSITIVO para erictrocitosis.");
    
}
} else if (edad>1 && edad<=6) {
    System.out.println("Ingrese su nivel de hemoglobina.");
    nivelHemoglobina=sc.nextDouble();
    if (nivelHemoglobina>=10 && nivelHemoglobina<=18) {
        System.out.println("Su nivel de hemoglobina está bien.");
    } else if (nivelHemoglobina<10){
        System.out.println("Su nivel de hemoglobina es bajo. POSITIVO para anemia.");
    } else if (nivelHemoglobina>18){
        System.out.println("Su nivel de hemoglobina es mayor. POSITIVO para erictrocitosis.");
    
}
}else if (edad>1 && edad<=6) {
    System.out.println("Ingrese su nivel de hemoglobina.");
    nivelHemoglobina=sc.nextDouble();
    if (nivelHemoglobina>=10 && nivelHemoglobina<=18) {
        System.out.println("Su nivel de hemoglobina está bien.");
    } else if (nivelHemoglobina<10){
        System.out.println("Su nivel de hemoglobina es bajo. POSITIVO para anemia.");
    } else if (nivelHemoglobina>18){
        System.out.println("Su nivel de hemoglobina es mayor. POSITIVO para erictrocitosis.");
    
}
} else if (edad>6 && edad<=12) {
    System.out.println("Ingrese su nivel de hemoglobina.");
    nivelHemoglobina=sc.nextDouble();
    if (nivelHemoglobina>=12 && nivelHemoglobina<=15) {
        System.out.println("Su nivel de hemoglobina está bien.");
    } else if (nivelHemoglobina<11){
        System.out.println("Su nivel de hemoglobina es bajo. POSITIVO para anemia.");
    } else if (nivelHemoglobina>15){
        System.out.println("Su nivel de hemoglobina es mayor. POSITIVO para erictrocitosis.");   
}
}
}

sc.close();

    }
}

