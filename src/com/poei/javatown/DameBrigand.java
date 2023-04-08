package com.poei.javatown;

public class DameBrigand extends Dame implements HorsLaLoi {

    private String look = "méchante";
    private int nbDamesEnlevees;
    private int miseAPrix = 100;
    private boolean etat = false; // false : libre / true : emprisonné


    DameBrigand(String nom, int nbDamesEnlevees) {
        super(nom, "lait");
        super.setCouleurRobe("verte");
        this.nbDamesEnlevees = nbDamesEnlevees;
    }

    DameBrigand(String nom, String boissonFavorite, int nbDamesEnlevees) {
        super(nom, boissonFavorite);
        super.setCouleurRobe("verte");
        this.nbDamesEnlevees = nbDamesEnlevees;
    }

    @Override
    public void seFaireEmprisonner(Sherif sherif) {
        this.etat = true;
        this.parler("Damned, je suis faite ! " + sherif.quelEstTonNom() + ", tu m'as eue !");
    }

    @Override
    public void kidnapper(Dame dame) {
        if (dame.getEtat()) {
            this.nbDamesEnlevees++;
            this.parler("Ah ah ! " + dame.quelEstTonNom() + ", la bourse ou la vie !");
        }
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
        return super.quelEstTonNom();
    }

}
