package core.megaferia;

import core.person.Autor;
import java.util.ArrayList;

public class Megaferia {

    private ArrayList<Stand> stands;
    private ArrayList<Editorial> editoriales;

    public Megaferia() {
        this.editoriales = new ArrayList<>();
        this.stands = new ArrayList<>();
    }

    public void createStand(float precio) {
        this.stands.add(new Stand(precio));
    }

    public void verifyStands() {
        for (Stand stand : this.stands) {
            System.out.println(stand);
        }
    }

    public boolean addEditorial(Editorial editorial) {
        if (this.editoriales.contains(editorial)) {
            this.editoriales.add(editorial);
            return true;
        }
        return false;
    }

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
