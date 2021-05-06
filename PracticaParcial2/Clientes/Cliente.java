package PracticaParcial2.Clientes;

import GuiaObjetos4.ejer1.Clientes;
import PracticaParcial2.Productos.Producto;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cliente {
    private String nombre, telefono, direccion, tipoCliente;
    private int cantCompras;

    List<Cliente> listadoClientes = new ArrayList<>();

    public Cliente() {
    }

    public Cliente(String nombre, String telefono, String direccion, String tipoCliente, int cantCompras) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.tipoCliente = tipoCliente;
        this.cantCompras = cantCompras;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(tipoCliente, cliente.tipoCliente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipoCliente);
    }

    public void agregarCliente(Cliente cliente){
        listadoClientes.add(cliente);
    }

    public void mostrarClientes(){
        for (Cliente cliente : listadoClientes){
            System.out.println(cliente);
        }
    }

    public Cliente buscarCliente(String clienteBusqueda){
        for (Cliente cliente: listadoClientes){
            if(cliente.getNombre().equals(clienteBusqueda)){
                return cliente;
            }
        }
        return null;
    }

}
