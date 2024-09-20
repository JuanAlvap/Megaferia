package core.libro;

import core.megaferia.Editorial;
import core.person.Autor;
import java.util.ArrayList;


public class LibroImpreso extends Libro {
    
    private int paginas;
    private int numEjemplares;

    public LibroImpreso(int paginas, int numEjemplares, String titulo, ArrayList<Autor> autores, String isbn, String genero, String formato, float valor, Editorial editorial) {
        super(titulo, autores, isbn, genero, formato, valor, editorial);
        this.paginas = paginas;
        this.numEjemplares = numEjemplares;
    }
    
    
}
