package edu.upvictoria.fpoo.Dos;

import edu.upvictoria.fpoo.Input;
import java.io.IOException;

public class ProblemaDiez {

    public double calcularViaje(String tipo, int personas, double distancia){

        if(Math.abs(personas) < 20){
            personas = 20;
        }

        if(tipo.equalsIgnoreCase("a")){
            return 2.0 * distancia * personas;
        }

        if(tipo.equalsIgnoreCase("b")){
            return personas * 2.5;
        }

        if(tipo.equalsIgnoreCase("c")){
            return personas * 3.0;
        }
        return -1;

    }

    public  ProblemaDiez(boolean test) {

    }

    public ProblemaDiez() throws IOException {

        System.out.println("Problema 10");
        System.out.println("Autobuses ABC");

        Input leer = new Input();

        String tipo = leer.StringInput("Ingrese el tipo de autobus (A,B,C): ");
        int personas = leer.IntInput("Ingrese el numero de pasajeros: ");
        double km = leer.DoubleInput("Ingrese la distancia del viaje en kilometros: ");

        System.out.println("Personas viajando: " + personas);
        System.out.println("Costo por persona: $ " + calcularViaje(tipo, personas, km)/personas);
        System.out.println("Costo total: $ " + calcularViaje(tipo, personas, km));

    }

}
