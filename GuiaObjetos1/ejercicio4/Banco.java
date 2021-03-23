package GuiaObjetos1.ejercicio4;

public class Banco {

    private double id;
    private String nombre;
    private double balance;

    public Banco() {
    }

    public Banco(double id, String nombre, double balance) {
        this.id = id;
        this.nombre = nombre;
        this.balance = balance;
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

    public double credito(double deposito){
        return this.balance = this.balance + deposito;
    }

    public double debito(double retiro){

        if(this.balance >= 0){
            this.balance = this.balance - retiro;
        }else {
            System.out.printf("Fondos insuficientes.\n");
        }

        return this.balance;
    }

    public void mostrarCuenta(){
        System.out.printf("Id: %.0f, Nombre: %s, Balance: %.0f \n", this.id, this.nombre, this.balance);
    }

    public void balance(){
        System.out.printf("Su cuenta tiene $%.0f \n", this.balance);
    }





}
