package edu.upvictoria.fpoo.Tres;

import edu.upvictoria.fpoo.Input;
import edu.upvictoria.fpoo.Mates.Descuentos;

import java.io.IOException;

public class ProblemaDieciocho {

        public double obtenerTotal(int simple, int d, int triple, int tarjeta) {
            Descuentos desc = new Descuentos();
            double total = (simple * 20) + (d * 25) + (triple * 28);
            if (tarjeta == 1)
                total = desc.descuento(total, 5) + total;
            return total;
        }

        public ProblemaDieciocho () throws IOException {
            Input leer = new Input();
            int simple = leer.IntInput("Dame la cantidad de hamburguesas sencillas");
            int d = leer.IntInput("Dame la cantidad de hamburguesas dobles: ");
            int triple = leer.IntInput("Dame la cantidad de hamburguesas triples: ");

            System.out.println("Su total va a ser de: " + obtenerTotal(simple, d, triple, leer.IntInput("Se va a pagar con tarjeta? 1.Si 2.No")));
        }

}
