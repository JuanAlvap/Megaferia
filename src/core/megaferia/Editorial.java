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
