package edu.upvictoria.fpoo.Tres;

import edu.upvictoria.fpoo.Input;

import java.io.IOException;

public class ProblemaTrece {

    public int obtenerMeses(int meses) {
        int total = 10;
        for (int i = 0; i < meses; i++) {
            total = total * 2;
        }
        return total;
    }

    public ProblemaTrece () throws IOException {
        Input leer = new Input();
        int meses = leer.IntInput("Give me the amount of months");
        System.out.println("The total will be: " + obtenerMeses(meses));
    }

}
