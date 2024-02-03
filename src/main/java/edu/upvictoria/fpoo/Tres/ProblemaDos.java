package edu.upvictoria.fpoo.Tres;

public class ProblemaDos {

        public float sumar() {
            float sum = 0;
            int i = 0;

            do {
                sum = sum + i;
                i++;
            } while (i < 10);

            return sum;
        }

        public ProblemaDos () {
            System.out.println("La suma es: " + sumar());
        }

        public ProblemaDos (boolean test) {}

}
