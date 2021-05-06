package GuiaObjetos4.ejer1;

import java.sql.Time;

public class Peliculas {
    private String titulo;
    private int stock;
    private String fechaLanzamiento;
    private int duracion;
    private String clasificacionAudiencia;
    private String paisOrigen;
    private String descripcion;

    public int cantAlquilada = 0;

    public Peliculas(String titulo, int stock, String fechaLanzamiento, int duracion, String clasificacionAudiencia, String paisOrigen, String descripcion) {
        this.titulo = titulo;
        this.stock = stock;
        this.fechaLanzamiento = fechaLanzamiento;
        this.duracion = duracion;
        this.clasificacionAudiencia = clasificacionAudiencia;
        this.paisOrigen = paisOrigen;
        this.descripcion = descripcion;
    }

    public String getTitulo() {
        return titulo;
    }


    public int getStock() {
        return stock;
    }


    public String getFechaLanzamiento() {
        return fechaLanzamiento;
    }


    public int getDuracion() {
        return duracion;
    }


    public String getClasificacionAudiencia() {
        return clasificacionAudiencia;
    }


    public String getPaisOrigen() {
        return paisOrigen;
    }

    public String getDescripcion() {
        return descripcion;
    }




    @Override
    public String toString() {
        return "Peliculas{" +
                "titulo='" + titulo + '\'' +
                ", stock=" + stock +
                ", fechaLanzamiento='" + fechaLanzamiento + '\'' +
                ", duracion=" + duracion +
                ", clasificacionAudiencia='" + clasificacionAudiencia + '\'' +
                ", paisOrigen='" + paisOrigen + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
