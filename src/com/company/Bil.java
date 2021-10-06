package com.company;

public abstract class Bil {
    private String regNr;
    private String mærke;
    private String model;
    private int årgang;
    private int antalDøre;

    public Bil (String regNr, String mærke, String model, int årgang, int antalDøre){
        this.regNr = regNr;
        this.mærke = mærke;
        this.model = model;
        this.årgang = årgang;
        this.antalDøre = antalDøre;
    }

    public String getRegNr() {
        return regNr;
    }

    public void setRegNr(String regNr) {
        this.regNr = regNr;
    }

    public String getMærke() {
        return mærke;
    }

    public void setMærke(String mærke) {
        this.mærke = mærke;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getÅrgang() {
        return årgang;
    }

    public void setÅrgang(int årgang) {
        this.årgang = årgang;
    }

    public int getAntalDøre() {
        return antalDøre;
    }

    public void setAntalDøre(int antalDøre) {
        this.antalDøre = antalDøre;
    }

    public String toString(){
        return "med regnr: " + regNr + ", af mærke: " + mærke + ", og model: " + model + ". Fra år: " + årgang + ". Med "+antalDøre+" døre. + ";
    }

    public abstract double beregnGrønEjerafgift();

}
