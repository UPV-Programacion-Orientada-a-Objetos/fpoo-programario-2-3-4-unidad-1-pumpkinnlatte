package edu.upvictoria.fpoo.Mates;

public class Comparacion {

    public boolean esMayorQue(double a, double b){
        if(a > b){
            return true;
        }
        return false;
    }

    public double Mayor(double a, double b){
        if(a > b){
            return a;
        }
        return b;
    }
    public double Mayor(double a, double b, double c){
        if(a > b && a > c){
            return a;
        }

        if(c > b){
            return c;
        }

        return b;
    }

    public boolean esNegativo(double numero){
        if(numero > 0){
            return false;
        }
        return true;
    }

    public boolean esPositivo(double numero){
        if(numero > 0){
            return true;
        }
        return false;
    }

    public Comparacion(){

    }



}
