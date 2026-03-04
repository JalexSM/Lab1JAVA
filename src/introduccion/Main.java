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

         opcion =  leerEntero();
        	

            switch (opcion) {
                case 1:
                	ingresoDeEstudiante();
              	
                    break;
                case 2:
              	  		mostrarEstudiantes();
              	  		
                    break;
                case 3:
                	promediodelosEstudiantes();
                		
                    break;
                case 4:
                		notasMax();
                		
                    break;
                case 5:
              	  System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
    }
        }
    
    //VALIDACIONES 
    
    public static int leerEntero() {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Debe ingresar un número válido: ");
            }
        }
    }

    
    public static double leerDouble() {
        while (true) {
            try {
                double valor = Double.parseDouble(scanner.nextLine());

                if (valor >= 0 && valor <= 100) {
                    return valor;
                } else {
                    System.out.print("La calificación debe estar entre 0 y 100: ");
                }

            } catch (NumberFormatException e) {
                System.out.print("Entrada inválida. Ingrese una calificación válida: ");
            }
        }
    }
    
    public static String leerNombre() {
        while (true) {
            String nombre = scanner.nextLine().trim();

            // Verifica que no esté vacío
            if (nombre.isEmpty()) {
                System.out.print("El nombre no puede estar vacío. Intente nuevamente: ");
                continue;
            }

            // Verifica que solo tenga letras y espacios
            if (!nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) { //a-z y A-Z ademas de Ciertos caracteres especiales como lo son las tildes y la Ñ
                System.out.print("El nombre solo debe contener letras. Intente nuevamente: ");
                continue;
            }

            return nombre;
        }
    }
   
// MODULOS
    
    //#1 INGRESO DE ESTUDIANTES
   
   public static void agregarEstudiante(String nombre, double calificacion) {
	    estudiantes.add(nombre);
	    calificaciones.add(calificacion);
	}
  
   public static void ingresoDeEstudiante() {
	    System.out.print("Ingrese el nombre del estudiante: ");
	    String nombre = leerNombre();

	    System.out.print("Ingrese la calificación del estudiante: ");
	    double calificacion = leerDouble();

	    agregarEstudiante(nombre, calificacion);

	    System.out.println("Estudiante agregado correctamente.");
	}
   
   
   
   // #2 MOSTRAR  ESTUDIANTES
   
   
   
   
   public static void mostrarEstudiantes() {
       if (!hayEstudiantes() ) {
           System.out.println("No hay estudiantes registrados.");
       } else {
       	imprimirListaEstudiantes();
           }
       }
    
    public static boolean hayEstudiantes() {
    	return !estudiantes.isEmpty();
    }
    
    public static void imprimirListaEstudiantes() {
	    for (int i = 0; i < estudiantes.size(); i++) {
	        System.out.println("Nombre: " + estudiantes.get(i) +
	                           " | Calificación: " + calificaciones.get(i));
	    }
	}
    
    // #3 CALCULO DE PROMEDIO 

    public static void promediodelosEstudiantes() {
    	if(!hayCalificaciones()  ) {
    		System.out.println("No hay calificacione registradas");
    	}else {
    		calcularPromedio();
    	}
    }
    public static boolean hayCalificaciones() {
    	return !calificaciones.isEmpty();
    }
    
    
    public static void calcularPromedio() {
  	  	double suma = 0;

  	  		for (double calificacion : calificaciones) {
  	  			suma += calificacion;
  	  		}

  	  		double promedio = suma / calificaciones.size();
        System.out.println("El promedio de calificaciones es: " + promedio);
    }

          
    // #4 NOTA MAS ALTA
    
    public static void notasMax() {
    	if(!hayCalificaciones()) {
    		
    	
    		System.out.println("No hay calificacione registradas");
    		}else {
    			estudianteMax();
    			
    		}
    }
    
    public static void estudianteMax() {
    	
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
    
    