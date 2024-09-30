package main;

import core.libro.Libro;
import core.libro.LibroDigital;
import core.libro.LibroImpreso;
import core.megaferia.Editorial;
import core.megaferia.Megaferia;
import core.person.Autor;
import core.person.Gerente;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Megaferia megaferia = new Megaferia();

        megaferia.createStand(10000000);
        megaferia.createStand(20000000);
        megaferia.createStand(15000000);
        megaferia.createStand(50000000);

        Gerente gerente1 = new Gerente("Juan Juliao", 104893);
        Gerente gerente2 = new Gerente("Pedro Perez", 116971);

        Editorial editorial1 = new Editorial("981-1547565-1", "Planeta", "Calle 46 #53", gerente1);
        Editorial editorial2 = new Editorial("980-4893614-8", "Nova", "Calle 45 #72", gerente2);

        ArrayList<Integer> standsIds = new ArrayList<>();
        standsIds.add(0);
        standsIds.add(1);
        standsIds.add(3);
        standsIds.add(4);

        ArrayList<Editorial> editoriales = new ArrayList<>();
        editoriales.add(editorial1);
        editoriales.add(editorial2);

        megaferia.assignStandEditorial(standsIds, editoriales);
        
        Autor autor1 = new Autor("Gabriel Garcia", 104597);
        Autor autor2 = new Autor("Juan Morales", 111238);
        Autor autor3 = new Autor("Daniel Sanchez" , 123498);
        
        ArrayList<Autor> autores = new ArrayList<>();
        autores.add(autor1);
        autores.add(autor2);
        Libro libro1 = new LibroImpreso(560, 5,"Hola me llamo Juan", autores, "977-89654568", "Novela", "Pasta Dura", 120000, editorial1);
        
        autores = new ArrayList<>();
        autores.add(autor2);
        autores.add(autor3);
        
        Libro libro2 = new LibroDigital(false, new ArrayList<>(),"Hola me llamo Juan", autores, "977-89654568", "Comedia", "PDF", 120000, editorial2);
        //---------------------------------------------------------------------------------------------------

        System.out.println(megaferia + "->" + megaferia.getStands());
        System.out.println(megaferia + "->" + megaferia.getEditoriales() + "\n");

        System.out.println(editorial1 + "->" + editorial1.getGerente());
        System.out.println(gerente1 + "->" + gerente1.getEditorial() + "\n");

        System.out.println(editorial2 + "->" + editorial2.getGerente());
        System.out.println(gerente2 + "->" + gerente2.getEditorial() + "\n");

        megaferia.verifyStands();

        System.out.println("\n" + editorial1 + "->" + editorial1.getStands());
        System.out.println(editorial2 + "->" + editorial2.getStands());
        
        //System.out.println(editorial1 + );
    }
}
