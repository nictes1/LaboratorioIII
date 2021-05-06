package PracticaParcial2.Productos;

import PracticaParcial2.Clientes.Cliente;

public class Pedido {

    private Cliente cliente;
    private int distanciaEnvio;
    private String productoSeleccionado;

    public Pedido(){

    }

    public Pedido(Cliente cliente, int distanciaEnvio, String productoSeleccionado) {
        this.cliente = cliente;
        this.distanciaEnvio = distanciaEnvio;
        this.productoSeleccionado = productoSeleccionado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getDistanciaEnvio() {
        return distanciaEnvio;
    }

    public void setDistanciaEnvio(int distanciaEnvio) {
        this.distanciaEnvio = distanciaEnvio;
    }

    public String getProductoSeleccionado() {
        return productoSeleccionado;
    }

    public void setProductoSeleccionado(String productoSeleccionado) {
        this.productoSeleccionado = productoSeleccionado;
    }



    @Override
    public String toString() {
        return "Pedido{" +
                "cliente=" + cliente +
                ", distanciaEnvio=" + distanciaEnvio +
                ", productoSeleccionado='" + productoSeleccionado + '\'' +
                '}';
    }
}
