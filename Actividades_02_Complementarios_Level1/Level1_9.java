import java.util.Scanner;

/* Dado un String de entrada (frase, texto, etc) calcular la cantidad de veces
que aparece una letra dada. */

public class Level1_9 {
    public static void main(String[] args) {
        String[] fraseYLetra = ingresarPalabra();
        String frase = fraseYLetra[0];
        String letra = fraseYLetra[1];
        contarLetras(frase, letra);
    }


    static void contarLetras(String frase, String letra) {
        char[] fra = frase.toCharArray();
        char let = letra.charAt(0);
        int cant = 0;
        for (int i = 0; i < fra.length; i++) {
            if (fra[i] == let) {
                cant ++;
            }
        }
        String mensaje = String.format("La letra %s se repite %d veces", let, cant);
        System.out.println(mensaje);
    }

    static String[] ingresarPalabra() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese una Palabra o Frase:");
        String frase = scan.nextLine();
        System.out.println("Ingrese la letra a contar:");
        String letra = scan.nextLine();
        scan.close();
        String[] fraseYLetra = {frase, letra};
        return fraseYLetra;
    }
}