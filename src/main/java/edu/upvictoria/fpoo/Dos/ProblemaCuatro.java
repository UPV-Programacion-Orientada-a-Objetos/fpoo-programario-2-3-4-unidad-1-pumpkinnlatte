package edu.upvictoria.fpoo.Dos;

import edu.upvictoria.fpoo.Input;
import edu.upvictoria.fpoo.Mates.Descuentos;

import java.io.IOException;

public class ProblemaCuatro {

    public ProblemaCuatro() throws IOException {

        Input leer = new Input();
        Descuentos desc = new Descuentos();
        double d = 0.8;

        double traje = leer.DoubleInput("Ingresa el precio del traje elejido: ");

        if(traje > 2500){
            d = 0.15;
        }

        System.out.println("El precio a pagar es de: " + desc.descuento(traje, d));

    }

}
