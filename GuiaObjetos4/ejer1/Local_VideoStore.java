package GuiaObjetos4.ejer1;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Local_VideoStore {

    private List<Peliculas> listaPeliculas = new ArrayList<>();
    private List<Clientes> listaClientes= new ArrayList<>();
    private List<Alquileres> listaAlquileres = new ArrayList<>();

    public Local_VideoStore(List<Peliculas> listaPeliculas, List<Clientes> listaClientes, List<Alquileres> listaAlquileres) {
        this.listaPeliculas = listaPeliculas;
        this.listaClientes = listaClientes;
        this.listaAlquileres = listaAlquileres;
    }

    public void AddPelicula (Peliculas pelicula){
        listaPeliculas.add(pelicula);
    }

    public void ViewPeliculas(){
        for (Peliculas pelicula : listaPeliculas){
            System.out.println(pelicula);
        }
    }

    public Peliculas SearchPelicula(String peliculaBuscada){
        for (Peliculas pelicula :listaPeliculas ){
            if(pelicula.getTitulo().equalsIgnoreCase(peliculaBuscada)){
                return pelicula;
            }
        }
        return null;
    }

    public void NewCliente(String nombre, String Telefono, String direccion){
        Clientes newCliente = new Clientes(nombre,direccion,Telefono);
        listaClientes.add(newCliente);
    }

    public Clientes SearchCliente(String nombreCliente){
        for (Clientes cliente : listaClientes){
            if(cliente.getNombre().equalsIgnoreCase(nombreCliente)){
                return cliente;
            }
        }
        return null;
    }

    public void ViewClientes(){
        for (Clientes cliente : listaClientes){
            System.out.println(cliente);
        }
    }

    public void DeleteAlquiler(UUID id){
        listaAlquileres.removeIf(alquileres -> alquileres.getId() == id);
    }

    public List<Peliculas> getListaPeliculas() {
        return listaPeliculas;
    }

    public void setListaPeliculas(List<Peliculas> listaPeliculas) {
        this.listaPeliculas = listaPeliculas;
    }

    public List<Clientes> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Clientes> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public List<Alquileres> getListaAlquileres() {
        return listaAlquileres;
    }

    public void setListaAlquileres(List<Alquileres> listaAlquileres) {
        this.listaAlquileres = listaAlquileres;
    }
}
