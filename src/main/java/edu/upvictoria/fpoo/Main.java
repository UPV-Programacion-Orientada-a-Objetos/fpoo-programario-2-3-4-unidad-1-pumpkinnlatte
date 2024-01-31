package edu.upvictoria.fpoo;

import edu.upvictoria.fpoo.Dos.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{

        Input leer = new Input();
        boolean terminar = false;

        while (terminar == false){

            System.out.println("\n---------------- PROGRAMARIOS ----------------\n" );
            System.out.println("Elige el numero del programario que desea consultar");
            System.out.println("0.Salir\n1.Programario 2\n3.Programario 3\n4.Programario 4\n");

            int opc = leer.IntInput("");

            switch (opc){
                case 0:
                    terminar = true;
                    break;
                case 1:
                    ProblemarioDos prob = new ProblemarioDos();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    break;
            }

        }

    }
}