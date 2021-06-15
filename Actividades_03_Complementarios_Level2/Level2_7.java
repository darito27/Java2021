/*
Crear una función que dado 2 argumentos (int, siendo el primero menor al segundo), 
nos devuelva un array de Strings. Con la secuencia de números enteros de principio a final. 
Pero si el número es multiplo de 2 colocara el valor “Fizz”, 
si es múltiplo de 3 “Buzz” y si es a la vez múltiplo de ambos colocara “FizzBuzz”.
Observacion: Los 2 argumentos indican con que valor se arranca a calcular y el
segundo con qué valor debe frenar (no se incluye en el cálculo)
Ejemplo: (1, 5) ----> calculará valores de 1, 2, 3, 4
*/

import java.util.*;

public class Level2_7 {

    public static void main(String[] args) {
        System.out.println("-------------");
        System.out.println(" Introduce 2 numeros enteros, el primero menor que el segundo :");
        Scanner scan = new Scanner(System.in);
        System.out.print(" Numero 1 : ");
        String numero1 = scan.nextLine();
        System.out.print(" Numero 2 : ");
        String numero2 = scan.nextLine();
        System.out.println("-------------");
        

        List<String> numeros = new ArrayList<String>();
        int uno = Integer.parseInt(numero1);
        int dos = Integer.parseInt(numero2);
        String valor = null;
        for (int i=uno; i<=dos; i++){
            System.out.print("numero " + i);
            if (i%2 == 0 && i%3 == 0){
                valor = "FizzBuzz";
                numeros.add(valor);
            }
            else if (i%2 != 0 && i%3 != 0){
                valor = "  ";
                numeros.add(valor);
            }
            else if (i%3 == 0){
                valor = "Buzz";
                numeros.add(valor);
            }
            else if (i%2 == 0){
                valor = "Fizz";
                numeros.add(valor);
            }

            System.out.println(" " + valor);
            

        }
        System.out.println("-------------");
        System.out.println(numeros);
        scan.close();
                
    }
    
}
