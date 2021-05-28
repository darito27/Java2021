//Crear un ArrayList y cargarlo con tus ciudades favoritas de Argentina, 
//luego imprimir por pantalla el ranking

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Level2_1 {

    public static void main(String[] args) {
        ciudadesFavoritas();
    }

    public static void ciudadesFavoritas(){
        List<String> ciudades = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);
        
        boolean control = true;
        while (control) {
            System.out.println("Ingrese ciudad Favorita: o z para salir ");
            String ciudad = scan.nextLine();
            System.out.println(ciudad);
            if (ciudad == "z") {
                control = false;
            }
            //else {
            ciudades.add(ciudad); 
            //}
            
            System.out.println(ciudades);
        }
        scan.close(); 
        System.out.println(ciudades);
    }
    
}