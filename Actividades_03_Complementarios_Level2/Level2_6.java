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
    public static void main(String args[]) {
        HashSet<String>  empleados  = new HashSet<String>();
        
        empleados.add("Julio Molina, 12345678, 40, 400 ");
        empleados.add("Mario Quintana, 23456789, 30, 300 ");
        empleados.add("Erica Gonzalez, 13246587, 20, 200 ");        
        
        System.out.println(empleados);

        calculoSueldo(empleados)

    }



}
