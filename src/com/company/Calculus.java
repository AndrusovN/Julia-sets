package com.company;

import java.lang.Math;
public class Calculus {
    private final Complex C;
    public Calculus(double cr, double ci){
        C = new Complex(cr, ci);
    }
    public Calculus(Complex C){
        this.C = C;
    }

    private Complex F(Complex V){
        return(V.times(V).add(C));
    }

    public boolean isIn(int maxIter, Complex V){
        double radius = 0.5 + Math.sqrt(1 + 4 * C.abs()) / 2;
        for (int i = 0; i < maxIter; i++){
            if(V.abs() > radius){
                return(false);
            }
            V = F(V);
        }
        return(true);
    }



}
