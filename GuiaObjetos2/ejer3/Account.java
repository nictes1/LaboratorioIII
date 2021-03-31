package GuiaObjetos2.ejer3;

import java.util.UUID;

public class Account {
    private UUID idAccount;
    private Double balance;
    private GuiaObjetos2.ejer3.Client client;

    public Account() {
    }

    public Account(Double balance, GuiaObjetos2.ejer3.Client client) {
        this.idAccount = UUID.randomUUID();
        this.balance = balance;
        this.client = client;
    }


    public UUID getIdAccount() {
        return idAccount;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public GuiaObjetos2.ejer3.Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void deposito(double ingreso){
        this.balance = this.balance + ingreso;
    }

    public void retiro(double egreso){
        if (this.balance > -2000){
            if(this.balance - egreso > -2000) {
                this.balance = this.balance - egreso;
            }
        }else{
            System.out.println("No se puede realizar la operacion. Fondos insuficientes. ");
        }

    }

    @Override
    public String toString() {
        return "Account{" +
                "idAccount=" + idAccount +
                ", balance=" + balance +
                ", client=" + client +
                '}';
    }
}
