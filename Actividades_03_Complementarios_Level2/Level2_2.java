//Crear un ArrayList, agregar 5 números enteros. 
//Luego, agregar un número entero al principio de la lista y otro al final. 
//Por último, iterar e imprimir los elementos de la lista y el tamaño de la misma 
//(antes y después de agregar a en la primera y última posición).

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Level2_2 {

    public static void main(String[] args) {
        crearArrayList();
        System.out.println("--------------");  
        
    }

    public static void crearArrayList() {
        List<Integer> lista = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese 5 Numeros enteros: ");
        
        for (int i=1; i<=5; i++){
            Integer entero = scan.nextInt();
            lista.add(entero);
        }
        System.out.println(lista);
        System.out.println("--------------");   
                
        System.out.println("Ingrese Numero Inicial: ");
        Integer enteroInicio = scan.nextInt();
        lista.add(0, enteroInicio);
        //scan.close();
        System.out.println(lista);
        System.out.println("--------------");  

        System.out.println("Ingrese Numero Final: ");
        Integer enteroFin = scan.nextInt();
        lista.add(6, enteroFin);
        scan.close();
        System.out.println(lista);
        System.out.println("--------------");          
           
    }

}
    
    

