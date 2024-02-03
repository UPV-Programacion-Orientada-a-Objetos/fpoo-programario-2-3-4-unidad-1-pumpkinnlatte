package edu.upvictoria.fpoo.Dos;

import edu.upvictoria.fpoo.Input;
import edu.upvictoria.fpoo.Mates.Comparacion;

import java.io.IOException;

public class ProblemaCinco {

    public ProblemaCinco() throws IOException {

        System.out.println("Problema 5");
        System.out.println("Mayor entre 3 Números");
        Input leer = new Input();
        Comparacion m = new Comparacion();
        double a,b,c;

        a = leer.DoubleInput("Ingrese el primer numero: ");
        b = leer.DoubleInput("Ingrese el segundo numero: ");
        c = leer.DoubleInput("Ingrese el tercer numero: ");

        System.out.println("El numero mayor es: " + m.Mayor(a,b,c));

    }

}
