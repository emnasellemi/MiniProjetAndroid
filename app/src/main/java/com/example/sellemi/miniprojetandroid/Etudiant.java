package com.example.sellemi.miniprojetandroid;

/**
 * Created by sellemi on 11/13/2016.
 */

public class Etudiant {
    String nom;
    String prenom;

    public Etudiant(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return
                 nom + " " +
                  prenom
                ;
    }
}
