package PracticaParcial2;


import PracticaParcial2.Clientes.Cliente;
import PracticaParcial2.Productos.Producto;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Producto celularXiaomi = new Producto(20, 60000, "xiaomi mi 9t");
        Producto celularSamsung = new Producto(34, 80000, "samsung galaxy s20");
        Producto celularApple = new Producto(25, 95000, "iphone 8");

        Cliente fravega = new Cliente("Fravega","02235938273","San martin 132", "Empresa", 0);
        Cliente garbarino = new Cliente("Garbarino", "02234856152","Rivadavia 3944", "Empresa", 0);
        Cliente nicolas = new Cliente("Nicolas", "02235677891","Entre rios 123", "Particular", 0);
        Cliente joselito = new Cliente("Joselito", "02235672334","Tucuman 126", "Particular", 0);

        //Listado de Clientes, dos tips: Particular y Empresa
        List<Cliente> listaClientes = new ArrayList<>();
    }
}
