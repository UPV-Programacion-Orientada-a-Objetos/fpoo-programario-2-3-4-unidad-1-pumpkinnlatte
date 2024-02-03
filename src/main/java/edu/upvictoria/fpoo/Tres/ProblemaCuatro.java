package edu.upvictoria.fpoo.Tres;

import edu.upvictoria.fpoo.Input;

import java.io.IOException;

public class ProblemaCuatro {

    public double obtenerPromedio (int ninos) throws IOException {
        Input leer = new Input();
        double prom = 0;
        for (int i = 0; i < ninos; i++) {
            prom = prom + leer.IntInput("Dame la edad del niño" + i + 1);
        }
        return prom / ninos;
    }

    public ProblemaCuatro () throws IOException {
        Input leer = new Input();
        int ninos = leer.IntInput("Ingresa el numero niños");

        System.out.println("El promedio es de: " + obtenerPromedio(ninos));
    }

    public ProblemaCuatro (boolean test) {}

}
