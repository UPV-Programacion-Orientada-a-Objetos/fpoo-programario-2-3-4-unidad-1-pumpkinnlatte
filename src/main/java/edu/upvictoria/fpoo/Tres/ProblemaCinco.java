package edu.upvictoria.fpoo.Tres;

import edu.upvictoria.fpoo.Input;

import java.io.IOException;

public class ProblemaCinco {

    public double obtenerAltura (int ninos) throws IOException {
        Input leer = new Input();
        double prom = 0;
        for (int i = 0; i < ninos; i++) {
            prom = prom + leer.IntInput("Dame la altura del niño" + i + 1);
        }
        return prom / ninos;
    }

    public ProblemaCinco () throws IOException{
        Input leer = new Input();
        int ninos = leer.IntInput("Ingrese la cantidad de niños:");

        System.out.println("El promedio de altura es de: " + obtenerAltura(ninos));
    }

}
