package edu.upvictoria.fpoo.Tres;

import edu.upvictoria.fpoo.Input;

import java.io.IOException;

public class ProblemaOnce {

    public int obtenerKilometro(int km1, int km2) {
        while (km1 < km2) {
            km1++;
            km2--;
        }

        return km1;
    }

    public ProblemaOnce () throws IOException {
        Input leer = new Input();

        int km1 = leer.IntInput("Dame los km de la primera persona:");
        int km2 = leer.IntInput("Dame los km de la segunda persona");

        System.out.println("Se encontrarán en el kilometro" + obtenerKilometro(km1, km2));
    }

}
