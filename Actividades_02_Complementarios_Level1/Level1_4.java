import java.util.Scanner;

public class Level1_4 {
    public static void main(String[] args) {
        int num = ingresarNumero();
        calculoFactorial(num);
          
        
    }
    static int ingresarNumero() {
        System.out.println("Ingrese un Numero entero: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(); 
        scan.close();
        return a;
    }

    static void calculoFactorial(int num){
        int factorial = 1;
        for (int i=1; i<=num; i++){
            factorial = factorial * i;
        }
        System.out.println("El Factorial de " + num + " es: " + factorial );


    }


    
}
