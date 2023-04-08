package com.poei.javatown;

public class Barman extends Humain {

    String nomBar;
    String finPhrase = "Coco";

    Barman(String nom) {
        super(nom, "vin");
        this.nomBar = "Chez " + nom;
    }

    Barman(String nom, String nomBar) {
        super(nom, "vin");
        this.nomBar = nomBar;
    }

    @Override
    public String quelEstTonNom() {
        return super.quelEstTonNom() + " le barman";
    }

    @Override
    public void sePresenter() {
        boolean estVoyelle = Util.estVoyelle(super.getBoissonFavorite().charAt(0));
        this.parler("Bonjour, je suis " + this.quelEstTonNom() + " et j'aime l" + (estVoyelle ? "'" : "e ") + super.getBoissonFavorite() + ", " + this.finPhrase + ".");
        this.parler("Je dirige le bar " + this.nomBar + ", " + this.finPhrase + ".");
    }
}
