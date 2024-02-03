package edu.upvictoria.fpoo.Dos;

import edu.upvictoria.fpoo.Input;
import edu.upvictoria.fpoo.Mates.Descuentos;

import java.io.IOException;

public class ProblemaDieciseis {

    public double calculoSalario(double horas, double pxH){

        if (horas > 40) {
            return (40 * pxH) + ((horas - 40) * (pxH*2));
        }
        return horas * pxH;
    }

    public ProblemaDieciseis(boolean test){}

    public ProblemaDieciseis() throws IOException {

        System.out.println("Problema 16");
        System.out.println("Sueldo Trabajador");

        Input leer = new Input();

        double pxH = leer.DoubleInput("Ingrese el Pago por Hora: ");
        double horas = leer.DoubleInput("Ingrese la cantidad de horas trabajadas: ");

        System.out.println("El salario es de: $" + calculoSalario(horas, pxH));

    }

}
