//Realizar un Programa que dado un String de entrada en minúsculas lo
//convierta por completo a mayúsculas. Sin uso de métodos o librerías que
//realicen toUppercase()

import java.util.Scanner;


public class Level1_7 {
    public static void main(String[] args) {
        pasarAMayuscula();
    }


    static void pasarAMayuscula() {
        System.out.println("Introduce una palabra en minusculas: ");
        Scanner scan = new Scanner(System.in);
        String palabraMinuscula = scan.nextLine();
        scan.close();
        char[] caracteres = palabraMinuscula.toCharArray();
        for (int i = 0; i < caracteres.length; i++) {
            char a = caracteres[i];
            int ascii = a;
            int ascii2 = ascii - 32;
            a = (char)ascii2;
            caracteres[i] = a;

        }
        caracteres.toString();
        System.out.println("Lo que en Mayúsculas sería: ");
        System.out.println(caracteres);
    }

      
}



















/*import java.util.Scanner;
import java.util.ArrayList;





public class Level1_7 {

    public static void main(String[] args) {
        System.out.println("Ingrese una palabra en minustulas: ");
        Scanner scan = new Scanner(System.in);
        String palabra = scan.nextLine();
        convertirEnArray(palabra);
        //convertirEnAscii(palabraMinuscula);
        scan.close();
    }        
       


    public static convertirEnArray(palabra) {
        char[] numeros = palabra.toCharArray();
        System.out.println(numeros);
        ArrayList<String> numeros = new ArrayList<String>();
        for (int i=1; i<=palabra.length; i++){
            a = palabra(i);
            numeros.add(a);
        System.out.println(numeros);
        return numeros;

    }



        
    public static convertirEnAscii(palabraMinuscula) {

        
    }
    
}

*/