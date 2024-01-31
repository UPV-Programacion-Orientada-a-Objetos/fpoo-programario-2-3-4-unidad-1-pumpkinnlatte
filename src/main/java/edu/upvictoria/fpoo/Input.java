package edu.upvictoria.fpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {

    public Input (){

    }

    public String StringInput(String mensaje) throws IOException {
        System.out.print(mensaje);
        String value = "";
        try {
            BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
            value = inp.readLine();
        } catch (NumberFormatException e) {
            System.out.println("Entrada no válida");
        }
        return value;
    }

    public int IntInput(String mensaje) throws IOException {
        System.out.print(mensaje);
        int value = 0;
        try {
            BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
            value = Integer.parseInt(inp.readLine());
        } catch (NumberFormatException e) {
            System.out.println("Entrada no válida");
        }
        return value;
    }

    public double DoubleInput(String mensaje) throws IOException {
        System.out.print(mensaje);
        double value = 0;
        try {
            BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
            value = Integer.parseInt(inp.readLine());
        } catch (NumberFormatException e) {
            System.out.println("Entrada no válida");
        }
        return value;
    }

}
