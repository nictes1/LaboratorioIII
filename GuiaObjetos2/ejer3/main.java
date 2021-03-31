package GuiaObjetos2.ejer3;
/*
        e. Analice cómo implementaría con las herramientas conocidas hasta el
        momento, llevar un registro de como máximo 10 operaciones de depósito y
        extracción que se realizaron en la cuenta. En donde se almacene en
        memoria de alguna forma la siguiente cadena de texto:
        i. Depósito: "El {NombreCliente}, depositó {MontoDepositado}"
        ii. Extracción: "El {NombreCliente}, retiró {MontoR

 */
public class main {

    public static void main(String[] args){
        int deposito = 5000;
        int retiro = 3000;
        //a)
        Client clientNicolas = new Client('m',"Nicolas Tesone");
        System.out.println(clientNicolas.toString());
        //b)
        Account accountClient = new Account((double)10000, clientNicolas);
        //c)
        accountClient.deposito(deposito);
        System.out.println("Depositaste: $" + deposito + ". Su balance de la cuenta es de: $" + accountClient.getBalance());

        accountClient.retiro(retiro);
        System.out.println("Retiraste: $" + retiro + ". Su balance de la cuenta es de: $" + accountClient.getBalance());

        //Falta hacer el punto e)
    }
}
