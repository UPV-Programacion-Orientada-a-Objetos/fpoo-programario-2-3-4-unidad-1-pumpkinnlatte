package edu.upvictoria.fpoo.Mates;

public class Descuentos {

    public double porcentaje;

    public Descuentos(){

    }

    public Descuentos(double porcentaje){
        this.porcentaje = porcentaje;
    }

    public double descuento(double monto){
        monto = Math.abs(monto);
        if(this.porcentaje > 1){
            this.porcentaje = this.porcentaje / 100;
        }

        return  monto * this.porcentaje;
    }

    public double descuento(double monto, double porcentaje){
        monto = Math.abs(monto);
        porcentaje = Math.abs(porcentaje);
        if(porcentaje > 1){
            porcentaje = porcentaje / 100;
        }

        return  monto * porcentaje;
    }

}
