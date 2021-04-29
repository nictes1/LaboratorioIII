package GuiaObjetos3.ejer3;

public class Circulo extends Caracteristicas{

    private double diametro;
    private final double pi = Math.PI;
    private double radio = this.diametro/2;

    public Circulo(String color, double diametro) {
        super(color);
        this.diametro = diametro;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }


    public double getPi() {
        return pi;
    }

    public double CalcularPerimetro(){
        if(this.diametro != 0){
          return (2 * this.pi) * this.radio;
        }else{
            System.out.println("Error al calular el perimetro del circulo, ingresa un numero mayor a '0'.");
        }
        return 0;
    }

    public double CalcularArea(){
        if(this.radio != 0){
            return this.pi * (this.radio * this.radio);
        }else{
            System.out.println("Error al calular el area del circulo, ingresa un numero mayor a '0'");
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
        return "Circulo{" +
                "diametro=" + diametro +
                ", radio=" + radio +
                ", area=" + area +
                ", perimetro=" + perimetro +
                '}';
    }
}
