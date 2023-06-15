import java.util.ArrayList;

class Departamento {

    private String nombre;
    private ArrayList<Profesor> profesores;
    private ArrayList<PersonalContratado> personalContratado;

    // Constructor
    public Departamento(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.personalContratado = new ArrayList<>();
    }
    public String getNombre() { //getter de nombre
        return nombre;
    }

    // Métodos para agregar profesores y personal contratado
    public void agregarProfesor(Profesor profesor) {
        profesores.add(profesor);
    }

    public void agregarPersonalContratado(PersonalContratado personal) {
        personalContratado.add(personal);
    }

    public ArrayList<Persona> buscarPersonalPorCurso(String curso) { // Método para buscar estudiantes y profesores por curso
        ArrayList<Persona> personalEncontrado = new ArrayList<>();
        for (Profesor profesor : profesores) {
            for (Asignatura asignatura : profesor.getAsignaturas()) {
                if (asignatura.getCurso().equals(curso)) {
                    personalEncontrado.add(profesor);
                    personalEncontrado.addAll(asignatura.getEstudiantes());
                }
            }
        }
        return personalEncontrado;
    }
    public void mostrarPersonal() { // Método para mostrar todo el personal del departamento
        for (Profesor profesor : profesores) {
            System.out.println("Nombre: " + profesor.getNombre() + ", Ano de incorporacion: " + profesor.getAnoIncorporacion() +", Especialidad: Profesor" );
        }
        for (PersonalContratado personal : personalContratado) {
            System.out.println("Nombre: " + personal.getNombre() + ", Ano de incorporacion: " + personal.getAnoIncorporacion() + ", Especialidad: Administrativo");
        }
    }
}

