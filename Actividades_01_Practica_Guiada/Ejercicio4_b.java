//dado un número de entrada entre 1 a 7, nos devuelva el dia de la semana

import java.util.Scanner;

public class Ejercicio4_b {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in); //creamos objeto scan
        int dia = scan.nextInt();  //lee escanea el numero introducido
        scan.close();
        switch (dia){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            
        }




    }
    
}
