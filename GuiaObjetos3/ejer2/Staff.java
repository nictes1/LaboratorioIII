package GuiaObjetos3.ejer2;

public class Staff extends Persona{
    private double salario;
    private char turno; //M o N

    public Staff() {
    }

    public Staff(String dni, String nombre, String apellido, String direccion, String email, double salario, char turno) {
        super(dni, nombre, apellido, direccion, email);
        this.salario = salario;
        this.turno = turno;
    }


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public char getTurno() {
        return turno;
    }

    public void setTurno(char turno) {
        this.turno = turno;
    }


    @Override
    public String toString() {
        return "Staff{" + super.toString() +
                "salario=" + salario +
                ", turno=" + turno +
                '}';
    }
}
