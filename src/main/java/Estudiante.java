import java.util.ArrayList;

public class Estudiante extends Persona {

    public Estudiante(String nombre, String rut, String estadoCivil) {
        super(nombre, rut, estadoCivil);
    }

    public Estudiante() {
    }




    @Override
    public String toString() {
        return "Estudiante{" +
                ", nombre='" + nombre + '\'' +
                ", rut='" + rut + '\'' +
                ", estadoCivil='" + estadoCivil + '\'' +
                '}';
    }
}