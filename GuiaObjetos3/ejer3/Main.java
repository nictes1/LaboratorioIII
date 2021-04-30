package GuiaObjetos3.ejer3;

public class Main {
    public static void main(String[] args) {
        Circulo circulito = new Circulo("verde", 10);
        Rectangulo rectangulito = new Rectangulo("azul", 2,3);
        Cuadrado cuadradito = new Cuadrado("rosa", 5);

        System.out.println(circulito.toString());
        System.out.println(rectangulito.toString());
        System.out.println(cuadradito.toString());

    }
}
