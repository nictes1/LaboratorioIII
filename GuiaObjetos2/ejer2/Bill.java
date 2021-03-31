package GuiaObjetos2.ejer2;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.UUID;

public class Bill {

    private UUID id;
    private SaleItem []itemVenta;
    private double totalAmount;
    private LocalDate dates;
    private Client client;

    public Bill() {
    }


    public Bill(Client client, SaleItem[] itemVenta) {
        this.id = UUID.randomUUID();
        this.itemVenta = itemVenta;
        this.dates = LocalDate.now();
        this.client = client;
    }

    public String getId() {
        return id.toString();
    }

    public SaleItem[] getItemVenta() {
        return itemVenta;
    }

    public void setItemVenta(SaleItem[] itemVenta) {
        this.itemVenta = itemVenta;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
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
                ", item= " + Arrays.toString(itemVenta) +
                ", totalAmount=" + totalAmount +
                ", dates=" + dates +
                ", client=" + client +
                '}';
    }

    public String printBill(){
        return "Factura A " + "\nNro: " + id + "\n Date: " + dates + "\nClient: " + client + "\n\nProducts: " + Arrays.toString(itemVenta)+ "\n\n Total price: $" + totalAmount() + "\t\t\t Total price with discount: $" + discount();
    }

    public double discount(){
        double total = totalAmount();
        if(total > 130){
           return  total -= (total * (client.getPercentage() / 100));
        }
        return total;
    }

    public double totalAmount(){
        double total = 0;
        for(int i = 0; i < this.itemVenta.length; i++){
            if(itemVenta != null){
                 total = total + this.itemVenta[i].getUnitPrice();
            }
        }
        return total;
    }
}
