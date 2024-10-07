package core.person;

import core.libro.AudioLibro;
import core.libro.Libro;
import java.util.ArrayList;

public class Narrador extends Persona{
    
    private ArrayList<AudioLibro> libros;

    public Narrador(String nombre, int cedula) {
        super(nombre, cedula);
        this.libros = new ArrayList<>();
    }

    public boolean addLibro(AudioLibro libro){
        if(!this.libros.contains(libro)){
            this.libros.add(libro);
            return true;
        }
        return false;
    }
    
}
