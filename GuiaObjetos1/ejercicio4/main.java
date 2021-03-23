package GuiaObjetos1.ejercicio4;

public class main {

    public static void main (String[] args) {

        Banco cuenta = new Banco();

        cuenta.setId(00133002233);
        cuenta.setNombre("Nicolas");
        cuenta.setBalance(15000);

        cuenta.mostrarCuenta();

        cuenta.setBalance(cuenta.credito(2500));
        cuenta.balance();

        cuenta.debito(1500);
        cuenta.balance();

        cuenta.debito(30000);
        cuenta.balance();




    }
}
