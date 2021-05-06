package PracticaParcial2.Productos;

import java.util.ArrayList;
import java.util.List;

public class Producto {

    private int stock;
    private double precio;
    private String nombre;

    List<Producto> listaProductos = new ArrayList<>();

    public Producto() {
    }

    public Producto(int stock, double precio, String nombre) {
        this.stock = stock;
        this.precio = precio;
        this.nombre = nombre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarProductos(Producto producto){
       listaProductos.add(producto);
    }

    public void mostrarProductos(){
        for (Producto producto : listaProductos){
            System.out.println(producto);
        }
    }

    public Producto buscarProducto(String productoBusqueda){
        for (Producto producto: listaProductos){
            if(producto.getNombre().equals(productoBusqueda)){
                return  producto;
            }
        }

        return null;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "stock=" + stock +
                ", precio=" + precio +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}

