package model;

public class Matiere {

    private String nom;
    private int coeff;

    public String getNom() {
        return nom;
    }

    public int getCoeff() {
        return coeff;
    }

    public Matiere(String nom, int coeff) {
        this.nom = nom;
        this.coeff = coeff;
    }
}
