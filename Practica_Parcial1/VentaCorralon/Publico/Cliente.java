package Practica_Parcial1.VentaCorralon.Ventas;

import java.util.UUID;

public class Cliente {
    private UUID id;
    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private long telefono;
    private String dni;
    private String tipoCliente;

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, String fechaNacimiento, long telefono, String dni, String tipoCliente) {
        this.id = UUID.randomUUID();
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.dni = dni;
        this.tipoCliente = tipoCliente;
    }
}
