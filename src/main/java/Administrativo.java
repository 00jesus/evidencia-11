public class Administrativo extends PersonalContratado {


    public Administrativo(String nombre, String rut, String estadoCivil, String añoIncorporacion, Departamento departamento) {
        super(nombre, rut, estadoCivil, añoIncorporacion);

    }


    @Override
    public String toString() {
        return "Administrativo{" +
                ", añoIncorporacion='" + añoIncorporacion + '\'' +
                ", nombre='" + nombre + '\'' +
                ", rut='" + rut + '\'' +
                ", estadoCivil='" + estadoCivil + '\'' +
                '}';
    }
}