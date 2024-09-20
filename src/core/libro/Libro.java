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

    public Libro(String titulo, ArrayList<Autor> autores, String isbn, String genero, String formato, float valor, Editorial editorial) {
        this.titulo = titulo;
        this.autores = autores;
        this.isbn = isbn;
        this.genero = genero;
        this.formato = formato;
        this.valor = valor;
        this.editorial = editorial;
        
        for (Autor autor : this.autores) {
            autor.addLibro(this);
        }
        this.editorial.addLibro(this);
    }
    
    
    
}
