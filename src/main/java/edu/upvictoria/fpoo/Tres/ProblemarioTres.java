package edu.upvictoria.fpoo.Tres;

import edu.upvictoria.fpoo.Input;
import edu.upvictoria.fpoo.Main;

import java.io.IOException;

public class ProblemarioTres {

    public ProblemarioTres() throws IOException {

        Input leer = new Input();
        boolean terminar = false;

        while (terminar == false){

            System.out.println("\n---------------- PROGRAMARIO 3 ----------------\n" );
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
                case 8:
                    ProblemaOcho p8 = new ProblemaOcho();
                    break;
                case 9:
                    ProblemaNueve p9 = new ProblemaNueve();
                    break;
                case 10:
                    ProblemaDiez p10 = new ProblemaDiez();
                    break;
                case 11:
                    ProblemaOnce p11 = new ProblemaOnce();
                    break;
                case 13:
                    ProblemaTrece p13 = new ProblemaTrece();
                    break;
                case 19:
                    ProblemaDiecinueve p19 = new ProblemaDiecinueve();
                    break;
                case 20:
                    ProblemaVeinte p20 = new ProblemaVeinte();
                    break;
                case 22:
                    ProblemaVeintidos p22 = new ProblemaVeintidos();
                    break;
                case 23:
                    break;
                case 24:
                    break;
                case 25:
                    break;
                case 26:
                    break;
                case 27:
                    break;
                case 28:
                    break;
                case 29:
                    break;
                case 30:
                    break;
                case 31:
                    break;
                default:
                    System.out.println("Opcion ingresada no válida, intente de nuevo");
                    break;
            }
        }
    }

}
