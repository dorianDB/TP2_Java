package model;

import java.util.HashMap;

public class Etudiant {

    private String nom;
    private HashMap<Matiere, ListeDeNotes> notesParMatiere;

    public Etudiant(String nom) {
        this.nom = nom;
        this.notesParMatiere = new HashMap<>();
    }

    public void ajouterNote(Matiere matiere, float note) {
        notesParMatiere.computeIfAbsent(matiere, m -> new ListeDeNotes()).ajouterNote(note);
    }

    public float moyenneParMatiere(Matiere matiere) {
        ListeDeNotes ldn = notesParMatiere.get(matiere);
        if (ldn != null) {
            return ldn.moyenne();
        } else {
            return 0;
        }
    }

    public float moyenneGenerale() {
        float total = 0;
        int sommeCoeffs = 0;
        for (Matiere m : notesParMatiere.keySet()) {
            float moyenne = moyenneParMatiere(m);
            total += moyenne * m.getCoeff();
            sommeCoeffs += m.getCoeff();
        }

        if (sommeCoeffs == 0) {
            return 0;
        } else {
            return total / sommeCoeffs;
        }
    }

    public HashMap<Matiere, ListeDeNotes> getNotesParMatiere() {
        return notesParMatiere;
    }

    public String getNom() {
        return nom;
    }
}
