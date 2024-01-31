package edu.upvictoria.fpoo.Dos;

import edu.upvictoria.fpoo.Input;
import edu.upvictoria.fpoo.Mates.Descuentos;

import java.io.IOException;

public class ProblemaSeis {

    public ProblemaSeis(boolean test) {

    }

    public double calcularBanquete(int personas){
        personas = Math.abs(personas);
        if(personas > 200 && personas <= 300){
            return personas * 85;
        }
        if(personas > 300){
            return personas * 75;
        }
        return personas * 95;
    }

    public ProblemaSeis() throws IOException {

        Input leer = new Input();
        Descuentos desc = new Descuentos();

        int personas = leer.IntInput("Ingresa el numero de personas que asistirán: ");

        System.out.println("El precio a pagar es de: " +calcularBanquete(personas));

    }

}
