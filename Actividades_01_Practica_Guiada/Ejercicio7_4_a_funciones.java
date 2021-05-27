//dado un número de entrada entre 1 a 7, nos devuelva el dia de la semana

import java.util.Scanner;

public class Ejercicio7_4_a_funciones {
    public static void main(String[] args){
        ingresarDia();
       
    }
    public static void ingresarDia() {
        System.out.println("Ingresar numero de día (1 a 7): ");
        Scanner scan = new Scanner(System.in); //creamos objeto scan
        int dia = scan.nextInt(); //lee escanea el numero introducido
        scan.close();
        imprimirDia(dia);
        
    }
    public static void imprimirDia(int dia) {
        if (dia == 1){
            System.out.println("Lunes");
        }
        else if (dia == 2){
            System.out.println("Martes");
        }
        else if (dia == 3){
            System.out.println("Miercoles");
        }
        else if (dia == 4){
            System.out.println("Jueves");
        }
        else if (dia == 5){
            System.out.println("Viernes");
        }
        else if (dia == 6){
            System.out.println("Sabado");
        }
        else if (dia == 7){
            System.out.println("Domingo");
        }
        else {
            System.out.println("No es un día valido");
        }
        
    }

}

