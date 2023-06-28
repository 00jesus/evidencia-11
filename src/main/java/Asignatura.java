import java.util.ArrayList;

public class Asignatura {
    private String nombre;
    private ArrayList<Estudiante> listaEstudiantes = new ArrayList<Estudiante>();

    public Asignatura(String nombre, ArrayList<Estudiante> listaEstudiantes) {
        this.nombre = nombre;
        this.listaEstudiantes = listaEstudiantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public ArrayList<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public void setListaEstudiantes(ArrayList<Estudiante> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }

    @Override
    public String toString() {
        return "Asignatura{" +
                "nombre='" + nombre + '\'' +
                ", listaEstudiantes=" + listaEstudiantes +
                '}';
    }
}