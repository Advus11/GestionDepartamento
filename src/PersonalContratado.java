class PersonalContratado extends Persona {
    private int anoIncorporacion;

    // Constructor
    public PersonalContratado(String nombre, String run, String estadoCivil, int anoIncorporacion) {
        super(nombre, run, estadoCivil);
        this.anoIncorporacion = anoIncorporacion;
    }

    // Getter y setter
    public int getAnoIncorporacion() {
        return anoIncorporacion;
    }

    public void setAnoIncorporacion(int anoIncorporacion) {
        this.anoIncorporacion = anoIncorporacion;
    }
}

