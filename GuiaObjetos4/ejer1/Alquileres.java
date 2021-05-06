package GuiaObjetos4.ejer1;

import java.sql.Time;
import java.time.LocalDate;
import java.util.UUID;

public class Alquileres{
    private UUID id;
    private Peliculas pelicula;
    private Clientes cliente;
    private LocalDate entrega;
    private LocalDate devolucion;

    public Alquileres() {
    }

    public Alquileres(Peliculas pelicula, Clientes cliente) {
        this.id = UUID.randomUUID();
        this.pelicula = pelicula;
        this.cliente = cliente;
        this.entrega = LocalDate.now();
        this.devolucion = LocalDate.now();
    }

    public UUID getId() {
        return id;
    }

    public Peliculas getPelicula() {
        return pelicula;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public LocalDate getEntrega() {
        return entrega;
    }

    public LocalDate getDevolucion() {
        return devolucion;
    }

    @Override
    public String toString() {
        return "Alquileres{" +
                "id=" + id +
                ", pelicula=" + pelicula +
                ", cliente=" + cliente +
                ", entrega=" + entrega +
                ", devolucion=" + devolucion +
                '}';
    }
}
