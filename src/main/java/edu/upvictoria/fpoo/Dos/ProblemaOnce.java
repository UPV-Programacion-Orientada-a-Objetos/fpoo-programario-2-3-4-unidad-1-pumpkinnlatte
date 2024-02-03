package edu.upvictoria.fpoo.Dos;

import edu.upvictoria.fpoo.Input;
import edu.upvictoria.fpoo.Mates.Descuentos;

import java.io.IOException;

public class ProblemaOnce {

    public double calcularHamburguesa(int tipo, int cantidad, int pago){

        Descuentos impuesto = new Descuentos(0);
        tipo = Math.abs(tipo);
        cantidad = Math.abs(cantidad);

        if(pago == 2){
            impuesto.porcentaje = 0.05;
        }

        if(tipo == 1){
            return (cantidad * 20) + impuesto.descuento(cantidad * 20);
        }

        if(tipo == 2){
            return (cantidad * 25) + impuesto.descuento(cantidad * 20);
        }

        if(tipo == 3){
            return (cantidad * 28) + impuesto.descuento(cantidad * 20);
        }

        return -1;

    }

    public  ProblemaOnce(boolean test) {

    }

    public ProblemaOnce() throws IOException {

        System.out.println("Problema 11");
        System.out.println("El náufrago satisfecho");

        Input leer = new Input();
        Descuentos desc = new Descuentos();

        System.out.println("-----------------------------------------");
        System.out.println("          TIPOS DE HAMBURGUESA");
        System.out.println("-----------------------------------------");
        System.out.println("1.Sencillas\n2.Dobles\n3.Triples");
        System.out.println("-----------------------------------------");
        int tipo = leer.IntInput("Ingrese la opción deseada: ");
        int cantidad = leer.IntInput("Ingrese la cantidad: ");
        System.out.println("-----------------------------------------");
        System.out.println("             TIPO DE PAGO");
        System.out.println("-----------------------------------------");
        System.out.println("1.Efectivo\n2.Tarjeta de Crédito");
        int pago = leer.IntInput("Ingrese la opción deseada: ");

        System.out.println("Costo a pagar: $ " + calcularHamburguesa(tipo, cantidad, pago));

    }

}
