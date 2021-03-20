package GuiaObjetos1.ejercicio3;

public class main {
    /* 3. Modele el objeto Ítem de Venta con las siguientes propiedades, identificador,
    descripción, cantidad y precio unitario. Cree los métodos para calcular el precio
    total teniendo en cuenta el precio unitario y cantidad. Un método que permita
    imprimir por pantalla los atributos del objeto de la siguiente forma:
    ItemVenta[id=?, descripción=?, cantidad=?, pUnitario=?, pTotal=?]
    a. Inicialice el objeto con los atributos necesarios
    b. Imprima por pantalla el objeto inicializado. */

    public static void main (String[] args) {
        Item producto = new Item();

        producto.setCantidad(20);
        producto.setDescripcion("Maquina de afeitar.");
        producto.setId(91218);
        producto.setPrecioUnitario(301);

        producto.mostrarProducto();
        System.out.println("\nEl precio total del producto es: " + producto.precioTotal() );

    }

}
