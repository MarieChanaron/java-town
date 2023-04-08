package com.poei.javatown;

public class Ripoux extends Sherif implements HorsLaLoi {

    private int nbDamesEnlevees;
    private int miseAPrix = 100;
    private boolean etat = false; // false : libre / true : emprisonné


    Ripoux(String nom, int popularite, int nbBrigandsCoffres, int nbDamesEnlevees) {
        super(nom, popularite, nbBrigandsCoffres);
        this.nbDamesEnlevees = nbDamesEnlevees;
    }

    @Override
    public void seFaireEmprisonner(Sherif sherif) {
        this.etat = true;
        this.parler("Damned, je suis fait ! " + sherif.quelEstTonNom() + ", tu m'as eu !");
    }

    @Override
    public void kidnapper(Dame dame) {
        this.nbDamesEnlevees ++;
        this.parler("Ah ah ! " + dame.quelEstTonNom() + ", tu es mienne désormais.");
    }

    @Override
    public int getMiseAPrix() {
        return this.miseAPrix;
    }

    @Override
    public void setMiseAPrix(int miseAPrix) {
        this.miseAPrix = miseAPrix;
    }

    @Override
    public String quelEstTonNom() {
        return super.quelEstTonNom() + " le ripoux";
    }

    @Override
    public void sePresenter() {
        boolean voyelle = Util.estVoyelle(super.getBoissonFavorite().charAt(0));
        this.parler("Bonjour, je suis " + this.quelEstTonNom() + " et j'aime l" + (voyelle ? "'" : "e ") + super.getBoissonFavorite() + ".");
        this.parler("J'ai coffré " + super.getNbBrigandsCoffres() + " brigands et libéré " + super.popularite + " dames.");
    }
}
