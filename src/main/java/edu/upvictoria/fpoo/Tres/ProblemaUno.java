package edu.upvictoria.fpoo.Tres;

public class ProblemaUno {

    public double sumar() {
        double sum = 0;
        int i = 0;

        while (i < 10) {
            sum = sum + i;
            i++;
        }

        return sum;
    }

    public ProblemaUno () {
        System.out.println("El resultado de la suma es: " + sumar());
    }

    public ProblemaUno (boolean test) {}

}
