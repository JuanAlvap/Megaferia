package core.person;

import core.libro.Libro;
import core.megaferia.Editorial;
import java.util.ArrayList;

public class Autor {

    private ArrayList<Libro> libros;

    public int obtenerNumEditoriales() {
        ArrayList<Editorial> editoriales = new ArrayList<>();
        for (Libro libro : this.libros) {
            if (!editoriales.contains(libro.getEditorial())) {
                editoriales.add(libro.getEditorial())
            }
        }
        return editoriales.size();
    }
}
