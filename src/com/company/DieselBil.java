package com.company;

public class DieselBil extends Bil{
    private boolean harPartikelfilter;
    private double kmPrl;

    public DieselBil (String regnr, String mærke, String model, int årgang, int antaldøre, boolean harPartikelfilter, double kmPrl){
        super(regnr, mærke, model, årgang,antaldøre);
        this.harPartikelfilter = harPartikelfilter;
        this.kmPrl = kmPrl;
    }

    public boolean isHarPartikelfilter() {
        return harPartikelfilter;
    }

    public void setHarPartikelfilter(boolean harPartikelfilter) {
        this.harPartikelfilter = harPartikelfilter;
    }

    public double getKmPrl() {
        return kmPrl;
    }

    public void setKmPrl(int kmPrl) {
        this.kmPrl = kmPrl;
    }
    public String toString(){
        return "Dieselbil " + super.toString() + "Partikelfilter? " + harPartikelfilter + ". KmPrl: "+kmPrl+".";
    }
    @Override
    public double beregnGrønEjerafgift() {
        double grønEjerAfgift = 0;
        double udligningsafgift = 0;
        double partikelUdledningsAfgift = 0;

        if (!harPartikelfilter){
            partikelUdledningsAfgift = 1000;
        }

        if (kmPrl > 20 && kmPrl <= 50){
            grønEjerAfgift = 330;
            udligningsafgift = 130;
        }
        else if (kmPrl > 15 && kmPrl <= 20){
            grønEjerAfgift = 1050;
            udligningsafgift = 1390;
        }
        else if (kmPrl > 10 && kmPrl <= 15){
            grønEjerAfgift = 2340;
            udligningsafgift = 1850;
        }
        else if (kmPrl > 5 && kmPrl <= 10){
            grønEjerAfgift = 5500;
            udligningsafgift = 2770;
        }
        else if (kmPrl > 0 && kmPrl <=5)
            grønEjerAfgift = 10470;
            udligningsafgift = 15260;

        return grønEjerAfgift+udligningsafgift+partikelUdledningsAfgift;
    }
}
