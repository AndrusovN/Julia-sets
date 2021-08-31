package com.company;
import java.lang.Math;

public class Complex {
    public static final Complex i = new Complex(0, 1);
    public final double Re;
    public final double Im;
    public Complex(double r, double im){
        Re = r;
        Im = im;
    }

    public double abs(){
        return(Math.sqrt(Re*Re + Im*Im));
    }

    public Complex times(Complex sec){
        return(new Complex(this.Re*sec.Re - this.Im*sec.Im, this.Re*sec.Im+this.Im*sec.Re));
    }

    public Complex add(Complex sec){
        return(new Complex(this.Re+sec.Re,  this.Im+sec.Im));
    }
}
