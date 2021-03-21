package GuiaObjetos1.ejercicio5;



public class Main {

    public static void main(String[] args){
        Hora reloj = new Hora();

        reloj.setHora(13);
        reloj.setMinuto(12);
        reloj.setSegundo(58);
        reloj.mostrarHora();

        reloj.sumeSeg(reloj.getSegundo(), reloj.getMinuto(), reloj.getHora(), reloj.getDia());
        reloj.mostrarHora();
        reloj.sumeSeg(reloj.getSegundo(), reloj.getMinuto(), reloj.getHora(), reloj.getDia());
        reloj.mostrarHora();

        reloj.resteSeg(reloj.getSegundo(), reloj.getMinuto(), reloj.getHora(), reloj.getDia());
        reloj.mostrarHora();
        reloj.resteSeg(reloj.getSegundo(), reloj.getMinuto(), reloj.getHora(), reloj.getDia());
        reloj.mostrarHora();

    }
}
