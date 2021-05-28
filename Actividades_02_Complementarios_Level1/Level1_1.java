import java.util.Scanner;

public class Level1_1 {

    public static void main(String[] args) {
        System.out.println("Ingrese nombre de Usuario: ");
        Scanner scan = new Scanner(System.in);
        String usuario = scan.nextLine();
        System.out.println("HOLA " + usuario);
        scan.close();
       
    }
    
}