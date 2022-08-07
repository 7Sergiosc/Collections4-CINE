package collections4.cine;

import collections4.cine.servicios.ServicioCine;
import collections4.cine.servicios.ServicioPelicula;
import collections4.cine.utilidades.Comparadores;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in).useDelimiter("\n");
       ServicioCine sc = new ServicioCine();
       
       sc.añadirPelicula();
        System.out.print("Peliculas añadidas correctamente");input.next();
        
        for (int i = 0; i < 10; i++) {
            System.out.println("\n");
        }
        
        System.out.println("Lista de todas las películas:");
       sc.mostrarPeliculas();
       
        System.out.println("\nPeliculas con duración mayor a 1H");
       sc.mostrarPeliculaMayor1H();
       
        System.out.println("\nPeliculas ordenadas de mayor a menor");
       sc.ordenarPorDuracionDesc();
       sc.mostrarPeliculas();
    }
}
