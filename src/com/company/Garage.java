package com.company;

import java.util.ArrayList;

public class Garage {
    ArrayList<Bil> biler = new ArrayList<>();
    public void tilføjBiler (Bil bil){
        biler.add(bil);
    }

    public double beregnGrønEjerafgift(){
        double grønejerAfgift = 0;
        for (Bil b: biler ){
            grønejerAfgift += b.beregnGrønEjerafgift();
        }
        return grønejerAfgift;
    }

    @Override
    public String toString (){
        String bilerIGaragen = "\n";
        for (Bil b:biler) {
            bilerIGaragen += b+"\n\n";
        }
        return "Følgende biler er parkeret i garagen: " + bilerIGaragen + "Den samlede grønneejerafgift er " + beregnGrønEjerafgift();
    }
}
