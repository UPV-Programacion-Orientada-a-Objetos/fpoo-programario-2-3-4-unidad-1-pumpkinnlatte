package edu.upvictoria.fpoo.Tres;

import edu.upvictoria.fpoo.Input;
import edu.upvictoria.fpoo.Mates.Comparacion;

import java.io.IOException;

public class ProblemaVeintidos {

    public double sumaRepite() throws IOException{
        Input leer = new Input();
        double suma = 0;

        for (int i = 0; i < 10; i++) {
            suma = suma + leer.DoubleInput("Ingresa el numero " + i + ":");
        }
        return suma;
    }

    public double sumaDesde() throws IOException{
        Input leer = new Input();
        double suma = 0;
        int contador = 1;
        do {
            suma += leer.DoubleInput("Ingresa el numero " + contador + ":");
            contador++;
        } while (contador != 10);
        return suma;
    }

    public ProblemaVeintidos() throws IOException {

        System.out.println("Problema 22");
        System.out.println("Suma 10 numeros flotantes - Repite y Desde");

        Input leer = new Input();
        Comparacion c = new Comparacion();
        System.out.println("\n1.Ciclo Repite\n2.Ciclo Desde");

        switch (leer.IntInput("Ingresa una opción: ")){
            case 1:
                sumaRepite();
                break;
            case 2:
                sumaDesde();
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }
}
