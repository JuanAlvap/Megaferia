package core.person;

import core.megaferia.Editorial;

public class Gerente extends Persona {

    private Editorial editorial;

    public Gerente(String nombre, int cedula) {
        super(nombre, cedula);
        this.editorial = null;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public Editorial getEditorial() {
        return editorial;
    }

}
