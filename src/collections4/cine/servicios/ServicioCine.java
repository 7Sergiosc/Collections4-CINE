package collections4.cine.servicios;

import collections4.cine.entidades.Cine;
import collections4.cine.entidades.Pelicula;
import collections4.cine.utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class ServicioCine {

    private Cine c1 = new Cine();
    private ServicioPelicula sp = new ServicioPelicula(); //Nace la clase ServicioPelicula
    private Scanner input = new Scanner(System.in).useDelimiter("\n");
    private boolean continuar1;

    public void añadirPelicula() {
        do {
            c1.getPeliculas().add(sp.crearPelicula());  //Crea una pelicula

            System.out.print("Desea crear otra pelicula? / SI/NO>");
            String continuar = input.next();

            continuar1 = continuar.equalsIgnoreCase("SI"); // Si continuar1 = continuar.equalsIgnoreCase("SI")

        } while (continuar1 == true);

    }

    public void mostrarPeliculas() {
        for (Pelicula pelicula : c1.getPeliculas()) {
            System.out.println(pelicula);
        }
    }

    public void mostrarPeliculaMayor1H() {
        for (int i = 0; i < c1.getPeliculas().size(); i++) {
            Pelicula p = c1.getPeliculas().get(i);
            if(p.getDuracion()>= 1){
                System.out.println(p);
            }
        }
    }
    
    public void ordenarPorDuracionDesc(){
        Collections.sort(c1.peliculas, Comparadores.ordenarPorDuracionDesc);
    }
}
    