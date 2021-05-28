import java.util.Scanner;

public class Level1_2 {
    public static void main(String[] args) {
        System.out.println("Ingrese 2 Numeros enteros: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(); 
        int b = scan.nextInt(); 
        int suma = a + b;
        int resta = a - b;
        int multiplica = a * b;
        int divide = a / b;
        int modulo = a % b;

        System.out.println(a + " + " + b  + " = " + suma);
        System.out.println(a + " - " + b  + " = " + resta);
        System.out.println(a + " * " + b  + " = " + multiplica);
        System.out.println(a + " / " + b  + " = " + divide);
        System.out.println(a + " mod " + b  + " = " + modulo);
        scan.close();
       
    }
    
    
}
