package edu.upvictoria.fpoo.Dos;

import edu.upvictoria.fpoo.Input;
import edu.upvictoria.fpoo.Mates.Descuentos;

import java.io.IOException;

public class ProblemaTrece {

    public double cargaClave(int clave){
        if(clave == 3 || clave == 4){
            return .75;
        }

        if(clave == 1 || clave == 5){
            return .80;
        }

        if(clave == 2 || clave == 6){
            return .85;
        }

        return 0;
    }

    public double costoManoObra(){
        return 0;
    }

    public ProblemaTrece(boolean test){

    }

    public ProblemaTrece() throws IOException {

        System.out.println("Problema 13");
        System.out.println("Fábricas");

        Input leer = new Input();
        Descuentos desc = new Descuentos();

        int minutos = leer.IntInput("Ingrese la clave del producto (1-6): ");
        double precio = leer.DoubleInput("Ingrese el costo de la materia prima: $ ");
        double obra = leer.DoubleInput("Ingrese el costo de la mano de obra: $ ");
        double fabricacion = leer.DoubleInput("Ingrese el costo de fabricación: $ ");




    }

}
