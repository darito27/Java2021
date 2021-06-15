/*Se dispone de una lista de Empleados, de cada empleado se conoce:
○ Nombre y Apellido
○ DNI
○ horasTrabajadas
○ valorPorHora
Todos los empleados están cargados en un Set (HashSet), se desea calcular el
sueldo (horasTrabajadas x valorPorHora) de toda esa lista para luego
almacenar en un Map (o Diccionario) donde la clave (key) es el dni y el valor
(value) es el sueldo calculado
*/
import java.util.*;

public class Level2_6 {

    public static void main(String[] args) {

        Empleado empleado1 = new Empleado("Jose Brizuela", "12345678", 40, 400);
        Empleado empleado2 = new Empleado("Carlos Valenzuela", "23456789", 45, 450);
        Empleado empleado3 = new Empleado("María Cabrera", "34567890", 35, 350);
        Empleado empleado4 = new Empleado("Patricia Fernandez", "45678901", 50, 500);
        Empleado empleado5 = new Empleado("Pedro Ojeda", "56789012", 30, 300);

        Set<Empleado> empleados = new HashSet<>();{{
        empleados.add(empleado1);
        empleados.add(empleado2);
        empleados.add(empleado3);
        empleados.add(empleado4);
        empleados.add(empleado5);
        }}
        
        System.out.println("--- Lista de Empleados ---");
        for ( Empleado empleado:empleados){
            System.out.println(empleado.nombreYApellido + " - DNI: " + empleado.dni + " Tiene un Sueldo de : " + empleado.sueldo());
        }
        
        Map <String, Integer> sueldos = new HashMap<String, Integer>();
        for ( Empleado empleado:empleados){
            sueldos.put(empleado.dni, empleado.sueldo()); // Añade un elemento al Map
            
        }
        System.out.println("--- Diccionario  DNI : SUELDO ---");
        System.out.println(sueldos);
                
    }

    public static class Empleado {
        String nombreYApellido;
        String dni;
        int horasTrabajadas;
        int valorPorHora;
        public Empleado(String nombreYApellido, String dni, int horasTrabajadas , int valorPorHora){
            this.nombreYApellido = nombreYApellido ;
            this.dni = dni;
            this.horasTrabajadas = horasTrabajadas;
            this.valorPorHora = valorPorHora;
        }
        public int sueldo(){
            return this.horasTrabajadas * this.valorPorHora;
        }
    }

}
