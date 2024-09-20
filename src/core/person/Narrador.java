package core.person;

import core.libro.AudioLibro;
import java.util.ArrayList;

public class Narrador extends Persona{
    
    private ArrayList<AudioLibro> libros;

    public Narrador(ArrayList<AudioLibro> libros, String nombre, int cedula) {
        super(nombre, cedula);
        this.libros = new ArrayList<>();
    }
    
    
    
    public boolean addLibro(Libro libro){
        if(this.libros.contains(libro)){
            this.libros.add(libro);
            return true;
        }
        return false;
    }
    
}
