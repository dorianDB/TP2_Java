package model;

import java.util.ArrayList;

public class ListeDeNotes {

    private ArrayList<Float> notes;

    public ListeDeNotes(){
        notes = new ArrayList<>();
    }

    public void ajouterNote(float note){
        if(note<0 || note>20){
            throw new IllegalArgumentException("Une note doit être comprise entre 0 et 20.");
        }
        notes.add(note);
    }

    public float moyenne() {
        if (notes.isEmpty()){
            System.out.println("La liste de note est vide.");
            return 0;
        }
        float somme = 0;
        for (float note : notes) {
            somme += note;
        }
        return somme / notes.size();
    }

    public ArrayList<Float> getNotes() {
        return notes;
    }
}
