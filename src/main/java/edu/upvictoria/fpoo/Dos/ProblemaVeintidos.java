package edu.upvictoria.fpoo.Dos;

import edu.upvictoria.fpoo.Input;
import edu.upvictoria.fpoo.Mates.Descuentos;

import java.io.IOException;
import java.sql.SQLOutput;

public class ProblemaVeintidos {

    public double bonoSueldo(double sueldo){
        if (sueldo < 1000){
            return 0.25;
        }
        if(sueldo <= 3500){
            return 0.15;
        }
        return 0.10;
    }

    public double bonoAntiguedad(int anos){
        if(anos >= 5){
            return 0.30;
        }
        return 0.20;
    }

    public double calcularBono(double sueldo, int anos){
        if(bonoSueldo(sueldo) > bonoAntiguedad(anos)){
            System.out.println("Bono obtenido: Sueldo");
            return bonoSueldo(sueldo);
        }
        System.out.println("Bono obtenido: Antigüedad");
        return bonoAntiguedad(anos);
    }

    public ProblemaVeintidos(boolean test){}

    public ProblemaVeintidos() throws IOException {

        System.out.println("Problema 22");
        System.out.println("Bono trabajadores");

        Input leer = new Input();
        Descuentos desc = new Descuentos();

        double sueldo = leer.DoubleInput("Ingrese el suendo del trabajador: ");
        int antiguedad = leer.IntInput("Ingrese la antigüedad:");

        desc.porcentaje = calcularBono(sueldo, antiguedad);

        System.out.println("Porcentaje: " + desc.porcentaje);
        System.out.println("Monto del bono: " + desc.descuento(sueldo));

    }

}
