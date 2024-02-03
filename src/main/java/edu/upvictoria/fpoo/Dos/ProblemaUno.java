package edu.upvictoria.fpoo.Dos;

import edu.upvictoria.fpoo.Input;
import edu.upvictoria.fpoo.Mates.Comparacion;
import java.io.IOException;

public class ProblemaUno {

    public ProblemaUno() throws IOException {

        System.out.println("Problema 1");
        System.out.println("Numero mayor");

        Input leer = new Input();
        Comparacion c = new Comparacion();

        double a = leer.IntInput("Ingrese el primer número: ");
        double b = leer.IntInput("Ingrese el segundo número: ");
        System.out.println("El número mayor es " + c.Mayor(a,b));

    }

}
