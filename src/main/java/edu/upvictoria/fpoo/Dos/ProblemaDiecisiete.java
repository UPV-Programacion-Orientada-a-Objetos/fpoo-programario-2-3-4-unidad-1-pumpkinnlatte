package edu.upvictoria.fpoo.Dos;

import edu.upvictoria.fpoo.Input;
import edu.upvictoria.fpoo.Mates.Descuentos;

import java.io.IOException;

public class ProblemaDiecisiete {

    public String elegirRegalo(double dinero){
        dinero = Math.abs(dinero);

        if(dinero <= 10){
            return "Tarjeta";
        }
        if(dinero <= 100){
            return "Chocolates";
        }
        if(dinero <= 250){
            return "Flores";
        }
        if(dinero > 251){
            return "Anillo";
        }
        return "";
    }

    public ProblemaDiecisiete(boolean test){}

    public ProblemaDiecisiete() throws IOException {

        System.out.println("Problema 17");
        System.out.println("San Valentin");

        Input leer = new Input();
        Descuentos desc = new Descuentos();

        double dinero = leer.DoubleInput("Ingrese la cantidad de dinero disponible:");

        System.out.println("Con $" + dinero + " el regalo mas óptimo es: " + elegirRegalo(dinero));

    }

}
