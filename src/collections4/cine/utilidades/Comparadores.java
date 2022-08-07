package collections4.cine.utilidades;

import collections4.cine.entidades.Pelicula;
import java.util.Comparator;

public class Comparadores {
    public static Comparator<Pelicula> ordenarPorDuracionDesc = new Comparator<Pelicula>/*Acá apretar ctrl+espacio y se completa el resto*/() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            
            return t1.getDuracion().compareTo(t.getDuracion());
            
        }
    };
    
    public static Comparator<Pelicula> ordenarPorDuracionAsc = new Comparator<Pelicula>/*Acá apretar ctrl+espacio y se completa el resto*/() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            
            return t.getDuracion().compareTo(t1.getDuracion());
            
        }
    };
}
