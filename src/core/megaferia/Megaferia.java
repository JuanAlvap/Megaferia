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

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" + ")";
    }

    public ArrayList<Stand> getStands() {
        return stands;
    }

    public ArrayList<Editorial> getEditoriales() {
        return editoriales;
    }

    public void createStand(float precio) {
        this.stands.add(new Stand(precio));
    }

    public void verifyStands() {
        for (Stand stand : this.stands) {
            System.out.println(stand + "->" + stand.getEditoriales());
        }
    }

    public boolean addEditorial(Editorial editorial) {
        if (!this.editoriales.contains(editorial)) {
            this.editoriales.add(editorial);
            return true;
        }
        return false;
    }

    public void assignStandEditorial(ArrayList<Integer> standsIds, ArrayList<Editorial> editoriales) {
        for (Editorial editorial : editoriales) {
            this.addEditorial(editorial);
            for (Integer standId : standsIds) {
                Stand stand = this.getStandById(standId);
                if (stand != null) {
                    editorial.addStand(stand);
                    stand.addEditorial(editorial);
                }
            }
        }
    }

    private Stand getStandById(int standId) {
        for (Stand stand : this.stands) {
            if (stand.getId() == standId) {
                return stand;
            }
        }
        return null;
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
