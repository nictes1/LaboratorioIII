package GuiaObjetos1.ejercicio1;

public class Ejer1 {

    public static void main (String[] args) {
        Rectangulo rectangulo = new Rectangulo();

        System.out.println("Ancho: " + rectangulo.getAncho() );
        System.out.println("Alto: " + rectangulo.getAlto() );

        System.out.println("Perimetro: " + rectangulo.perimetro());
        System.out.println("Area: " + rectangulo.area() );

        rectangulo.setAncho(50);
        rectangulo.setAlto(60);
        System.out.println( "Perimetro: " + rectangulo.perimetro());
        System.out.println("Area: " + rectangulo.area() );

    }
}
