import java.util.ArrayList;
class Profesor extends PersonalContratado {
    private ArrayList<Asignatura> asignaturas;

    // Constructor
    public Profesor(String nombre, String run, String estadoCivil, int anoIncorporacion) {
        super(nombre, run, estadoCivil, anoIncorporacion);
        this.asignaturas = new ArrayList<>();
    }

    // Métodos para agregar y obtener asignaturas
    public void agregarAsignatura(Asignatura asignatura) {
        asignaturas.add(asignatura);
    }

    public ArrayList<Asignatura> getAsignaturas() {
        return asignaturas;
    }
}