package GuiaObjetos2.ejer2;

import java.time.LocalDate;
import java.util.UUID;

public class Main {

    public static void main(String[] args){
            //b)
            Client clientNicolas = new Client("Nicolas","nikolastesone@gmail.com",20);
            //d)
            SaleItem Cookies = new SaleItem("Cookies", "Pepitos", 85);
            SaleItem Soda = new SaleItem("Soda", "Coca-cola", 90);
            SaleItem Cigarettes = new SaleItem("Cigarettes", "Marlboro", 130);
            SaleItem Beer = new SaleItem("Beer", "Andes", 150);

            SaleItem[] items = new SaleItem[4];
            items[0] = Cookies;
            items[1] = Soda;
            items[2] = Cigarettes;
            items[3] = Beer;

            Bill bill = new Bill(clientNicolas, items);
            System.out.println(bill.printBill());



    }
}
