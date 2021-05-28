import java.util.Scanner;

public class Level1_3 {
    
    public static void main(String[] args) {
        int num = ingresarNumero();
        imprimirSecuencia(num);
          
        
    }
    
    static int ingresarNumero() {
        System.out.println("Ingrese un Numero entero: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(); 
        scan.close();
        return a;
    }

    static void imprimirSecuencia(int num){
        String numero = "";
        for (int i=1; i<=num; i++){
            System.out.println(numero += i );
        }




    }
    

    
}
