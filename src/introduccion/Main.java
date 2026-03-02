package introduccion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static List<String> estudiantes = new ArrayList<>();
    static List<Double> calificaciones = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    
    
    public static void main(String[] args) {
    	int opcion=0;
  		
	        while (opcion != 5) {

        System.out.println("\n===== MENÚ PRINCIPAL =====");
        System.out.println("1. Agregar estudiante");
        System.out.println("2. Mostrar lista de estudiantes");
        System.out.println("3. Calcular promedio de calificaciones");
        System.out.println("4. Mostrar estudiante con la calificación más alta");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");

         opcion = Integer.parseInt(scanner.nextLine());
        	

            switch (opcion) {
                case 1:
              	  		agregarEstudiantes();
              	  		
                    break;
                case 2:
              	  		mostrarEstudiantes();
                    break;
                case 3:
                		calcularPromedio();
                    break;
                case 4:
                		mostrarNotayEstudiante();
                    break;
                case 5:
              	  System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
    }
        }
    
    public static void agregarEstudiantes() {
    	   System.out.print("Ingrese el nombre del estudiante: ");
           String nombre = scanner.nextLine();

           System.out.print("Ingrese la calificación del estudiante: ");
           double calificacion = Double.parseDouble(scanner.nextLine());

           estudiantes.add(nombre);
           calificaciones.add(calificacion);

           System.out.println("Estudiante agregado correctamente.");
       }
    
    public static void mostrarEstudiantes() {
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
        } else {
            System.out.println("\nLista de estudiantes:");
            for (int i = 0; i < estudiantes.size(); i++) {
                System.out.println(estudiantes.get(i) +
                        " - Calificación: " + calificaciones.get(i));
            }
        }
        }
    
    public static void calcularPromedio() {
        if (calificaciones.isEmpty()) {
            System.out.println("No hay calificaciones registradas.");
        } else {
            double suma = 0;

            for (double calificacion : calificaciones) {
                suma += calificacion;
            }

            double promedio = suma / calificaciones.size();
            System.out.println("El promedio de calificaciones es: " + promedio);
        }
        }
    
    public static void mostrarNotayEstudiante() {

        if (calificaciones.isEmpty()) {
            System.out.println("No hay calificaciones registradas.");
        } else {

            double maxCalificacion = calificaciones.get(0);
            String estudianteMax = estudiantes.get(0);

            for (int i = 1; i < calificaciones.size(); i++) {
                if (calificaciones.get(i) > maxCalificacion) {
                    maxCalificacion = calificaciones.get(i);
                    estudianteMax = estudiantes.get(i);
                }
            }

            System.out.println("El estudiante con la calificación más alta es: "
                    + estudianteMax + " con " + maxCalificacion);
        }
    }
    
    
    
    
    
  
    }

