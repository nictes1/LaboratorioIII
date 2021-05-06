package Practica_Parcial1.VentaCorralon.Publico;

import java.util.ArrayList;
import java.util.List;

public class ListaClientes {

    List<Cliente> listadoClientes = new ArrayList<>();

    public void AgregarClientes(Cliente cliente){
        listadoClientes.add(cliente);
    }

    public void EliminarCliente(int idCliente){
        listadoClientes.removeIf(cliente -> cliente.getIdCliente() == idCliente);
    }

}
