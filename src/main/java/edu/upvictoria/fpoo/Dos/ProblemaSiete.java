package edu.upvictoria.fpoo.Dos;

import edu.upvictoria.fpoo.Input;
import edu.upvictoria.fpoo.Mates.Descuentos;

import java.io.IOException;
import java.util.Objects;

public class ProblemaSiete {

    public double calcularGanancia(String tipo, int tamano, double precio, double cantidad){

        double tInicial = precio * cantidad;
        tInicial = Math.abs(tInicial);

        if(Objects.equals(tipo.toLowerCase(), "a")){
            if(tamano == 1){
                precio += 20;
            } else {
                precio +=30;
            }
        }

        if(Objects.equals(tipo.toLowerCase(), "b")){
            if(tamano == 1){
                precio -= 30;
            } else {
                precio -=50;
            }
        }

        return tInicial - (precio * cantidad);
    }

    public ProblemaSiete(boolean test){}

    public ProblemaSiete() throws IOException {

        System.out.println("Problema 7");
        System.out.println("Embarque de Uvas");

        Input leer = new Input();
        Descuentos desc = new Descuentos();

        double uvas = leer.DoubleInput("Ingresa el precio del kilo de uva: ");
        double cantidad = leer.DoubleInput("Ingresa la cantidad de kilos: ");
        String tipo = leer.StringInput("Ingresa el tipo de uva (a-b):");
        int tamano = leer.IntInput("Ingresa el tamaño de uva (1-2): ");

        System.out.println("Costo del pedido: $ " + uvas * cantidad);
        System.out.println("Costo ajustado al tipo y tamaño: $ " + (((uvas * cantidad) - calcularGanancia(tipo, tamano, uvas, cantidad))));
        System.out.println("Ganancia : " + calcularGanancia(tipo, tamano, uvas, cantidad));

    }

}
