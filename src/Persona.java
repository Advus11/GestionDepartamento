class Persona {
    private String nombre;
    private String run;
    private String estadoCivil;

    // Constructor
    public Persona(String nombre, String run, String estadoCivil) {
        this.nombre = nombre;
        this.run = run;
        this.estadoCivil = estadoCivil;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
}
