package core.person;

import core.libro.Libro;
import core.megaferia.Editorial;
import java.util.ArrayList;

public class Autor extends Persona {

    private ArrayList<Libro> libros;

    public Autor(String nombre, int cedula) {
        super(nombre, cedula);
        this.libros = new ArrayList<>();
    }

    public boolean addLibro(Libro libro) {
        if (!this.libros.contains(libro)) {
            this.libros.add(libro);
            return true;
        }
        return false;
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public int obtenerNumEditoriales() {
        ArrayList<Editorial> editoriales = new ArrayList<>();
        for (Libro libro : this.libros) {
            if (!editoriales.contains(libro.getEditorial())) {
                editoriales.add(libro.getEditorial());
            }
        }
        return editoriales.size();
    }
}
