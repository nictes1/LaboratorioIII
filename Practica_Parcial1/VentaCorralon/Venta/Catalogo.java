package Practica_Parcial1.VentaCorralon.Venta;

import java.util.ArrayList;
import java.util.List;

public class Catalogo{

    List<Producto> catalogoCorralon = new ArrayList<>();


    public void AgregarProducto(Producto produc){
        catalogoCorralon.add(produc);
    }

    public void EliminarProducto(int id){
        catalogoCorralon.removeIf(catalogo -> catalogo.getId() == id);
    }

    public Producto BuscarProducto(int id){
        for(Producto catalogo: catalogoCorralon){
            if(id == catalogo.getId()){
                return catalogo;
            }
        }
        return null;
    }

    public void MostrarProductos(){
        for(Producto catalogo: catalogoCorralon){
            System.out.println(catalogo.toString());
        }
    }


}
