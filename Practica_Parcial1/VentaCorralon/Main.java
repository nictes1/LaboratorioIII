package Practica_Parcial1.VentaCorralon;

import Practica_Parcial1.VentaCorralon.Venta.Catalogo;
import Practica_Parcial1.VentaCorralon.Venta.Producto;



public class Main {
    public static void main(String[] args) {
        Catalogo catalogo = new Catalogo();

        Producto prod1 = new Producto("qqee","hehjkhe",1,5);
        Producto prod2 = new Producto("adad","xcv",4,122);
        Producto prod3 = new Producto("ghjj","hehfghfge",10,76);
        Producto prod4 = new Producto("gsdjfkshdf","h",10,76);
        Producto prod5 = new Producto("gajksdasdaj","ge",10,76);

        catalogo.AgregarProducto(prod1);
        catalogo.AgregarProducto(prod2);
        catalogo.AgregarProducto(prod3);
        catalogo.AgregarProducto(prod4);
        catalogo.AgregarProducto(prod5);


        catalogo.MostrarProductos();
        catalogo.EliminarProducto(4);
        System.out.println("-----");
        catalogo.MostrarProductos();
        System.out.println("-----");
        System.out.println(catalogo.BuscarProducto(2));
        System.out.println("-----");

        //Hasta aca anda.
    }
}
