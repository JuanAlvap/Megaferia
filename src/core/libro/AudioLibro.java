package core.libro;

import core.megaferia.Editorial;
import core.person.Autor;
import core.person.Narrador;
import java.util.ArrayList;

public class AudioLibro extends Libro{
    
    private int duracion;
    private Narrador narrador;

    public AudioLibro(int duracion, Narrador narrador, String titulo, ArrayList<Autor> autores, String isbn, String genero, String formato, float valor, Editorial editorial) {
        super(titulo, autores, isbn, genero, formato, valor, editorial);
        this.duracion = duracion;
        this.narrador = narrador;
        
        this.narrador.addLibro(this);
    }
    
    
}
