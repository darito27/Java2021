//Dado un archivo de texto (.txt) con el siguiente formato: {nombre},{apellido},{fecha de nacimiento},{sueldo}
//Cálculos (sobre la lista final):
//-- Método que devuelva todos los empleados que comienzan con una letra dada en el apellido
//-- Método que devuelva el empleado más joven y el más viejo (necesito una funcion para calcular el año basado en una fecha)
//-- El empleado que más gana y el que menos gana.
//-- (Opcional): Imprimir todos los empleados en orden alfabético (por nombre y por apellido).

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;
import java.math.BigDecimal;
import java.nio.file.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class EjercicioPropuesto_5 {
    public static void main(String[] args) {
        List<Persona> listaPersonas = new ArrayList<>();
        System.out.println("-------------------------");
        creaPersona(listaPersonas);
        System.out.print("Ingrese la letra con la que comienza el apellido que desea buscar: ");
        Scanner scan = new Scanner(System.in);
        String let = scan.nextLine();
        String letra = let.toUpperCase();
        System.out.println("-------------------------");
        System.out.println("Empleados cuyo apellido comienza con " + letra);
        empiezaCon(listaPersonas, letra);
        System.out.println("-------------------------");
        System.out.println("El empleado de mayor edad se llama: " + deMayorEdad(listaPersonas));
        System.out.println("El empleado de menor edad se llama: " + deMenorEdad(listaPersonas));
        System.out.println("El empleado que más gana se llama: " + queMasGana(listaPersonas));
        System.out.println("El empleado que menos gana se llama: " + queMenosGana(listaPersonas));
        System.out.println("-------------------------");
        System.out.println("Empleados por Orden Alfabético: ");
        System.out.println(ordenAlfabetico(listaPersonas));
        scan.close();
    }
    
        static void creaPersona(List<Persona> listaPersonas) {
        String archivo = "empleados.txt";
        try (Stream<String> stream = Files.lines(Paths.get(archivo))){
            stream.forEach((e) -> {
                String[] lista = e.split(",");
                String nombre = lista[0];
                String apellido = lista[1];
                String fchNac = lista[2];
                String sueldo = lista[3];
                Persona persona = new Persona(nombre, apellido, fchNac, sueldo);
                listaPersonas.add(persona);
            });
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error..." + e.getMessage());
        }
    }

    static void empiezaCon(List<Persona> listaPersonas, String letra) {
        listaPersonas.forEach((emp) -> {
            if (emp.apellido.startsWith(letra)) {
                System.out.println(emp.apellido + ", " + emp.nombre);
            }
        });
    }

    static Persona deMayorEdad(List<Persona> listaPersonas) {
        if (listaPersonas.size() != 0) {
            int comp = 0;
            for (int i = 0; i < listaPersonas.size(); i++) {
                if (comp < listaPersonas.get(i).edad()) {
                    comp = listaPersonas.get(i).edad();
                }
            }
            for (int i = 0; i < listaPersonas.size(); i++) {
                if (listaPersonas.get(i).edad() == comp) {
                    System.out.println(listaPersonas.get(i).edad());
                    return listaPersonas.get(i);
                }
            }
        }
        else {
            System.out.println("Archivo vacío.!!");
        }
        return null;
    }

    static Persona deMenorEdad(List<Persona> listaPersonas) {
        if (listaPersonas.size() != 0) {
            int comp = listaPersonas.get(0).edad();
            for (int i = 0; i < listaPersonas.size(); i++) {
                if (comp > listaPersonas.get(i).edad()) {
                    comp = listaPersonas.get(i).edad();
                }
            }
            for (int i = 0; i < listaPersonas.size(); i++) {
                if (listaPersonas.get(i).edad() == comp) {
                    return listaPersonas.get(i);
                }
            }
        }
        else {
            System.out.println("Archivo vacío.!!");
        }
        return null;
    }

    static Persona queMasGana(List<Persona> listaPersonas) {
        if (listaPersonas.size() != 0) {
            BigDecimal comp = listaPersonas.get(0).sueldo;
            for (int i = 0; i < listaPersonas.size(); i++) {
                if (comp.compareTo(listaPersonas.get(i).sueldo) == -1 ) {
                    comp = listaPersonas.get(i).sueldo;
                }
            }
            for (int i = 0; i < listaPersonas.size(); i++) {
                if (listaPersonas.get(i).sueldo == comp) {
                    return listaPersonas.get(i);
                }
            }
        }
        else {
            System.out.println("El archivo está vacío...");
        }
        return null;
    }
    
    static Persona queMenosGana(List<Persona> listaPersonas) {
        if (listaPersonas.size() != 0) {
            BigDecimal comp = listaPersonas.get(0).sueldo;
            for (int i = 0; i < listaPersonas.size(); i++) {
                if (comp.compareTo(listaPersonas.get(i).sueldo) == 1 ) {
                    comp = listaPersonas.get(i).sueldo;
                }
            }
            for (int i = 0; i < listaPersonas.size(); i++) {
                if (listaPersonas.get(i).sueldo == comp) {
                    return listaPersonas.get(i);
                }
            }
        }
        else {
            System.out.println("El archivo está vacío...");
        }
        return null;
    }

    static List<Persona> ordenAlfabetico(List<Persona> listaPersonas) {
        // Collections.sort(lista);
        listaPersonas.sort((o1, o2) -> o1.nombre.compareTo(o2.nombre));
        return listaPersonas;
    }

    static class Persona {
        private String nombre;
        private String apellido;
        private LocalDate fchNac;
        private BigDecimal sueldo;

        public Persona(String nombre, String apellido, String fchNac, String sueldo) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.fchNac = toFecha(fchNac);
            this.sueldo = new BigDecimal(sueldo);
        }

        private LocalDate toFecha(String fchNac) {
            DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate fecha = LocalDate.parse(fchNac, formatoFecha);
            return fecha;
        }

        private int edad() {
            int diferencia = (int) ChronoUnit.DAYS.between(this.fchNac, LocalDate.now());
            return diferencia/365;
        }

        @Override
        public String toString() {
            return this.nombre + " " + this.apellido + ": $" + this.sueldo;
        }
    }
}