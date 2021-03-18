package TpIntroduccion.ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int gFarenheit = scan.nextInt();

        float Celsius  = (gFarenheit - 32) / 1.8f;

        System.out.println("Los grados " + gFarenheit + " son iguales a: " + Celsius);

    }

}
