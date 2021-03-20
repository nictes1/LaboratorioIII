package GuiaObjetos1.ejercicio3;

public class Item {
     /* 3. Modele el objeto Ítem de Venta con las siguientes propiedades, identificador,
    descripción, cantidad y precio unitario. Cree los métodos para calcular el precio
    total teniendo en cuenta el precio unitario y cantidad. Un método que permita
    imprimir por pantalla los atributos del objeto de la siguiente forma:
    ItemVenta[id=?, descripción=?, cantidad=?, pUnitario=?, pTotal=?]
    a. Inicialice el objeto con los atributos necesarios
    b. Imprima por pantalla el objeto inicializado. */

    private int id;
    private String Descripcion;
    private int cantidad;
    private double precioUnitario;


    public Item() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double precioTotal(){
        return this.cantidad * this.precioUnitario;
    }

    public void mostrarProducto(){
        System.out.printf("Producto: Id: %d, Descripcion: %s, Cantidad: %d, Precio Unitario: %.2f, Precio Total: %.2f", getId(), getDescripcion(), getCantidad(), getPrecioUnitario(), precioTotal());
    }

}
