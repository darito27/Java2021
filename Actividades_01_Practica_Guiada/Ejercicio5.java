//dado un número entero ingresado, nos retorne los valores
//de ese número multiplicado por 1, 2, 3, … y 10
//la tabla de multiplicar de ese numero

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        scan.close();

        for (int i=1; i<=10; i++){
            System.out.println(a + " * " + i + " = " + a*i);
        }
        
    }
    
}
