package GuiaObjetos2.ejer2;

import java.sql.Time;
import java.time.LocalDate;

public class Bill {

    private String id;
    private SaleItem []itemVenta;
    private int totalAmount;
    private LocalDate dates;
    private Client client;

    public Bill() {
    }


    public Bill(String id, SaleItem []itemVenta, int totalAmount, LocalDate dates, Client client) {
        this.id = id;
        this.itemVenta = itemVenta;
        this.totalAmount = totalAmount;
        this.dates = dates;
        this.client = client;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SaleItem[] getItemVenta() {
        return itemVenta;
    }

    public void setItemVenta(SaleItem []itemVenta) {
        this.itemVenta = itemVenta;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public LocalDate getDates() {
        return dates;
    }

    public void setDates(LocalDate dates) {
        this.dates = dates;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }


    @Override
    public String toString() {
        return "Bill{" +
                "id=" + id +
                ", item= " + itemVenta +
                ", totalAmount=" + totalAmount +
                ", dates=" + dates +
                ", client=" + client +
                '}';
    }
}
