import java.util.ArrayList;
import java.util.Scanner;

public class Level1_6 {
    
    public static void main(String[] args) {
        ingresarNumeros();
        System.out.println("-----------");                                 
        
    }
    
    static ArrayList ingresarNumeros() {
        System.out.println("Ingrese dos Numeros enteros: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();  
        scan.close();
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(a);
        numeros.add(b);
        //System.out.println(numeros);
        //System.out.println(numeros.get(0));
        //System.out.println(numeros.get(1));

        potencia(a,b);

        return numeros;
        
    }

    public static void potencia(int a, int b){
        int pot = 1;
        for (int i=1; i<=b; i++){
            pot = pot * a;
        }
        System.out.println("-----------");
        System.out.println(a + " elevado a la " + b + " = " + pot);

    }

    
}