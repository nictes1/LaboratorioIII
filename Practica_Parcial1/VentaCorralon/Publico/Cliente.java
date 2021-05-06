package Practica_Parcial1.VentaCorralon.Publico;

import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

public class Cliente {
    private int idCliente;
    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private long telefono;
    private String dni;
    private int tipoCliente;

    private static final AtomicInteger count = new AtomicInteger(1001);

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, String fechaNacimiento, long telefono, String dni, int tipoCliente) {
        this.idCliente = idRandom();
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.dni = dni;
        this.tipoCliente = tipoCliente;
    }

    public int idRandom() {
        return idCliente = count.incrementAndGet();
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
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

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(int tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
}
