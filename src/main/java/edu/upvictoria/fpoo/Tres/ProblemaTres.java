package edu.upvictoria.fpoo.Tres;

public class ProblemaTres {

    public double sumar () {
        double sum = 0;

        for (int i = 0; i < 10; i++) {
            sum = sum + i;
        }

        return sum;
    }

    public ProblemaTres () {
        System.out.println("La suma es de: " + sumar());
    }

    public ProblemaTres (boolean test) {}

}
