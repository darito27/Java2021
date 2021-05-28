import java.util.Scanner;

public class Level1_8 {
    
    public static void main(String[] args) {
        ingresarDatos();
              
    }

    public static void ingresarDatos() {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese Nombre y Apellido: ");
        String nombreYApellido = scan.nextLine();
        
        System.out.println("Ingrese Edad: ");
        String edad = scan.nextLine();
       
        System.out.println("Ingrese Direccion: ");
        String direccion = scan.nextLine();
        
        System.out.println("Ingrese Ciudad: ");
        String ciudad = scan.nextLine();
        scan.close();

        String mensaje = String.format("%s - %s - %s años - %s", ciudad, direccion, edad, nombreYApellido);
        System.out.println(mensaje);
                
    }

}

