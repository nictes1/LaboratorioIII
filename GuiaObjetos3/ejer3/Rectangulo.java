package GuiaObjetos3.ejer3;

import java.util.Objects;

public class Rectangulo extends Caracteristicas{
    private double altura;
    private double base;

    public Rectangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    public Rectangulo(String color, double altura, double base) {
        super(color);
        this.altura = altura;
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double CalcularArea(){
        if(altura != 0 && base != 0){
            return this.base * altura;
        }else{
            System.out.println("Error al calcular el area de rectangulo. ingresa un numero mayor a '0'");
        }
        return 0;
    }

    public double CalcularPerimetro(){
        if(altura != 0 && base != 0){
            return 2 * (this.altura + this.base);
        }else{
            System.out.println("Error al calcular el perimetro del rectangulo, ingresa un numero mayor a '0'");
        }
        return 0;
    }

    private double area, perimetro;

    public void setArea() {
        this.area = CalcularArea();
    }

    public void setPerimetro() {
        this.perimetro = CalcularPerimetro();
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "altura=" + altura +
                ", base=" + base +
                "Area=" + area +
                ", Perimetro=" + perimetro +
                '}';
    }
}
