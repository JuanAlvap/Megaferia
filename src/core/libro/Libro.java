package core.libro;

import core.megaferia.Editorial;
import core.person.Autor;
import java.util.ArrayList;

public abstract class Libro {
    
    protected String titulo;
    protected ArrayList<Autor> autores;
    protected String isbn;
    protected String genero;
    protected String formato;
    protected float valor;
    protected Editorial editorial;
    
}
