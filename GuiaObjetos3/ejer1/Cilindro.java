package GuiaObjetos3.ejer1;

public class Cilindro extends Circle{

    private double altura = 1.0;

    public Cilindro() {
        super();
    }

    public Cilindro(double radius, String color) {
        super(radius, color);

    }
    public Cilindro(double radius, double altura) {
        super(radius);
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calculateArea() {
        return ((2 * Math.PI * super.getRadius() * this.altura)+(2 * super.calculateArea()));
    }

    public double calculateVolume(){

      return calculateArea() * this.altura;
    }

    @Override
    public String toString() {
        return "Cilindro{" +
                " radius=" + super.getRadius()+
                " altura=" + altura +
                " area=" + super.calculateArea()+
                " volume=" + calculateVolume()+
                '}';
    }
}
