package edu.upvictoria.fpoo.Dos;

import edu.upvictoria.fpoo.Input;
import edu.upvictoria.fpoo.Mates.Descuentos;

import java.io.IOException;

public class ProblemaQuince {

    public boolean puedeVotar(int edad){
        return edad >= 18;
    }

    public ProblemaQuince(boolean test){}

    public ProblemaQuince() throws IOException {

        System.out.println("Problema 15");
        System.out.println("Edad Votaciones");

        Input leer = new Input();
        Descuentos desc = new Descuentos();

        int edad = leer.IntInput("Ingrese la edad:");

        if (puedeVotar(edad)){
            System.out.println("La persona cumple con la edad para votar en las siguientes elecciones");
        }

    }

}
