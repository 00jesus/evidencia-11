public class PersonalContratado extends Persona {
    protected String añoIncorporacion;

    public PersonalContratado(String nombre, String rut, String estadoCivil, String añoIncorporacion) {
        super(nombre, rut, estadoCivil);
        this.añoIncorporacion = añoIncorporacion;
    }
    public PersonalContratado () {
        super();
    }

    public PersonalContratado(String añoIncorporacion) {
        this.añoIncorporacion = añoIncorporacion;
    }


    public String getAñoIncorporacion() {
        return this.añoIncorporacion;
    }

    public void setAñoIncorporacion(String añoIncorporacion) {
        this.añoIncorporacion = añoIncorporacion;
    }




}