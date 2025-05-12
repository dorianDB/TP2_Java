package model;

import java.util.HashSet;

public class MesJeux {
    HashSet<JeuPS5> mesjeux;

    public MesJeux() {
        mesjeux = new HashSet<>();
    }

    public void addJeu(JeuPS5 jeu) {
        mesjeux.add(jeu);
    }

    public void addJeu(String titre, int pegi) {
        mesjeux.add(new JeuPS5(titre, pegi));
    }

    public boolean removeJeu(JeuPS5 jeu) {
        return mesjeux.remove(jeu);
    }

    public boolean removeJeu(String titre) {
        return mesjeux.removeIf(j -> j.getTitre().equalsIgnoreCase(titre));
    }

    public int size() {
        return mesjeux.size();
    }
}