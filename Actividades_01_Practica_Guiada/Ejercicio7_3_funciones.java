import java.util.Scanner;

public class Ejercicio7_3_funciones {
    public static void main(String[] args){
        ingresarNota();
        
       
    }

    public static void ingresarNota() {
        System.out.println("Ingresar la Nota del examen: ");
        Scanner scan = new Scanner(System.in);
        int nota = scan.nextInt(); // escanea el proximo entero ingresado, La nota
        scan.close(); //cerrar el scan si no lo usamos mas, BUENA PRACTICA
        imprimirCorrección(nota);
        
    }
    public static void imprimirCorrección( int nota) {
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
