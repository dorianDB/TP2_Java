package model;

import java.util.*;
public class Promo {
    private int annee;
    private List<Matiere> matieres;
    private List<Etudiant> etudiants;
    public Promo(int annee) {
        this.annee = annee;
        this.matieres = new ArrayList<>();
        this.etudiants = new ArrayList<>();
    }
    public void ajouterMatiere(Matiere matiere) {
        matieres.add(matiere);
    }
    public void ajouterEtudiant(Etudiant etudiant) {
        etudiants.add(etudiant);
    }
    public float moyenneGeneralePromo() {
        if (etudiants.isEmpty()) return 0;
        float somme = 0;
        for (Etudiant e : etudiants) {
            somme += e.moyenneGenerale();
        }
        return somme / etudiants.size();
    }
    public float moyenneParMatiere(Matiere matiere) {
        float somme = 0;
        int count = 0;
        for (Etudiant e : etudiants) {
            somme += e.moyenneParMatiere(matiere);
            count++;
        }
        if(count == 0){
            return 0;
        } else {
            return somme / count;
        }
    }
    public float meilleureNote(Matiere matiere) {
        float max = Float.MIN_VALUE;
        for (Etudiant e : etudiants) {
            ListeDeNotes ldn = e.getNotesParMatiere().get(matiere);
            if (ldn != null) {
                for (Float note : ldn.getNotes()) {
                    if (note > max) max = note;
                }
            }
        }
        return max;
    }
    public float pireNote(Matiere matiere) {
        float min = Float.MAX_VALUE;
        for (Etudiant e : etudiants) {
            ListeDeNotes ldn = e.getNotesParMatiere().get(matiere);
            if (ldn != null) {
                for (Float note : ldn.getNotes()) {
                    if (note < min) min = note;
                }
            }
        }
        return min;
    }
    public List<Etudiant> classementParMoyenne() {
        List<Etudiant> classement = new ArrayList<>(etudiants);
        classement.sort((a, b) -> Float.compare(b.moyenneGenerale(), a.moyenneGenerale()));
        return classement;
    }
    public void afficherClassement() {
        List<Etudiant> classement = classementParMoyenne();
        System.out.println("Classement des étudiants par moyenne générale :");
        int rang = 1;
        for (Etudiant e : classement) {
            System.out.printf("%d. %s - %.2f\n", rang++, e.getNom(), e.moyenneGenerale());
        }
    }
}