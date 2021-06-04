//Crear una lista que contenga como elementos la numeración de cartas de una
//baraja francesa (solo los valores, no figuras). Se deberá cargar el ArrayList (en orden), 
//imprimir, imprimir en orden inverso (reverse), desordenar (mezclar) el arrayList y volver a imprimir

import java.util.ArrayList;
import java.util.Collections;

public class Level2_3 {

    public static void main(String[] args) {
        ArrayList<String> barajaFrancesa = cargarBaraja();
        System.out.println(barajaFrancesa);    
        imprimeInverso(barajaFrancesa); 
        imprimeDesordenado(barajaFrancesa);    
    }

    //public static void cargarBaraja()
    static ArrayList<String> cargarBaraja() {
        ArrayList<String> barajaFrancesa = new ArrayList<String>();
        for (int i=1; i<=13; i++){
            String baraja = Integer.toString(i);
            barajaFrancesa.add(baraja);
        }        
        return barajaFrancesa;        
    }

    static void imprimeInverso(ArrayList<String> barajaFrancesa){
        Collections.reverse(barajaFrancesa);
        System.out.println(barajaFrancesa);
    }

    static void imprimeDesordenado(ArrayList<String> barajaFrancesa){
        Collections.shuffle(barajaFrancesa);
        System.out.println(barajaFrancesa);

    }
    
}
