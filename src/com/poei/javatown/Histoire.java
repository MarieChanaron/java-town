package com.poei.javatown;

public class Histoire {

    public static void main(String[] args) {

        Barman john = new Barman("John");
        john.sePresenter();
        john.boire();

        Humain michael = new Humain("Michael");
        michael.sePresenter();

        Dame kate = new Dame("Kate");
        kate.sePresenter();
        kate.boire();

        Brigand bob = new Brigand("Bob", 5);
        bob.sePresenter();
        bob.boire();

        Cowboy luckyluke = new Cowboy("Lucky Luke", 8);
        luckyluke.sePresenter();
        luckyluke.boire();

        bob.kidnapper(kate);
        kate.seFaireKidnapper(bob);
        luckyluke.tirer(bob);
        luckyluke.sexclamer(bob);
        luckyluke.liberer(kate);
        kate.etreLiberee(luckyluke);

        Sherif clint = new Sherif("Clint", 9, 6);
        clint.sePresenter();
        clint.rechercher(bob);

        Ripoux bill = new Ripoux("Bill", 2, 1, 6);
        bill.sePresenter();

        DameBrigand calamityJane = new DameBrigand("Calamity Jane", 3);
        calamityJane.sePresenter();
        calamityJane.kidnapper(kate);
        kate.seFaireKidnapper(calamityJane);
        System.out.println(calamityJane.quelEstTonNom() + " change de robe.");
        calamityJane.changerRobe("bleue");
        clint.rechercher(calamityJane);
        luckyluke.tirer(calamityJane);
        clint.coffrer(calamityJane);
        calamityJane.seFaireEmprisonner(clint);

        Indien teaSpoon = new Indien("Tea Spoon", 100);
        teaSpoon.sePresenter();
        teaSpoon.scalper(bill);
        bill.seFaireScalper(teaSpoon);


    }
}
