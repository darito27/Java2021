import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
        //creamos un objeto Scanner que tomara los valores ingresados por consola
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese 3 numeros");
        int a = scan.nextInt(); //escanea el proximo entero que es ingersado
        int b = scan.nextInt(); //que sucede si ingresamos un string?
        int c= scan.nextInt();

        System.out.println("Primero número ingresado es: " + a);
        System.out.println("Segundo número ingresado es: " + b);
        System.out.println("Tercero número ingresado es: " + c);
        scan.close();
    }
    
}
