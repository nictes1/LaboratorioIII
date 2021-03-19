package TpIntroduccion.ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();

        int doble = numero *2;
        int triple = numero *3;

        System.out.println("el numero: " + numero + "su doble es: " + doble + "y su triple es: " + triple);
    }

}
