package com.poei.javatown;

public class Util {

    public static boolean estVoyelle(char lettre) {
        char[] voyelles = new char[] {'a', 'e', 'i', 'o', 'u', 'y'};
        boolean estVoyelle = false;
        for (char voyelle : voyelles) {
            if (voyelle == lettre) {
                estVoyelle = true;
                break;
            }
        }
        return estVoyelle;
    }
}
