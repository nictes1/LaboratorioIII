package TpIntroduccion.ejercicio7;

public class Ejercicio7 {

    public static void main (String[] args) {
        int C = 10;

        if (C > 0){
            System.out.println("El numero es Positivo");
            if (C < 100){
                System.out.println("El numero es menor a 100");
            }else{
                System.out.println("El numero es mayor a 100");
            }
            if (C %2 == 0){
                System.out.println("El numero es par");
            }else{
                System.out.println("El numero es impar");
            }
            if(C/5 == 0){
                System.out.println("El numero es multiplo de 5");
            }else{
                System.out.println("El numero es no es multiplo de 5");
            }
            if(C/10 == 0){
                System.out.println("El numero es multiplo de 10");
            }else{
                System.out.println("El numero es no es multiplo de 10");
            }
        }else{
            System.out.println("El numero es Negativo");
            System.out.println("El numero es menor a 100");
        }
    }


}
