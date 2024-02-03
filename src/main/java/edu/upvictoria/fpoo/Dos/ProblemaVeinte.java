package edu.upvictoria.fpoo.Dos;

import edu.upvictoria.fpoo.Input;
import edu.upvictoria.fpoo.Mates.Descuentos;

import java.io.IOException;

public class ProblemaVeinte {

    public ProblemaVeinte(boolean test){}

    public double descProd(double precio){

        if(precio >= 200){
            return 0.15;
        }

        if(precio > 100){
            return 0.12;
        }

        return 0.10;

    }

    public ProblemaVeinte() throws IOException {

        System.out.println("Problema 20");
        System.out.println("Estacionamiento");

        Input leer = new Input();
        Descuentos desc = new Descuentos();

        double precio = leer.DoubleInput("Ingrese el precio del producto: ");

        System.out.println("Se le aplica un descuento de: " + descProd(precio));
        System.out.println("El precio total es de: " + desc.descuento(precio, descProd(precio)));

    }

}
