package core.megaferia;

import java.util.ArrayList;

public class Stand {
    
    private static int idCount = 0;
    
    private int id;
    private float precio;
    private ArrayList<Editorial> editoriales;

    public Stand(float precio) {
        this.id = Stand.idCount;
        this.precio = precio;
        this.editoriales = new ArrayList<>();
        
        Stand.idCount++;
    }

    public int getId() {
        return this.id;
    }
    
    
    
}
