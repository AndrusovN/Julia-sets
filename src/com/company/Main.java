package com.company;
import java.lang.Math;

public class Main {
    public static void main(String[] args) throws Exception {
        int W = 1920;
        int H = 1080;
        int a = 3;
        int b = 3;
        for (double i = -1; i < 1; i += 0.1){
            for (double j = -1; j < 1; j += 0.1){
                MainDraw.Draw(W, H, a, b, new Complex(i, j), "Images\\JuliaSet_" + String.valueOf((int)Math.round(i*10)) + "_" + String.valueOf((int)Math.round(j*10)));
            }
        }
        
        //String cr_str = myObj.nextLine();
        //double Cr = Double.parseDouble(cr_str);
        //String ci_str = myObj.nextLine();
        //double Ci = Double.parseDouble(ci_str);
        System.out.println("Done!");
    }
}