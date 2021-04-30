package GuiaObjetos3.ejer3;

public class Circulo extends Caracteristicas{

    private double diametro;
    private final double pi = Math.PI;

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

    public double CalcularRadio(){
        if(this.diametro != 0){
            return diametro / 2;
        }else{
            System.out.println("Error al calular el radio del circulo, ingresa un numero mayor a '0'.");
        }
        return 0;
    }

    public double CalcularPerimetro(){
        if(this.diametro != 0){
          return (2 * this.pi) * CalcularRadio();
        }else{
            System.out.println("Error al calular el perimetro del circulo, ingresa un numero mayor a '0'.");
        }
        return 0;
    }

    public double CalcularArea(){
        if(CalcularRadio() != 0){
            return this.pi * (CalcularRadio() * CalcularRadio());
        }else{
            System.out.println("Error al calular el area del circulo, ingresa un numero mayor a '0'");
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Circulo: Diametro=" + this.diametro + "Radio= "+ CalcularRadio() + "Area= "+ CalcularArea()+ "Perimetro= " + CalcularPerimetro() + "Color= " + super.getColor() ;
    }


}
