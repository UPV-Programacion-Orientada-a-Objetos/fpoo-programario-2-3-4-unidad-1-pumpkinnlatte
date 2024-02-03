package edu.upvictoria.fpoo.Tres;

import edu.upvictoria.fpoo.Input;
import edu.upvictoria.fpoo.Mates.Comparacion;

import java.io.IOException;

public class ProblemaVeinte {

    public void contador(int n) throws IOException {
        Input leer = new Input();
        int verde = 0, rojo = 0, blanco = 0;

        for (int i = 0; i < n; i++) {
            double num = leer.DoubleInput("1.Verde\n2.Blanco\n3.Rojo\nIngresa el color del foco:");
            if(num == 1){
                verde++;
            }

            if(num == 2){
                blanco++;
            } else {
                rojo++;
            }

        }

        System.out.println("Hay : " + verde + "focos verdes");
        System.out.println("Hay : " + blanco + "focos blanco");
        System.out.println("Hay : " + rojo + "focos verdes");

    }

    public ProblemaVeinte() throws IOException {

        System.out.println("Problema 20");
        System.out.println("Positivo o Negativo");

        Input leer = new Input();
        Comparacion c = new Comparacion();
        double num = leer.DoubleInput("Ingresa el número de focos a distinguir: ");



    }

}
