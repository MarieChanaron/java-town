package com.poei.javatown;

public class Histoire {

    public static void main(String[] args) {

        Barman john = new Barman("John");
        john.sePresenter();
        john.boire();

        Dame kate = new Dame("Kate");
        kate.sePresenter();
        kate.boire();

        Brigand bob = new Brigand("Bob");
        bob.sePresenter();
        bob.boire();

        Cowboy luckyluke = new Cowboy("Lucky Luke", 8);
        luckyluke.sePresenter();
        luckyluke.boire();

        bob.kidnapper(kate);
        kate.seFaireKidnapper();
        luckyluke.tirer(bob);
        luckyluke.sexclamer();
        luckyluke.liberer(kate);
        kate.etreLiberee(luckyluke);

        Sherif clint = new Sherif("Clint", 9, 6);
        clint.sePresenter();
        clint.rechercher(bob);
    }
}
