package edu.upvictoria.fpoo.Dos;

import edu.upvictoria.fpoo.Input;
import edu.upvictoria.fpoo.Mates.Descuentos;

import java.io.IOException;

public class ProblemaVeinituno {

    public double asignarBeca(int edad, double promedio) {
        if (edad > 18) {
            return asignarBecaMayoresDe18(promedio);
        } else {
            return asignarBecaMenoresDeIgual18(promedio);
        }
    }

    public double asignarBecaMayoresDe18(double promedio) {
        if (promedio >= 9) {
            return 2000;
        }
        if (promedio >= 7.5) {
            return 1000;
        }

        if (promedio >= 6.0) {
            return 500;
        }
            return 0;
    }

    public double asignarBecaMenoresDeIgual18(double promedio) {
        if (promedio >= 9) {
            return 3000;
        }
        if (promedio >= 7.5) {
            return 2000;
        }

        if (promedio >= 6.0) {
            return 100;
        }
        return 0;
    }

    public ProblemaVeinituno(boolean test){}

    public ProblemaVeinituno() throws IOException {

        System.out.println("Problema 21");
        System.out.println("Becas AMLO");

        Input leer = new Input();
        Descuentos desc = new Descuentos();

        int edad = leer.IntInput("Ingresa la edad del estudiante: ");
        double promedio = leer.DoubleInput("Ingrese el promedio:");

        double beca = asignarBeca(edad, promedio);

        if(beca != 0){
            System.out.println("La beca obtenida es de: " + beca);
        } else {
            System.out.println("-------- CARTA INVITACIÓN --------\nNo fue posible aplicar con su promedio, lo invitamos a mejorarlo");
        }

    }

}
