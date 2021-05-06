package Practica_Parcial1.VentaCorralon.Venta;

import java.util.concurrent.atomic.AtomicInteger;

public class Producto {
    private int id;
    private String nombre, marca;
    private int precioUnitario, stock;

    private static final AtomicInteger count = new AtomicInteger(1);


    public Producto(String nombre, String marca, int precioUnitario, int stock) {
        this.id = idRandom();
        this.nombre = nombre;
        this.marca = marca;
        this.precioUnitario = precioUnitario;
        this.stock = stock;
    }


    public int idRandom() {
        return id = count.incrementAndGet();
    }

    public int getId() {
        return id;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(int precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                ", precioUnitario=" + precioUnitario +
                ", stock=" + stock +
                '}';
    }
}
