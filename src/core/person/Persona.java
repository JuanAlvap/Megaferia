package core.person;

public abstract class Persona {

    protected String nombre;
    protected int cedula;

    public Persona(String nombre, int cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" + this.nombre + ", " + this.cedula + ")";
    }

}
