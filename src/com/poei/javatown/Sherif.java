package com.poei.javatown;

public class Sherif extends Cowboy {

    private int nbBrigandsCoffres = 6;

    Sherif(String nom, int popularite, int nbBrigandsCoffres) {
        super(nom, popularite);
        super.caracteristique = "honnête";
        this.nbBrigandsCoffres = nbBrigandsCoffres;
    }

    public void coffrer(Brigand brigand) {
        this.parler("Au nom de la loi, je vous arrête !");
    }

    public void rechercher(Brigand brigand) {
        System.out.println(this.quelEstTonNom() + " placarde une affiche dans toute la ville.");
        brigand.setMiseAPrix(brigand.getMiseAPrix() * 2);
        this.parler("OYEZ OYEZ BRAVES GENS !! " + brigand.getMiseAPrix() + "$ à qui arrêtera " + brigand.quelEstTonNom() + ", mort ou vif !!");
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
        this.parler("J'ai coffré " + this.nbBrigandsCoffres + " brigands et libéré " + super.popularite + " dames.");
    }

}
