package collections4.cine;

import collections4.cine.entidades.Pelicula;
import collections4.cine.servicios.ServicioPelicula;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ServicioPelicula sp = new ServicioPelicula(); //Nace la clase ServicioPelicula
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        boolean continuar1;
        ArrayList<Pelicula> peliculas = new ArrayList<>();
        
        do{
            peliculas.add(sp.crearPelicula());  //Crea y añade la pelicula a la ArrayList<> peliculas
            
            System.out.print("Desea crear otra pelicula? / SI/NO>"); String continuar = input.next();
            
            continuar1 = continuar.equalsIgnoreCase("SI"); // Si continuar1 = continuar.equalsIgnoreCase("SI")
            
        }while(continuar1==true);
        //Mostrar todas las peliculas ArrayList<> peliculas
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula.toString());
        }
        
        System.out.println("*--------------*");
    }
}
