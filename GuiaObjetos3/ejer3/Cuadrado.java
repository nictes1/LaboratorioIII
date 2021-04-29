package GuiaObjetos3.ejer3;

public class Cuadrado extends Caracteristicas {
    private double lado;

    public Cuadrado(String color, double lado) {
        super(color);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double CalcularArea(){
        if(this.lado != 0){
            return this.lado * this.lado;
        }else{
            System.out.println("Error al calcular Area de cuadrado, ingresa un numero mayor a '0'.");
        }
        return 0;
    }

    public double CalcularPerimetro(){
        if(this.lado != 0){
            return 4 * this.lado;
        }else{
            System.out.println("Error al calcular Perimetro del cuadrado, ingresa un numero mayor a '0'.");
        }
        return 0;
    }

    private double perimetro, area;

    public void setArea() {
        this.area = CalcularArea();
    }

    public void setPerimetro() {
        this.perimetro = CalcularPerimetro();
    }

    @Override
    public String toString() {
        return "Cuadrado{" +
                "lado=" + lado +
                ", perimetro=" + perimetro +
                ", area =" + area +
                '}';
    }
}
