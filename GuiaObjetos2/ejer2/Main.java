package GuiaObjetos2.ejer2;

import java.time.LocalDate;
import java.util.UUID;

public class Main {

    public static void main(String[] args){

        UUID randIdClient = UUID.randomUUID();
        String randIdStringClient = randIdClient.toString();

        UUID randIdBill = UUID.randomUUID();
        String randIdStringBill = randIdBill.toString();

        Client client = new Client();

        //b)
        client.setEmail("nikolastesone@gmail.com");
        client.setName("Nicolas");
        client.setId(randIdStringClient);
        client.setPercentage(20);

        System.out.println(client.toString());
        //c)
        Bill bill = new Bill();
        bill.setClient(client);
        bill.setDates(LocalDate.now());
        bill.setTotalAmount(600);
        bill.setId(randIdStringBill);

        System.out.println(bill.toString());

        //d)



    }
}
