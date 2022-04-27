package collections4.cine.servicios;

import collections4.cine.entidades.Pelicula;
import java.util.Scanner;

public class ServicioPelicula {
    private Scanner input = new Scanner(System.in).useDelimiter("\n");

    public Pelicula crearPelicula(){
        System.out.println("Ingresa los datos de la pelicula");
        System.out.print("Título> "); String titulo = input.next(); // Pide el titulo
        System.out.print("Director> "); String director = input.next(); // Pide el director
        System.out.print("Duracion> "); double duracion = input.nextDouble(); // Pide la duracion
        return new Pelicula(titulo, director, duracion);
    }
    
    
}
