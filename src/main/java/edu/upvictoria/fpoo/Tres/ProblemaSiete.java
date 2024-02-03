package edu.upvictoria.fpoo.Tres;

import edu.upvictoria.fpoo.Input;
import edu.upvictoria.fpoo.Mates.Comparacion;

import java.io.IOException;

public class ProblemaSiete {

    public ProblemaSiete() throws IOException {

        System.out.println("Problema 7");
        System.out.println("Positivo o Negativo");

        Input leer = new Input();
        Comparacion c = new Comparacion();
        double num = leer.DoubleInput("Ingresa el número: ");

        if(!c.esPositivo(num) && !c.esNegativo(num)){
            System.out.println("El numero ingresado no aplica al caso");
        } else {
            if(c.esPositivo(num)){
                System.out.println("El numero ingresado es positivo");
            } else {
                System.out.println("El numero ingresado es negativo");
            }
        }
    }

}
