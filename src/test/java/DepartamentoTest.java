
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class DepartamentoTest {
    private ArrayList<Estudiante> listaEstudiantes;
    private ArrayList<Profesor> listaProfesores;
    private ArrayList<Administrativo> listaAdministrativos;
    private Departamento departamento;

    @BeforeEach
    void inicializar () {
        listaEstudiantes = new ArrayList<>();
        listaProfesores = new ArrayList<>();
        listaAdministrativos = new ArrayList<>();
        departamento = new Departamento(listaEstudiantes,listaAdministrativos,listaProfesores);
        Estudiante estudiante1 = new Estudiante("juan", "202039930", "casado" );
        Estudiante estudiante2 = new Estudiante("ricardo", "94394943", "soltero");
        Estudiante estudiante3 = new Estudiante("esteban", "433453543", "casado");
        Profesor profe2 = new Profesor("jose", "1231231", "casado", "2016",null );
        Asignatura asignatura1 = new Asignatura("programacion", null);
        Asignatura asignatura2 = new Asignatura("redes", null);
        Asignatura asignatura3 = new Asignatura("POO", null);
    }
    @Test
    void testBuscarEstudiantesEnAsignatura (){
        //Asignatura asignatura1 = new Asignatura()
        Estudiante estudiante1 = new Estudiante("juan", "202039930", "casado" );
        Estudiante estudiante2 = new Estudiante("ricardo", "94394943", "soltero");
        Estudiante estudiante3 = new Estudiante("esteban", "433453543", "casado");
        Asignatura asignatura1 = new Asignatura("programacion", null);

        listaEstudiantes.add(estudiante2);
        listaEstudiantes.add(estudiante1);
        listaEstudiantes.add(estudiante3);
        asignatura1.setListaEstudiantes(listaEstudiantes);
      //  System.out.println(asignatura1);
        System.out.println(departamento.buscarEstudiantesEnAsignatura(asignatura1) );

    }


    @Test
    void buscarAsignaturasDeEstudiante() {
        ArrayList<Asignatura> listaAsignaturas = new ArrayList<>();
        Profesor profe = new Profesor(null);
        listaProfesores.add(profe);
        Asignatura asignatura1 = new Asignatura("programacion", listaEstudiantes);
        Asignatura asignatura2 = new Asignatura("redes", listaEstudiantes);
        Asignatura asignatura3 = new Asignatura("POO" , listaEstudiantes);
        listaAsignaturas.add(asignatura3);
        listaAsignaturas.add(asignatura2);
        listaAsignaturas.add(asignatura1);
        profe.setListaAsignaturas(listaAsignaturas);

        Estudiante estudiante1 = new Estudiante("juan", "202039930", "casado" );
        Estudiante estudiante2 = new Estudiante("ricardo", "94394943", "soltero");
        Estudiante estudiante3 = new Estudiante("esteban", "433453543", "casado");
        listaEstudiantes.add(estudiante2);
        listaEstudiantes.add(estudiante3);

        System.out.println(departamento.buscarAsignaturasDeEstudiante(estudiante3));
        Assertions.assertNotNull(departamento.buscarAsignaturasDeEstudiante(estudiante1));

    }
}