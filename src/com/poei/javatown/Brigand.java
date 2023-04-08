package com.poei.javatown;

public class Brigand extends Humain {

    private String look = "méchant";
    private int nbDamesEnlevees = 5;
    private int miseAPrix = 100;
    private boolean etat; // false : libre / true : emprisonné

    Brigand(String nom) {
        super(nom, "tord-boyaux");
    }

    Brigand(String nom, String boissonFavorite) {
        super(nom, boissonFavorite);
    }

    public void setMiseAPrix(int miseAPrix) {
        this.miseAPrix = miseAPrix;
    }

    @Override
    public String quelEstTonNom() {
        return super.quelEstTonNom() + " le " + this.look;
    }

    @Override
    public void sePresenter() {
        super.sePresenter();
        this.parler("J'ai l'air " + this.look + " et j'ai déjà kidnappé " + this.nbDamesEnlevees + " dames !");
        this.parler("Ma tête est mise à prix " + this.miseAPrix + "$ !");
    }

    public void kidnapper(Dame dame) {
        this.nbDamesEnlevees ++;
        this.parler("Ah ah ! " + dame.quelEstTonNom() + ", tu es mienne désormais.");
    }

    public void seFaireEmprisonner(Cowboy cowboy) {
        this.etat = true;
        this.parler("Damned, je suis fait ! " + cowboy.quelEstTonNom() + ", tu m'as eu !");
    }

    public int getMiseAPrix() {
        return this.miseAPrix;
    }


}
