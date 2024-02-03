package edu.upvictoria.fpoo.Dos;

import edu.upvictoria.fpoo.Input;
import edu.upvictoria.fpoo.Main;
import edu.upvictoria.fpoo.Mates.Descuentos;

import java.io.IOException;

public class ProblemaNueve {

    public double costoMinuto(double tiempo) {
        if(tiempo <= 5){
            System.out.println("Costo por minuto: $ 1.00");
            return 1;
        }

        if(tiempo <= 8){
            System.out.println("Costo por minuto: $ 0.85");
            return  0.85;
        }

        if(tiempo <= 10){
            System.out.println("Costo por minuto: $ 0.70");
            return  0.70;
        }

        System.out.println("Costo por minuto: $ 0.50");
        return 0.50;

    }

    public double calcularLlamada(double tiempo, int dia, String turno){

        Descuentos desc = new Descuentos();
        tiempo = Math.abs(tiempo);

        double total = 0;

        for (int i = 1; i <= tiempo; i++) {
            total += costoMinuto(i);
        }

        if(Math.abs(dia) == 7){
            desc.porcentaje = 0.03;
            System.out.println("Impuesto por día 3% : $ " + desc.descuento(total));
        } else {
            if(turno.equals("Matutino")){
                desc.porcentaje = 0.15;
                System.out.println("Impuesto por día - Turno Matutino 15% :" + desc.descuento(total));
            }
            if(turno.equals("Vespertino")){
                desc.porcentaje = 0.10;
                System.out.println("Impuesto por día - Turno Vespertino: 10% :" + desc.descuento(total));
            }
        }

        double impuesto = desc.descuento(total);

        return (total) + impuesto;

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
