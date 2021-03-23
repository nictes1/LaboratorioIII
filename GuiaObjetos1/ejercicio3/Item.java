package GuiaObjetos1.ejercicio3;

public class Item {

    private int id;
    private String Descripcion;
    private int cantidad;
    private double precioUnitario;


    public Item() {
    }


    public Item(int id, String descripcion, int cantidad, double precioUnitario) {
        this.id = id;
        Descripcion = descripcion;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
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

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", Descripcion='" + Descripcion + '\'' +
                ", cantidad=" + cantidad +
                ", precioUnitario=" + precioUnitario +
                '}';
    }

}
