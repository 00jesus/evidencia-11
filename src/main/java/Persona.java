public class Persona {
    protected String nombre;
    protected String rut;
    protected String estadoCivil;


    public Persona(String nombre, String rut, String estadoCivil) {
        this.nombre = nombre;
        this.rut = rut;
        this.estadoCivil = estadoCivil;
    }

    public Persona() {
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return this.rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getEstadoCivil() {
        return this.estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", rut='" + rut + '\'' +
                ", estadoCivil='" + estadoCivil + '\'' +
                '}';
    }
}