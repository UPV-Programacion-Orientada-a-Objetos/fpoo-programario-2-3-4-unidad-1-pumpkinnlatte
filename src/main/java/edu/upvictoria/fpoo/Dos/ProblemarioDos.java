package edu.upvictoria.fpoo.Dos;

import edu.upvictoria.fpoo.Input;
import edu.upvictoria.fpoo.Main;

import java.io.IOException;

public class ProblemarioDos {

    public ProblemarioDos() throws IOException {

        Input leer = new Input();
        boolean terminar = false;

        while (terminar == false){

            System.out.println("\n---------------- PROGRAMARIO 2 ----------------\n" );
            System.out.println("Ingrese el número de la práctica (1-25) (0) Salir\n" );

            int opc = leer.IntInput("");

            switch (opc){
                case 0:
                    terminar = true;
                    Main m = new Main();
                    break;
                case 1:
                    ProblemaUno p1 = new ProblemaUno();
                    break;
                case 2:
                    ProblemaDos p2 = new ProblemaDos();
                    break;
                case 3:
                    ProblemaTres p3 = new ProblemaTres();
                    break;
                case 4:
                    ProblemaCuatro p4 = new ProblemaCuatro();
                    break;
                case 5:
                    ProblemaCinco p5 = new ProblemaCinco();
                    break;
                case 6:
                    ProblemaSeis p6 = new ProblemaSeis();
                    break;
                case 7:
                    ProblemaSiete p7 = new ProblemaSiete();
                    break;
                default:
                    break;
            }
        }
    }
}
