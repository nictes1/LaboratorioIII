package GuiaObjetos1.ejercicio2;

public class main {

    /*Inicialice un empleado Carlos Gutiérrez, con dni 23456345 y salario inicial de
25000.
    b. Inicialice un empleado Ana Sánchez, con dni 34234123 y salario inicial de
27500.*/
    public static void main (String[] args) {

        Empleado emple1 = new Empleado();
        Empleado emple2 = new Empleado();

        /*Empleado 1, Carlos Gutiérrez, con dni 23456345 y salario inicial de 25000.*/
        emple1.setNombre("Carlos");
        emple1.setApellido("Gutierrez");
        emple1.setDni(23456345);
        emple1.setSalario(25000);

        /*Empleado 2, Ana Sánchez, con dni 34234123 y salario inicial de 27500.*/
        emple2.setNombre("Ana");
        emple2.setApellido("Sánchez");
        emple2.setDni(34234123);
        emple2.setSalario(27500);

        emple1.toString();
        emple2.toString();

        double salarioEmple1 = emple1.salarioAnual();
        double salarioEmple2  =emple2.salarioAnual();

        System.out.println(emple1.getNombre() + "," + " su salario es de: " + salarioEmple1);
        System.out.println(emple2.getNombre() + "," + " su salario es de: " + salarioEmple2);


        emple1.aumento(15);
        emple2.aumento(15);




    }

}
