package core.libro;

import core.megaferia.Editorial;
import core.person.Autor;
import java.util.ArrayList;

public class LibroDigital extends Libro{
    
    private boolean hasHipervinculo;
    private ArrayList<String> hipervinculos;

    public LibroDigital(String titulo, ArrayList<Autor> autores, String isbn, String genero, String formato, float valor, Editorial editorial, boolean hasHipervinculo, ArrayList<String> hipervinculos) {
        super(titulo, autores, isbn, genero, formato, valor, editorial);
        this.hasHipervinculo = hasHipervinculo;
        this.hipervinculos = hipervinculos;
    }
    
    
}
