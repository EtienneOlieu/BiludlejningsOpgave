package com.company;

public class Main {

    public static void main(String[] args) {

        Garage garage = new Garage();

    BenzinBil benzinBil = new BenzinBil("EQ1234","Suzuki","Ignis",2004,5,95,21.7);
    DieselBil dieselBil = new DieselBil("AK4721","Citroën","B2",1921,5,false,8);
    ElBil elBil = new ElBil("GOGREEN","!Tesla","Ohmster",2243,3,600,2000,200);

        System.out.println(benzinBil);
        System.out.println("Den grønne ejerafgift for køretøjet er: "+benzinBil.beregnGrønEjerafgift()+" dkr.");
        System.out.println(dieselBil);
        System.out.println("Den grønne ejerafgift for køretøjet er: "+dieselBil.beregnGrønEjerafgift()+" dkr.");
        System.out.println(elBil);
        System.out.println("Den grønne ejerafgift for køretøjet er: "+elBil.beregnGrønEjerafgift()+" dkr.");

        garage.tilføjBiler(benzinBil);
        garage.tilføjBiler(dieselBil);
        garage.tilføjBiler(elBil);

        System.out.println(garage);

    }
}
