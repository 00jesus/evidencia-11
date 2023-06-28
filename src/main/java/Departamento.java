import java.util.ArrayList;
import java.util.Locale;

public class Departamento {
    private ArrayList<Estudiante> listaEstudiantes = new ArrayList<Estudiante>();
    private ArrayList<Administrativo> listaAdministrativos = new ArrayList<Administrativo>();
    private ArrayList<Profesor> listaProfesores = new ArrayList<Profesor>();

    public Departamento(ArrayList<Estudiante> listaEstudiantes, ArrayList<Administrativo> listaAdministrativos, ArrayList<Profesor> listaProfesores) {
        this.listaEstudiantes = listaEstudiantes;
        this.listaAdministrativos = listaAdministrativos;
        this.listaProfesores = listaProfesores;
    }

    public Departamento () {
    }

    public void mostrarTodoPersonal() {
        throw new UnsupportedOperationException();
    }

    public ArrayList<Profesor> buscarProfesoresEnAsignatura(Asignatura asignaturaBuscada) {
        ArrayList<Profesor> listaProfesoresAsociados = new ArrayList<>();
        for (Profesor prof: listaProfesores         ) {
            for (Asignatura asignaturaRecorrida: prof.getListaAsignaturas()) {
                if (asignaturaRecorrida.getNombre().toLowerCase(Locale.ROOT).equals(asignaturaBuscada.getNombre().toLowerCase(Locale.ROOT)) ) {
                    listaProfesoresAsociados.add(prof);
                }
            }
        }
        return listaProfesoresAsociados;
    }

    public ArrayList<Asignatura> buscarAsignaturasDeProfesor (Profesor profe) {
        return profe.getListaAsignaturas();
    }
    public ArrayList<Estudiante> buscarEstudiantesEnAsignatura(Asignatura asignaturaBuscada) {
        ArrayList<Estudiante> estudiantesEnAsigantura = new ArrayList<>();
        for (Estudiante est: asignaturaBuscada.getListaEstudiantes()) {
            estudiantesEnAsigantura.add(est);
        }
        return estudiantesEnAsigantura;
    }
    public ArrayList<String> buscarAsignaturasDeEstudiante (Estudiante estudiante) {
        ArrayList<String> cursos = new ArrayList<>();
        for (Profesor profe: listaProfesores) {
            for (Asignatura asignatura: profe.getListaAsignaturas()) {
                for (Estudiante estudianteRecorrido: asignatura.getListaEstudiantes()) {
                    if (estudianteRecorrido.getNombre().toLowerCase(Locale.ROOT).equals(estudiante.getNombre().toLowerCase(Locale.ROOT)) ) {
                        cursos.add(asignatura.getNombre());
                    }
                }
            }
        }
        return cursos;
    }
    public void mostrarAsignaturasDeProfesor (Profesor profesor) {
        for (Asignatura asignatura:
             profesor.getListaAsignaturas()) {
            System.out.println(asignatura);
        }
    }
    public void mostrarTodoElPersonal() {
        throw new UnsupportedOperationException();
    }
}