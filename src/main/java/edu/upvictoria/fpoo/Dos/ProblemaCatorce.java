package edu.upvictoria.fpoo.Dos;

import edu.upvictoria.fpoo.Input;
import edu.upvictoria.fpoo.Mates.Descuentos;

import java.io.IOException;

public class ProblemaCatorce {

    public double tipoTarjeta(int tipo){
        tipo = Math.abs(tipo);
        if(tipo == 1){
            return 0.25;
        }

        if(tipo == 2){
            return 0.35;
        }

        if(tipo == 3){
            return 0.40;
        }
        return 0.50;
    }

    public double aumentoCredito(int tipo, double credito){
        Descuentos des = new Descuentos();
        des.porcentaje = tipoTarjeta(tipo);

        return credito + des.descuento(credito);
    }

    public  ProblemaCatorce(boolean test){

    }

    public ProblemaCatorce() throws IOException {

        System.out.println("Problema 14");
        System.out.println("Créditos Tarjetas");

        Input leer = new Input();
        Descuentos desc = new Descuentos();

        double credito = leer.DoubleInput("Ingrese el monto del crédito actual: $ ");
        int tipo = leer.IntInput("Ingrese el tipo de su tarjeta (1-3): ");

        System.out.println("Costo total: $ " + aumentoCredito(tipo, credito));

    }

}
