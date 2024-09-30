package core.megaferia;

import core.libro.Libro;
import core.person.Autor;
import core.person.Gerente;
import java.util.ArrayList;

public class Editorial {

    private String nit;
    private String nombre;
    private String direccion;
    private Gerente gerente;
    private ArrayList<Libro> libros;
    private ArrayList<Stand> stands;

    public Editorial(String nit, String nombre, String direccion, Gerente gerente) {
        this.nit = nit;
        this.nombre = nombre;
        this.direccion = direccion;
        this.gerente = gerente;
        this.libros = new ArrayList<>();
        this.stands = new ArrayList<>();

        this.gerente.setEditorial(this);

    }

    public boolean addStand(Stand stand) {
        if (this.stands.contains(stand)) {
            this.stands.add(stand);
            return true;
        }
        return false;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public ArrayList<Stand> getStands() {
        return stands;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" + this.nit + ", " + this.nombre + ")";
    }

    public boolean addLibro(Libro libro) {
        if (this.libros.contains(libro)) {
            this.libros.add(libro);
            return true;
        }
        return false;
    }

    public ArrayList<Autor> obtenerAutores() {
        ArrayList<Autor> autores = new ArrayList<>();
        for (Libro libro : this.libros) {
            ArrayList<Autor> autoresLibro = libro.getAutores();
            for (Autor autor : autoresLibro) {
                if (!autores.contains(autor)) {
                    autores.add(autor);
                }
            }
        }
        return autores;
    }

}
