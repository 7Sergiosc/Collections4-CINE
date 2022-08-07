package collections4.cine.entidades;

public class Pelicula {
    private String titulo;
    private String director;
    private double duracion;

    public Pelicula(String titulo, String director, double duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public Pelicula() {
    }

    public Double getDuracion() {
        return duracion;
    }
    
    public boolean duracionMayor1H(){     
     return (getDuracion()>1);
    }
    
    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", duracion=" + duracion + '}';
    }

}
