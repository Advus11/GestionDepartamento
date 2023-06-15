import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Departamento departamento = new Departamento("Universidad de la Frontera");

        Profesor profesor1 = new Profesor("Pedro Pascal", "12455988-0", "Viudo", 2008);
        Profesor profesor2 = new Profesor("Maria de las Nieves", "14044877-3", "Casada", 2018);
        Administrativo administrativo1 = new Administrativo("Leonardo Villegas", "15232477-8", "Casado", 2010);
        Estudiante estudiante1 = new Estudiante("Adonis Subiabre", "20528583-0", "Soltero", "PGC");
        Estudiante estudiante2 = new Estudiante("Jade", "21186838-4", "Soltera", "IPS");
        Asignatura asignatura1 = new Asignatura("Programacion", "PGC");
        Asignatura asignatura2 = new Asignatura("Int. Psicologia", "IPS");

        profesor1.agregarAsignatura(asignatura1); //Agrega asignatura segun se requiera
        profesor2.agregarAsignatura(asignatura2);

        asignatura1.agregarEstudiante(estudiante1); //Agrega estudiante segun se requiera
        asignatura2.agregarEstudiante(estudiante2);

        departamento.agregarProfesor(profesor1); //Agrega profesor a departamento
        departamento.agregarProfesor(profesor2);
        departamento.agregarPersonalContratado(administrativo1);

        int opcion;
        boolean salir = false;

        while (!salir) {
            System.out.println("Menu:");
            System.out.println("1. Mostrar todo el personal del departamento");
            System.out.println("2. Buscar personal por curso (Codigo)");
            System.out.println("3. Salir");
            System.out.print("Ingrese una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer de entrada

            switch (opcion) {
                case 1:
                    mostrarPersonalDepartamento(departamento);
                    break;
                case 2:
                    buscarPersonalPorCurso(departamento, scanner);
                    break;
                case 3:
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion invalida. Intente nuevamente.");
                    break;
            }
        }
    }

    private static void mostrarPersonalDepartamento(Departamento departamento) {
        System.out.println("Personal del departamento " + departamento.getNombre() + ":");
        departamento.mostrarPersonal();
        System.out.println();
    }

    private static void buscarPersonalPorCurso(Departamento departamento, Scanner scanner) {
        String curso = pedirCurso(scanner);
        ArrayList<Persona> personalEncontrado = departamento.buscarPersonalPorCurso(curso);

        System.out.println("\nPersonal encontrado para el curso " + curso + ":");
        for (Persona persona : personalEncontrado) {
            if (persona instanceof Profesor) {
                Profesor profesor = (Profesor) persona;
                System.out.println("Nombre: " + profesor.getNombre() + ", Profesor");
            } else if (persona instanceof Estudiante) {
                Estudiante estudiante = (Estudiante) persona;
                System.out.println("Nombre: " + estudiante.getNombre() + ", Estudiante");
            }
        }
        System.out.println();
    }

    private static String pedirCurso(Scanner scanner) {
        System.out.print("Ingrese el curso a buscar: ");
        return scanner.nextLine();
    }
}
