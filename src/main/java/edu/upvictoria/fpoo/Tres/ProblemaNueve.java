package edu.upvictoria.fpoo.Tres;

import edu.upvictoria.fpoo.Input;

import java.io.IOException;

public class ProblemaNueve {

    public ProblemaNueve () throws IOException {
        Input leer = new Input();
        int elementos = leer.IntInput("Ingrese el numero de elementos:");

        int previo = 0;
        int actual = 1;

        if (elementos <= 2) {
            if(elementos == 1)
                System.out.println("0");
            else
                System.out.println("0\n1");
            return;
        }

        for (int i = 0; i < elementos; i++) {
            int nuevoE = previo + actual;
            System.out.println(nuevoE);
            previo = actual;
            actual = nuevoE;
        }
    }

}
