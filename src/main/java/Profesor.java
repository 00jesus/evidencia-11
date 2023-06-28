import java.util.ArrayList;

public class Profesor extends PersonalContratado {
    private ArrayList<Asignatura> listaAsignaturas = new ArrayList<Asignatura>();

    public Profesor(String nombre, String rut, String estadoCivil, String añoIncorporacion, ArrayList<Asignatura> listaAsignaturas) {
        super(nombre, rut, estadoCivil, añoIncorporacion);
        this.listaAsignaturas = listaAsignaturas;
    }

    public Profesor (ArrayList<Asignatura> listaAsignaturas) {
    }


    public ArrayList<Asignatura> getListaAsignaturas() {
        return listaAsignaturas;
    }

    public void setListaAsignaturas(ArrayList<Asignatura> listaAsignaturas) {
        this.listaAsignaturas = listaAsignaturas;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                ", listaAsignaturas=" + listaAsignaturas +
                ", añoIncorporacion='" + añoIncorporacion + '\'' +
                ", nombre='" + nombre + '\'' +
                ", rut='" + rut + '\'' +
                ", estadoCivil='" + estadoCivil + '\'' +
                '}';
    }
}