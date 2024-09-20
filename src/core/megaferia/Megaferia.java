package core.megaferia;

import core.person.Autor;
import java.util.ArrayList;

public class Megaferia {
    
    private ArrayList<Stand> stands;
    private ArrayList<Editorial> editoriales;
    
    public Autor obtenerAutorMaxEditoriales() {
    ArrayList<Autor> autores = new ArrayList<>();
    for (Editorial editorial : this.editoriales) {
        ArrayList<Autor> autoresEditorial = editorial.obtenerAutores();
        for (Autor autor : autoresEditorial) {
            if (!autores.contains(autor)) {
                autores.add(autor);
            }
        }
    }
    Autor autorMaxEditoriales = autores.get(0);
    for (Autor autor : autores) {
        if (autor.obtenerNumEditoriales() > autorMaxEditoriales.obtenerNumEditoriales()) {
            autorMaxEditoriales = autor;
        }
    }
    return autorMaxEditoriales;
}
    
}
