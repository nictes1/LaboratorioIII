package GuiaObjetos3.ejer2;

public class Estudiante extends Persona{

    private int añoIngreso;
    private double cuota;
    private String carrera;


    public Estudiante() {
    }

    public Estudiante(String dni, String nombre, String apellido, String direccion, String email, int añoIngreso, double cuota, String carrera) {
        super(dni, nombre, apellido, direccion, email);
        this.añoIngreso = añoIngreso;
        this.cuota = cuota;
        this.carrera = carrera;
    }


    public int getAñoIngreso() {
        return añoIngreso;
    }

    public void setAñoIngreso(int añoIngreso) {
        this.añoIngreso = añoIngreso;
    }

    public double getCuota() {
        return cuota;
    }

    public void setCuota(double cuota) {
        this.cuota = cuota;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }


    @Override
    public String toString() {
        return "Estudiante{" + super.toString() +
                "añoIngreso =" + añoIngreso +
                ", cuota =" + cuota +
                ", carrera ='" + carrera + '\'' +
                '}';
    }
}
