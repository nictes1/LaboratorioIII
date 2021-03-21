package GuiaObjetos1.ejercicio4;

public class main {

    public static void main (String[] args) {

        Banco cuenta = new Banco();

        cuenta.setId(00133002233);
        cuenta.setNombre("Nicolas");
        cuenta.setBalance(15000);

        cuenta.MostrarCuenta();

        cuenta.setBalance(cuenta.Credito(2500));
        cuenta.Balance();

        cuenta.Debito(1500);
        cuenta.Balance();

        cuenta.Debito(30000);
        cuenta.Balance();




    }
}
