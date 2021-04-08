package GuiaObjetos3.ejer1;

public class Cilindro extends Circle{

    private double altura = 1.0;

    public Cilindro() {
    }

    public Cilindro(double radius, String color, double altura) {
        super(radius, color);
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calculateVolume(){
      double volume = calculateArea() * this.altura;
      return volume;
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
