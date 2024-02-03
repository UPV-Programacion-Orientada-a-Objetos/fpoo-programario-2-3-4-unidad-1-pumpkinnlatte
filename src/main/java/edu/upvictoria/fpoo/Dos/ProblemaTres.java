package edu.upvictoria.fpoo.Dos;
import edu.upvictoria.fpoo.Input;
import java.io.IOException;

public class ProblemaTres {
    public double cobrarLapices(int lapices){
        lapices = Math.abs(lapices);
        if(lapices >= 1000){
            return lapices * 3.65;
        }
        return lapices * 4.83;
    }

    public ProblemaTres(boolean test) {

    }

    public ProblemaTres() throws IOException{

        System.out.println("Problema 3");
        System.out.println("Compra de Lápices");
        Input leer = new Input();
        int lapices= leer.IntInput("Ingrese el número de lapices requerridos: ");

        System.out.println("El precio por " + lapices + " es de $ " + cobrarLapices(lapices));

    }

}
