import java.util.Scanner;

public class Ejercicio7_2_funciones {
    public static void main(String[] args){
        System.out.println("Ingresar 3 numeros");
        ingresarTresNumeros();
      
    }

    public static void ingresarTresNumeros(){
        //creamos un objeto Scanner que tomara los valores ingresados por consola
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(); //escanea el proximo entero que es ingersado
        int b = scan.nextInt(); //que sucede si ingresamos un string?
        int c= scan.nextInt();
        System.out.println("-------------------");
        scan.close();
        imprimirNumeros(a,b,c);
    }

    public static void imprimirNumeros(int a, int b, int c) {
        System.out.println("Primero número ingresado es: " + a);
        System.out.println("Segundo número ingresado es: " + b);
        System.out.println("Tercero número ingresado es: " + c);
       
    }
        
}
