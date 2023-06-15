class Estudiante extends Persona {
    private String curso;

    // Constructor
    public Estudiante(String nombre, String run, String estadoCivil, String curso) {
        super(nombre, run, estadoCivil);
        this.curso = curso;
    }

    // Getter y setter
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
