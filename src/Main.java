import model.*;

public class Main {
    public static void main(String[] args) {
        /*
        Fibonacci algo = new Fibonacci(80);

        //algo.afficherSuite();;

        algo.getValeurWithIndex(50);

        algo.getValeur(4182L);

        algo.getValeur(832040L);

        algo.getValeurWithIndex(40);

        System.out.println("Nombre d'impairs dans la liste : " + algo.compteImpairs());
        System.out.println("Nombre de pairs dans la liste : " + algo.comptePairs());

        System.out.println("F(i) < 1000000 = F(" + algo.plusGrandeValeur(1000000) + ")");

        algo.getValeur(12586269025L);

        algo.suiteAleatoire();

        algo.getValeur(12586269025L);

        algo.sortSuite();

        algo.getValeur(12586269025L);
         */
        /*
        Promo promo = new Promo(2025);
        Etudiant etu = new Etudiant("Victor");
        Etudiant etu2 = new Etudiant("Damien");

        Matiere java = new Matiere("Java", 3);
        Matiere cpp = new Matiere("C++", 2);

        etu2.ajouterNote(java, 17);
        etu2.ajouterNote(java, 13);
        etu2.ajouterNote(java, 7);

        etu2.ajouterNote(cpp, 18);
        etu2.ajouterNote(cpp, 9);
        etu2.ajouterNote(cpp, 14);

        etu.ajouterNote(java, 11);
        etu.ajouterNote(java, 8);
        etu.ajouterNote(java, 10);

        etu.ajouterNote(cpp, 8);
        etu.ajouterNote(cpp, 10);
        etu.ajouterNote(cpp, 16);

        promo.ajouterMatiere(java);
        promo.ajouterMatiere(cpp);
        promo.ajouterEtudiant(etu);
        promo.ajouterEtudiant(etu2);

        System.out.printf("Moyenne général pour l'etu : %.2f \n", etu.moyenneGenerale());


        System.out.printf("Moyenne en Java : %.2f \n", etu.moyenneParMatiere(java));
        System.out.printf("Moyenne en C++ : %.2f \n", etu.moyenneParMatiere(cpp));
        System.out.printf("Moyenne générale : %.2f \n", etu.moyenneGenerale());
        System.out.println("Moyenne générale de la promo : " + promo.moyenneGeneralePromo());
        System.out.println("Moyenne génrale par matière \nJava : " + promo.moyenneParMatiere(java) + "\nC++ : " + promo.moyenneParMatiere(cpp));
        System.out.println("Pire note de la promo en Java : " + promo.pireNote(java));
        System.out.println("Pire note de la promo en C++ : " + promo.pireNote(cpp));
        System.out.println("Meilleure note de la promo en Java : " + promo.meilleureNote(java));
        System.out.println("Meilleure note de la promo en C++ : " + promo.meilleureNote(cpp));
        promo.afficherClassement();
        */

        MesJeux jeux = new MesJeux();
        jeux.addJeu("Elden Ring", 16);
        jeux.addJeu("WRC", 3);
        jeux.addJeu("Elden Ring", 16);

        System.out.println("Nombre de jeux : " + jeux.size());

        jeux.removeJeu("WRC");
        System.out.println("Après suppression, nombre de jeux : " + jeux.size());

    }
}