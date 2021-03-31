package GuiaObjetos2.ejer2;

import java.util.UUID;

public class SaleItem {

    private UUID Id;
    private String name;
    private String description;
    private double unitPrice;

    public SaleItem() {
    }

    public SaleItem(String name, String description, double precioUnitario) {
        this.Id = UUID.randomUUID();
        this.name = name;
        this.description = description;
        this.unitPrice = precioUnitario;
    }

    public UUID getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }


    @Override
    public String toString() {
        return  "\n Id:" + Id +
                ", name: '" + name + '\'' +
                ", description: '" + description + '\'' +
                ", unitPrice: " + unitPrice + ".";
    }
}
