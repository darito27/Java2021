//programa que nos realizará una pregunta si queremos realizar una
//operación dada o si deseamos salir/terminar el programa.
//Utilizaremos en este caso una simple operación que nos pide un número 
//y luego lo  imprime

import java.util.Scanner;

public class Ejercicio6_b {
        public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int continuar = 1;
        int nro;
        while (continuar == 1){
            System.out.println("Ingrese un número");
            nro = scan.nextInt(); // escanea el proximo entero ingresado
            System.out.println("El numero ingresado es: " + nro);

            System.out.println("Si desea continuar presione 1, si no cualquier otro ");
            continuar = scan.nextInt(); // escanea el proximo numero y lo asigna a continuar

        }
    }
}
