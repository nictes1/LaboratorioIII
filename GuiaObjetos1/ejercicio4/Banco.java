package GuiaObjetos1.ejercicio4;

public class Banco {

    private double id;
    private String nombre;
    private double balance;

    public Banco() {
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double Credito(double deposito){
        double credit = this.balance + deposito;
        return credit;
    }

    public void Debito(double retiro){
        double total = this.balance - retiro;
        if(total >= 0){
            System.out.printf("Retiro de dinero exitoso. \n");
        }else {
            System.out.printf("Fondos insuficientes.\n");
        }
    }

    public void MostrarCuenta(){
        System.out.printf("Id: %.0f, Nombre: %s, Balance: %.0f \n", this.id, this.nombre, this.balance);
    }

    public void Balance(){
        System.out.printf("Su cuenta tiene $%.0f \n", this.balance);
    }





}
