package model;

public class JeuPS5 {
    private String titre;
    private int pegi;

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        if(titre == null || titre.isEmpty()){
            throw new IllegalArgumentException("Le titre ne peut pas être vide ou null");
        }
        this.titre = titre;
    }

    public int getPegi() {
        return pegi;
    }

    public void setPegi(int pegi) {
        if(pegi < 3 || pegi > 18){
            throw new IllegalArgumentException("Le Pegi doit être compris entre 3 et 18");
        }
        this.pegi = pegi;
    }
    public JeuPS5(String titre, int pegi) {
        setTitre(titre);
        setPegi(pegi);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        JeuPS5 jeu = (JeuPS5) obj;
        return titre.equalsIgnoreCase(jeu.titre);
    }

    @Override
    public int hashCode() {
        return titre.toLowerCase().hashCode();
    }
}
