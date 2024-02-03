package edu.upvictoria.fpoo;

import edu.upvictoria.fpoo.Dos.*;
import edu.upvictoria.fpoo.Tres.ProblemarioTres;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{

        Input leer = new Input();
        boolean terminar = false;

        while (terminar == false){

            System.out.println("\n---------------- PROGRAMARIOS ----------------\n" );
            System.out.println("Elige el numero del programario que desea consultar");
            System.out.println("0.Salir\n1.Programario 2\n3.Programario 3\n3.Programario 4\n");

            int opc = leer.IntInput("");

            switch (opc){
                case 0:
                    terminar = true;
                    break;
                case 1:
                    ProblemarioDos prob = new ProblemarioDos();
                    break;
                case 2:
                    ProblemarioTres prob2 = new ProblemarioTres();
                    break;
                default:
                    System.out.println("Opción ingresada no válida");
                    break;
            }

        }

    }
}