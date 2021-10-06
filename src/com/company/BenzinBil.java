package com.company;

public class BenzinBil extends Bil{
    private int oktantal;
    private double kmPrL;

    public BenzinBil (String regnr, String mærke, String model, int årgang, int antaldøre, int oktantal, double kmPrL){
        super(regnr,mærke,model,årgang,antaldøre);
        this.oktantal = oktantal;
        this.kmPrL = kmPrL;
    }

    public int getOktantal() {
        return oktantal;
    }

    public void setOktantal(int oktantal) {
        this.oktantal = oktantal;
    }

    public double getKmPrL() {
        return kmPrL;
    }

    public void setKmPrL(int kmPrL) {
        this.kmPrL = kmPrL;
    }
    public String toString(){
        return "Benzinbil " + super.toString() + "Oktantallet er: " + oktantal + " og kmPrl: " + kmPrL+".";
    }

    @Override
    public double beregnGrønEjerafgift() {
        double grønEjerAfgift = 0;
        if (kmPrL > 20 && kmPrL <= 50){
            grønEjerAfgift = 330;
        }
        else if (kmPrL > 15 && kmPrL <= 20){
            grønEjerAfgift = 1050;
        }
        else if (kmPrL > 10 && kmPrL <= 15){
            grønEjerAfgift = 2340;
        }
        else if (kmPrL > 5 && kmPrL <= 10){
            grønEjerAfgift = 5500;
        }
        else if (kmPrL > 0 && kmPrL <=5)
            grønEjerAfgift = 10470;

        return grønEjerAfgift;
    }
}
