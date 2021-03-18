package TpIntroduccion.ejercicio4;

public class Ejercicio4 {

    public static void main (String[] args) {
        int A = 1, B = 2, C = 3, D = 4;
        int tempB;
        tempB = B;
        B = C;
        C = A;
        A = D;
        D = tempB;

        System.out.println("Valores: " + "\nA =" + A + "\nB =" + B + "\nC =" + C +"\nD =" + D);

    }
}
