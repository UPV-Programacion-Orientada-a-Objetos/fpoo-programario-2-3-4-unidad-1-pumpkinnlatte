package edu.upvictoria.fpoo.Dos;

import edu.upvictoria.fpoo.Input;
import edu.upvictoria.fpoo.Mates.Descuentos;

import java.io.IOException;

public class ProblemaVeintitres {

    public ProblemaVeintitres(boolean test){}

    public ProblemaVeintitres() throws IOException {

        System.out.println("Problema 23");
        System.out.println("Bono trabajadores");

        Input leer = new Input();
        Descuentos desc = new Descuentos();

        double sueldo = leer.DoubleInput("Ingrese el suendo del trabajador: ");
        int antiguedad = leer.IntInput("Ingrese la antigüedad:");

       
        System.out.println("Porcentaje: " + desc.porcentaje);
        System.out.println("Monto del bono: " + desc.descuento(sueldo));

    }

}
