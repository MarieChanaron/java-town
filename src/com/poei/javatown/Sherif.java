package com.poei.javatown;

public class Sherif extends Cowboy {

    private int nbBrigandsCoffres;

    Sherif(String nom, int popularite, int nbBrigandsCoffres) {
        super(nom, popularite);
        super.caracteristique = "honnête";
        this.nbBrigandsCoffres = nbBrigandsCoffres;
    }

    public void coffrer(HorsLaLoi horsLaLoi) {
        this.parler("Au nom de la loi, je vous arrête !");
    }

    public void rechercher(HorsLaLoi horsLaLoi) {
        System.out.println(this.quelEstTonNom() + " placarde une affiche dans toute la ville.");
        horsLaLoi.setMiseAPrix(horsLaLoi.getMiseAPrix() * 2);
        this.parler("OYEZ OYEZ BRAVES GENS !! " + horsLaLoi.getMiseAPrix() + "$ à qui arrêtera " + horsLaLoi.quelEstTonNom() + ", mort ou vif !!");
    }

    @Override
    public String quelEstTonNom() {
        return "Shérif " + super.quelEstTonNom();
    }

    @Override
    public void sePresenter() {
        boolean voyelle = Util.estVoyelle(super.getBoissonFavorite().charAt(0));
        this.parler("Bonjour, je suis " + this.quelEstTonNom() + " et j'aime l" + (voyelle ? "'" : "e ") + super.getBoissonFavorite() + ".");
        this.parler("Tout le monde s'accorde pour dire que je suis " + super.caracteristique + ".");
        this.parler("J'ai coffré " + this.nbBrigandsCoffres + " brigand" + (this.nbBrigandsCoffres > 1 ? "s" : "") + " et libéré " + super.popularite + " dame" + (super.popularite > 1 ? "s." : "."));
    }

    public int getNbBrigandsCoffres() {
        return this.nbBrigandsCoffres;
    }
}
