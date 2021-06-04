//Cargar un arrayList con 12 nombres de estudiantes (String), 
//luego separarlos en 3 cursos (3 arrayList) e imprimir dichos cursos

import java.util.ArrayList;
import java.util.Scanner;

import java.util.List;

public class Level2_4 {

    public static void main(String[] args) {
        ArrayList<String> estudiantes = cargarEstudiantes();
        System.out.println(estudiantes);    
        separaEnCursos(estudiantes);         
    }

    
    static ArrayList<String> cargarEstudiantes() {
        ArrayList<String> estudiantes = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);
        for (int i=1; i<=12; i++){
            System.out.println("Ingrese nombre del estudiante:");
            String estudiante = scan.nextLine();
            estudiantes.add(estudiante);
        }        
        scan.close();
        return estudiantes;        
    }

    static void separaEnCursos(ArrayList<String> estudiantes){
        List<String> cursoA = estudiantes.subList(0, 4);
        List<String> cursoB = estudiantes.subList(4, 8);
        List<String> cursoC = estudiantes.subList(8, 12);
        
        System.out.println("Estudiantes del Curso A: " + cursoA);
        System.out.println("Estudiantes del Curso B: " + cursoB);
        System.out.println("Estudiantes del Curso C: " + cursoC);
    }
    
}
