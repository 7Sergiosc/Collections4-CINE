package collections4.cine.entidades;

import collections4.cine.servicios.ServicioPelicula;
import java.util.ArrayList;
import java.util.Scanner;

public class Cine {
    public ArrayList<Pelicula> peliculas = new ArrayList<>();

    public ArrayList<Pelicula> getPeliculas() {
        return peliculas;
    }
    
    public void setPeliculas(ArrayList<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }
    
    
    
}
