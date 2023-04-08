package com.poei.javatown;

public class Indien extends Humain {

    String totem = "coyote";
    int nbPlumes;
    String finPhrase = "Ugh";

    Indien(String nom, int nbPlumes) {
        super(nom, "jus de racine");
        this.nbPlumes = nbPlumes;
    }

    Indien(String nom, String boissonFavorite, int nbPlumes) {
        super(nom, boissonFavorite);
        this.nbPlumes = nbPlumes;
    }

    @Override
    public void sePresenter() {
        boolean estVoyelle = Util.estVoyelle(super.getBoissonFavorite().charAt(0));
        this.parler("Bonjour, je suis " + this.quelEstTonNom() + " et j'aime l" + (estVoyelle ? "'" : "e ") + super.getBoissonFavorite() + ", " + this.finPhrase + ".");
        this.parler("Mon totem est le " + this.totem + " et j'ai " + this.nbPlumes + " plume" + (this.nbPlumes > 1 ? "s, " : ", ") + this.finPhrase + ".");
    }

    public void scalper(VisagePale visagepale) {
        this.parler("Ne bouge pas, petit visage pâle, " + this.finPhrase + ".");
        this.nbPlumes ++;
    }
}
