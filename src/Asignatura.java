import java.util.ArrayList;
class Asignatura {
    private String nombre;
    private int creditos;
    private String curso;
    private ArrayList<Estudiante> estudiantes;

    // Constructor
    public Asignatura(String nombre, int creditos, String curso) {
        this.nombre = nombre;
        this.creditos = creditos;
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

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
