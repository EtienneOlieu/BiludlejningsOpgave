package com.company;

public class ElBil extends Bil{
    private int batterikapacitetKWh;
    private double maxKm;
    private double whPrKm;

    public ElBil (String regnr, String mærke, String model, int årgang, int antaldøre, int batterikapacitetKWh, double maxKm, double whPrKm){
        super(regnr, mærke, model, årgang,antaldøre);
        this.batterikapacitetKWh = batterikapacitetKWh;
        this.maxKm = maxKm;
        this.whPrKm = whPrKm;

    }

    public int getBatterikapacitetKWh() {
        return batterikapacitetKWh;
    }

    public void setBatterikapacitetKWh(int batterikapacitetKWh) {
        this.batterikapacitetKWh = batterikapacitetKWh;
    }

    public double getMaxKm() {
        return maxKm;
    }

    public void setMaxKm(int maxKm) {
        this.maxKm = maxKm;
    }

    public double getWhPrKm() {
        return whPrKm;
    }

    public void setWhPrKm(int whPrKm) {
        this.whPrKm = whPrKm;
    }

    public String toString(){
        return "Elbil " + super.toString() + "batterikapacitet på: "+ batterikapacitetKWh+". En rækkevidde på: "+maxKm+ ". elforbrug er "+whPrKm+ " whPrkm.";
    }

    @Override
    public double beregnGrønEjerafgift() {
        double kmPrl = 100/(whPrKm/91.25);


        double grønEjerAfgift = 0;
        if (kmPrl > 20 && kmPrl <= 50){
            grønEjerAfgift = 330;
        }
        else if (kmPrl > 15 && kmPrl <= 20){
            grønEjerAfgift = 1050;
        }
        else if (kmPrl > 10 && kmPrl <= 15){
            grønEjerAfgift = 2340;
        }
        else if (kmPrl > 5 && kmPrl <= 10){
            grønEjerAfgift = 5500;
        }
        else if (kmPrl > 0 && kmPrl <=5)
            grønEjerAfgift = 10470;

        return grønEjerAfgift;
    }

}
