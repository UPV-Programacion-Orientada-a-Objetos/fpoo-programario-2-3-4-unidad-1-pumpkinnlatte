package edu.upvictoria.fpoo.Dos;

import edu.upvictoria.fpoo.Input;
import edu.upvictoria.fpoo.Mates.Descuentos;

import java.io.IOException;

public class ProblemaDieciocho {

    public double calcularEstacionamiento(double horas){
        double total = 0;
        for (int i = 0; i < horas; i++) {
            total += tarifa(i);
        }
        return total;
    }

    public double tarifa(double horas){
        if(horas <= 2){
            return 5.00;
        }
        if(horas <= 5){
            return 4.00;
        }
        if(horas <= 10){
            return 3.00;
        }
        return 3.00;
    }

    public ProblemaDieciocho(boolean test){}

    public ProblemaDieciocho() throws IOException {

        System.out.println("Problema 18");
        System.out.println("Estacionamiento");

        Input leer = new Input();
        Descuentos desc = new Descuentos();

        double horas = leer.DoubleInput("Ingrese la cantidad de horas usadas:");
        System.out.println("El total a pagar por el servicio es de: " + calcularEstacionamiento(horas));

    }

}
