package edu.upvictoria.fpoo.Dos;

import edu.upvictoria.fpoo.Input;
import edu.upvictoria.fpoo.Mates.Descuentos;

import java.io.IOException;
import java.util.Objects;

public class ProblemaOcho {

    public double calcularViaje(int alumnos){

        alumnos = Math.abs(alumnos);

        if(alumnos >=100){
            return alumnos * 65;
        }

        if(alumnos >= 50){
            return alumnos * 70;
        }

        if(alumnos <= 30){
            return alumnos * 95;
        }

        return 4000;
    }

    public ProblemaOcho() throws IOException {

        System.out.println("Problema 8");
        System.out.println("Viaje de estudios");

        Input leer = new Input();
        Descuentos desc = new Descuentos();

        int alumnos = leer.IntInput("Ingrese la canitdad de alumnos que viajarán: ");

        System.out.println("Cantidad de alumnos: $ " + alumnos);
        System.out.println("Pago por alumno: $ " + calcularViaje(alumnos) / alumnos);
        System.out.println("Pago total: $ " + calcularViaje(alumnos));


    }

}
