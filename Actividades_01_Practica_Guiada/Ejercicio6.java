//programa que nos realizará una pregunta si queremos realizar una
//operación dada o si deseamos salir/terminar el programa.
//Utilizaremos en este caso una simple operación que nos pide un número 
//y luego lo  imprime

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        System.out.println("Ingrese un número :");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println("Desea imprimir (1) o salir(2)? ");
        int b = scan.nextInt();
        scan.close();
        if (b == 1){
            System.out.println("El numero ingresado es: " + a);
        }
       

        
    }
    
}
