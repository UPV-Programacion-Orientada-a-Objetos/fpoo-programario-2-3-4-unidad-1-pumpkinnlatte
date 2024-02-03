package edu.upvictoria.fpoo.Dos;

import edu.upvictoria.fpoo.Input;
import edu.upvictoria.fpoo.Mates.Descuentos;

import java.io.IOException;

public class ProblemaDoce {

    public double precioConsulta(int numCita){

        if (numCita < 4){
            return 200;
        }

        if(numCita < 6){
            return 150;
        }

        if(numCita < 9){
            return 100;
        }

        return 50;

    }

    public double calcularConsulta(int numCita){
        double total = 0;
        for (int i = 1;i<= numCita; i++){
            total += precioConsulta(i);
        }
        return total;
    }

    public  ProblemaDoce(boolean test) {

    }

    public ProblemaDoce() throws IOException {

        System.out.println("Problema 12");
        System.out.println("Consultorio");

        Input leer = new Input();
        Descuentos desc = new Descuentos();

        int numero = leer.IntInput("Ingrese el numero de la cita");


        System.out.println("Costo de la cita: $ " + precioConsulta(numero));
        System.out.println("Monto pagado hasta ahora: " + calcularConsulta(numero));

    }

}
