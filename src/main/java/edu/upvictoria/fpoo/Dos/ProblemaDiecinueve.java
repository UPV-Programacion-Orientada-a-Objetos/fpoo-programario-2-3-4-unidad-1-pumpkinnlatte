package edu.upvictoria.fpoo.Dos;

import edu.upvictoria.fpoo.Input;
import edu.upvictoria.fpoo.Mates.Descuentos;

import java.io.IOException;
import java.util.Calendar;

public class ProblemaDiecinueve {

    public Calendar crearFecha(int mes, int dia, int ano){
        Calendar fecha = Calendar.getInstance();
        fecha.set(ano,mes,dia);
        return fecha;
    }

    public int mayorEdad(Calendar fecha1, Calendar fecha2){
        return fecha1.compareTo(fecha2);
    }

    public ProblemaDiecinueve(boolean test){}

    public ProblemaDiecinueve() throws IOException {

        System.out.println("Problema 19");
        System.out.println("Fechas y Edades");

        Input leer = new Input();
        Descuentos desc = new Descuentos();

        System.out.println("------------- FECHA 1 -------------");
        String nombre = leer.StringInput("Ingrese el nombre: ");
        int dia = leer.IntInput("Ingrese el dia: ");
        int mes = leer.IntInput("Ingrese el mes: ");
        int ano = leer.IntInput("Ingrese el año: ");
        Calendar f1 = crearFecha(mes,dia,ano);
        System.out.println("------------- FECHA 2 -------------");
        String nombre2 = leer.StringInput("Ingrese el nombre: ");
        int dia2 = leer.IntInput("Ingrese el dia: ");
        int mes2 = leer.IntInput("Ingrese el mes: ");
        int ano2 = leer.IntInput("Ingrese el año: ");
        Calendar f2 = crearFecha(mes2,dia2,ano2);
        System.out.println("------------- FECHA 3 -------------");
        String nombre3 = leer.StringInput("Ingrese el nombre: ");
        int dia3 = leer.IntInput("Ingrese el dia: ");
        int mes3 = leer.IntInput("Ingrese el mes: ");
        int ano4 = leer.IntInput("Ingrese el año: ");
        Calendar f3 = crearFecha(mes2,dia2,ano2);

        if(mayorEdad(f1,f2) > 0){
            if(mayorEdad(f1,f3) > 0){
                System.out.println(nombre + " es el mayor, nacido el " + f1);
            }

            if(mayorEdad(f2,f3) > 0){
                System.out.println(nombre + " es el mayor, nacido el " + f2);
            } else {
                System.out.println(nombre + " es el mayor, nacido el " + f3);
            }

        }

        if(mayorEdad(f1,f2) < 0){
            if(mayorEdad(f1,f3) < 0){
                System.out.println(nombre + " es el menor, nacido el " + f1);
            }

            if(mayorEdad(f2,f3) < 0){
                System.out.println(nombre + " es el menor, nacido el " + f2);
            } else {
                System.out.println(nombre + " es el menor, nacido el " + f3);
            }

        }

    }

}