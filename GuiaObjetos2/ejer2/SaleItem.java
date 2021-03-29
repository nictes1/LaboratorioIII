package GuiaObjetos2.ejer2;

public class SaleItem {

    private String Id;
    private String name;
    private String descripcion;
    private double precioUnitario;

    public SaleItem() {
    }

    public SaleItem(String id, String name, String descripcion, double precioUnitario) {
        Id = id;
        this.name = name;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }


}
