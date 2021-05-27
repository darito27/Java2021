import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){
        //creamos objetos Sanner que toma los valores de entrada por consola
        Scanner scan = new Scanner(System.in);
        int nota = scan.nextInt(); // escanea el proximo entero ingresado, La nota
        scan.close(); //cerrar el scan si no lo usamos mas, BUENA PRACTICA
        if (nota > 92){
            System.out.println("Excelente");
        } 
        else if (nota > 84){
            System.out.println("Sobresaliente");
        } 
        else if (nota > 74){
            System.out.println("Distinguido");
        } 
        else if (nota > 59){
            System.out.println("Bueno");
        } 
        else {
            System.out.println("Desaprobado");
        }
    }

}
