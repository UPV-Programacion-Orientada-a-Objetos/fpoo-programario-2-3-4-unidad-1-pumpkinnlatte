package edu.upvictoria.fpoo.Tres;
import edu.upvictoria.fpoo.Input;
import edu.upvictoria.fpoo.Mates.Descuentos;

import java.io.IOException;

public class ProblemaDiecisiete {

    public double obtenerSalario(double salario) {
        Descuentos desc = new Descuentos();
        return desc.descuento(salario, 6) + salario;
    }

    public ProblemaDiecisiete () throws IOException {
        Input leer = new Input();
        double salarioBase = leer.DoubleInput("Dame el salario base: ");
        int anos = leer.IntInput("Dame el numero de años: ");

        for (int i = 0; i < anos; i++) {
            System.out.println("El salario del empleado " + i+1 + " es de: " + salarioBase);
            salarioBase = obtenerSalario(salarioBase);
        }
    }

}
