package GuiaObjetos1.ejercicio2;

public class Empleado {

    private String nombre, apellido;
    private int dni;
    private double salario;

    public Empleado() {
    }

    public Empleado(String nombre, String apellido, int dni, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.salario = salario;
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

    public double salarioAnual(){ return this.salario * 12; }

    public void aumento(double porcentaje){
        this.salario = this.salario + (this.salario * (porcentaje / 100));

    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni=" + dni +
                ", salario=" + salario +
                '}';
    }


}
