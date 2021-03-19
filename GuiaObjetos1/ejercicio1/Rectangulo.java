package GuiaObjetos1.ejercicio1;

public class Rectangulo {
    private double ancho = 1.0;
    private double alto = 1.0;

    public Rectangulo() {
    }

    public Rectangulo(double ancho, double alto){
        this.alto = alto;
        this.ancho = ancho;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double perimetro(){
        return (ancho + alto) * 2;
    }

    public double area(){
        return (ancho * alto);
    }

}
