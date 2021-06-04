//Dados 2 ArrayList que contienen horas-trabajadas (array1) y
//valor-por-hora(array2) del resumen de carga de horas semanal de un empleado. 
//Se debe generar otra lista que contenga los totales y luego imprimir el total final a cobrar 

import java.util.ArrayList;
import java.util.Scanner;

public class Level2_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //int totalCobrar;
        ArrayList<Integer> horasTrabajadas = cargarHoras(scan);
        ArrayList<Integer> valorHora = cargarValorHoras(scan);
        ArrayList<Integer> totalesPorDia = totalesPorDia(horasTrabajadas, valorHora);
        int total = totalACobrar(totalesPorDia);
        System.out.println("-----------------------------");  
        System.out.println("Cantidades Diarias de Horas Trabajadas: " + horasTrabajadas);    
        System.out.println("Valores Diarios por Hora Trabajada: " + valorHora);  
        System.out.println("Totales Diarios a Cobrar: " + totalesPorDia);
        System.out.println("-----------------------------");   
        System.out.println("Total a Cobrar por los 5 Dias: " + total);
        System.out.println("-----------------------------");   
        scan.close();       
    }

    static ArrayList<Integer> cargarHoras(Scanner scan) {
        ArrayList<Integer> horasTrabajadas = new ArrayList<Integer>();
        
        for (int i=1; i<=5; i++){
            System.out.println("Cargar las horas trabajadas del día: " + i);
            int hora = scan.nextInt();
            horasTrabajadas.add(hora);
        }           
        return horasTrabajadas;        
    }

    static ArrayList<Integer> cargarValorHoras(Scanner scan) {
        ArrayList<Integer> valorHora = new ArrayList<Integer>();
       
        for (int i=1; i<=5; i++){
            System.out.println("Cargar el valor de las horas del día: " + i);
            int valor = scan.nextInt();
            valorHora.add(valor);
        }        
        scan.close();
        return valorHora;        
    }

    static ArrayList<Integer> totalesPorDia(ArrayList<Integer> horasTrabajadas, ArrayList<Integer> valorHora) {
        ArrayList<Integer> totalesDelDia = new ArrayList<Integer>();       
        for (int i=0; i<=4; i++){                       
            int totales = horasTrabajadas.get(i) * valorHora.get(i) ;
            totalesDelDia.add(totales);
        }               
        return totalesDelDia;        
    }

    static int  totalACobrar(ArrayList<Integer> totalesPorDia) {
        System.out.println("-------- : " + totalesPorDia); 
        int totalCobrar = 0;  
        System.out.println("---------------");      
        for (int i=0; i<=4; i++){                       
            totalCobrar = totalCobrar + totalesPorDia.get(i);
            System.out.println("cobro día: " + (i+1) + " : " + totalesPorDia.get(i)); 

        }               
        return totalCobrar;        
    }
}
