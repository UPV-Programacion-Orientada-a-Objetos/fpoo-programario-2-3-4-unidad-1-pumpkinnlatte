package edu.upvictoria.fpoo.Dos;

import edu.upvictoria.fpoo.Input;
import edu.upvictoria.fpoo.Main;
import edu.upvictoria.fpoo.Mates.Descuentos;

import java.io.IOException;

public class ProblemaNueve {

    public double calcularLlamada(double tiempo, int dia, String turno){

        Descuentos desc = new Descuentos();
        tiempo = Math.abs(tiempo);

        double costo = 1.00;

        if(tiempo < 6){
            System.out.println("Costo por minuto: $ 1.00");
        }

        if(tiempo < 9){
            System.out.println("Costo por minuto: $ 0.85");
            costo = 0.85;
        }

        if(tiempo < 11){
            System.out.println("Costo por minuto: $ 0.70");
            costo = 0.70;
        }

        if(tiempo >= 11){
            System.out.println("Costo por minuto: $ 0.50");
            costo = 0.50;
        }

        if(Math.abs(dia) == 7){
            desc.porcentaje = 0.03;
            System.out.println("Impuesto por día 3% : $ " + desc.descuento(tiempo * costo ));
        } else {
            if(turno.equals("Matutino")){
                desc.porcentaje = 0.15;
                System.out.println("Impuesto por día - Turno Matutino 15% :" + desc.descuento(tiempo * costo));
            }
            if(turno.equals("Vespertino")){
                desc.porcentaje = 0.10;
                System.out.println("Impuesto por día - Turno Vespertino: 10% :" + desc.descuento(tiempo * costo));
            }
        }

        double impuesto = desc.descuento(tiempo * costo);

        return (tiempo * costo) + impuesto;

    }

    public  ProblemaNueve(boolean test) {

    }

    public ProblemaNueve() throws IOException {

        System.out.println("Problema 9");
        System.out.println("Chismefón");

        Input leer = new Input();
        Descuentos desc = new Descuentos();

        double minutos = leer.DoubleInput("Ingrese la duración de la llamada en minutos: ");
        System.out.println("-----------------------------------------");
        System.out.println("1.Lunes\n2.Martes\n3.Miércoles\n4.Jueves\n5.Viernes\n6.Sábado\n7.Domingo");
        System.out.println("-----------------------------------------");
        int dia = leer.IntInput("Ingrese el día de la semana: ");
        String turno = leer.StringInput("Ingrese el turno (Matutino-Vespertino): ");


        System.out.println("Costo total: $ " + calcularLlamada(minutos, dia, turno));


    }

}
