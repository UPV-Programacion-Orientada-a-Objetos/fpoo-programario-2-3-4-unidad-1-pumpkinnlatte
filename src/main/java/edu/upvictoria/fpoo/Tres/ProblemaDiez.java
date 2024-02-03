package edu.upvictoria.fpoo.Tres;

import edu.upvictoria.fpoo.Input;

import java.io.IOException;

public class ProblemaDiez {

    public int obtenerHora(int[] hours) {
        int sum = 0;
        for (int hour : hours)
            sum = sum + hour;
        return sum;
    }

    public double obtenerTotal(int[] hours, double payPerHour) {
        return obtenerHora(hours) * payPerHour;
    }

    public ProblemaDiez () throws IOException {
        Input leer = new Input();
        int[] horas = new int[6];
        double pagoHora = leer.DoubleInput("Dame el pago por hora: ");

        for (int i = 0; i < horas.length; i++) {
            horas[i] = leer.IntInput("Dame la cantidad de horas trabajadas " + (i + 1));
        }

        System.out.println("El total de horas es de: " + obtenerHora(horas)
                + " con un total de" + obtenerTotal(horas, pagoHora));
    }

}
