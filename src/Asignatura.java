import java.util.ArrayList;
class Asignatura {
    private String nombre;
    private String curso;
    private ArrayList<Estudiante> estudiantes;

    // Constructor
    public Asignatura(String nombre, String curso) {
        this.nombre = nombre;
        this.curso = curso;
        this.estudiantes = new ArrayList<>();
    }

    // Métodos para agregar y obtener estudiantes
    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
