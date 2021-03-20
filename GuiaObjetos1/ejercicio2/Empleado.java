package GuiaObjetos1.ejercicio2;

public class Empleado {

    private String nombre, apellido;
    private int dni;
    private double salario;

    public Empleado() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public double salarioAnual(){
        this.salario = salario;
        return salario * 12;
    }

    public void aumento(int porAumento){
       double aumento = ((salarioAnual() * porAumento) / 100);
       double aumentoTotal = aumento + salarioAnual();
       System.out.println("Empleado- " + nombre + " " + apellido + ". Su salario anual con 15% de aumento es: " + aumentoTotal + ".");
    }

    public void mostrarEmpleado(){
        System.out.println("Empleado-  Dni: " + dni + " " + nombre + " " + apellido + " Salario: " + salario );
    }


}
