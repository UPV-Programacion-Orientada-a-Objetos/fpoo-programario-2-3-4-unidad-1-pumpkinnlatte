package edu.upvictoria.fpoo.Dos;
import edu.upvictoria.fpoo.Input;
import edu.upvictoria.fpoo.Mates.Comparacion;

import java.io.IOException;

public class ProblemaDos {

    public ProblemaDos() throws IOException {
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
