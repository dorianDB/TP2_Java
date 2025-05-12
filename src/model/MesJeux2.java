package model;

import java.util.HashSet;

public class MesJeux2 extends HashSet<JeuPS5> {

    public boolean addJeu(JeuPS5 jeu) {
        return this.add(jeu);
    }

    public boolean addJeu(String titre, int pegi) {
        return this.add(new JeuPS5(titre, pegi));
    }

    public boolean removeJeu(JeuPS5 jeu) {
        return this.remove(jeu);
    }

    public boolean removeJeu(String titre) {
        return this.removeIf(j -> j.getTitre().equalsIgnoreCase(titre));
    }

    public int size() {
        return super.size();
    }
}