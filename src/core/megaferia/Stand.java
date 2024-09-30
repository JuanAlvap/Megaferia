package core.megaferia;

import java.util.ArrayList;

public class Stand {

    private static int idCount = 0;

    private int id;
    private float precio;
    private ArrayList<Editorial> editoriales;

    public Stand(float precio) {
        this.id = Stand.idCount;
        this.precio = precio;
        this.editoriales = new ArrayList<>();

        Stand.idCount++;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" + this.id + ", " + this.precio + ")";
    }

    public boolean addEditorial(Editorial editorial) {
        if (this.editoriales.contains(editorial)) {
            this.editoriales.add(editorial);
            return true;
        }
        return false;
    }

    public int getId() {
        return this.id;
    }

    public ArrayList<Editorial> getEditoriales() {
        return editoriales;
    }

}
