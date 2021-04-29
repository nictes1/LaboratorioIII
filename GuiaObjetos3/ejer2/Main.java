package GuiaObjetos3.ejer2;


import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Estudiante Nicolas = new Estudiante("42492172", "Nicolas", "Tesone", "Lala 122", "nico@hotmail.com", 2021, 12600, "Tec. programacion");
        Estudiante Martina = new Estudiante("42454235", "Martina", "Nose", "Rere 122", "marti@hotmail.com", 2021, 12600, "Asignaciones");
        Estudiante Roberto = new Estudiante("43726894", "Roberto", "Tampocose", "Wewe 122", "rober_tito@hotmail.com", 2021, 12600, "Ing. Naval");
        Estudiante Lucia = new Estudiante("43982947", "Lucia", "Hitampocose", "Qeqe 122", "Lucialela@hotmail.com", 2021, 12600, "Tec. diseño");

        Staff Director = new Staff("18342536", "Dylan", "thor", "Qwerty 1092", "dylantor@gmail.com", 56000, 'm');
        Staff Vicedirector = new Staff("18342536", "Vicente", "dithor", "Anion 192", "Vicentin@gmail.com", 34000, 'm');
        Staff Profesor = new Staff("23754623", "Pamela", "Sor", "Andorra 1092", "Pamesor@gmail.com", 70000, 'm');
        Staff Limpieza = new Staff("18342536", "Lhimpe", "Ezha", "Evalso 124", "Lhimpe@gmail.com", 80000, 'n');

        Persona[] perso = new Persona[10];
        perso[0] = Nicolas;
        perso[1] = Martina;
        perso[2] = Roberto;
        perso[3] = Lucia;
        perso[4] = Director;
        perso[5] = Vicedirector;
        perso[6] = Profesor;
        perso[7] = Limpieza;

        int cantEst = 0, cantStaff = 0;

        for (Persona persona : perso) {
            if (persona != null) {
                if (persona instanceof Estudiante) cantEst++;
                if (persona instanceof Staff) cantStaff++;
            }
        }

        System.out.printf("La cantidad de estudiantes es de %d y los integrantes del instituto son %d \n", cantEst, cantStaff);
        double totalCuota = 0.0;
        for(Persona persona : perso){
            if(persona != null){
                if(persona instanceof Estudiante){
                    totalCuota = totalCuota + ((Estudiante) persona).getCuota();

                }
            }
        }
        System.out.println("Total de cuotas de los alumnos:  " + totalCuota );


    }
}
