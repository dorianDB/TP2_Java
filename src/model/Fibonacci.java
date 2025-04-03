package model;

import java.util.ArrayList;
import java.util.Collections;

public class Fibonacci {

    ArrayList<Long> suite = new ArrayList<>();

    public Fibonacci(int n) {
        suite = new ArrayList<>();

        if (n > 0) suite.add(0L);
        if (n > 1) suite.add(1L);

        for (int i = 2; i < n; i++) {
            long next = suite.get(i - 1) + suite.get(i - 2);
            suite.add(next);
        }
    }

    public void suiteAleatoire(){
        Collections.shuffle(suite);
    }

    public void sortSuite(){
        Collections.sort(suite);
    }

    public void afficherSuite() {
        for (int i = 0; i < suite.size(); i++) {
            System.out.println("F(" + i + ") = " + suite.get(i));
        }
    }

    public void getValeurWithIndex(int n){
        System.out.println("F(" + n + ") = " + suite.get(n));
    }

    public void getValeur(long valeur){
        if(suite.contains(valeur)){
            System.out.println("La suite contient bien " + valeur + " à l'index " + suite.indexOf(valeur));
        } else {
            System.out.println("La suite ne contient pas " + valeur);
        }
    }

    public int comptePairs() {
        int count = 0;
        for (Long val : suite) {
            if (val % 2 == 0) count++;
        }
        return count;
    }

    public int compteImpairs() {
        return suite.size() - comptePairs();
    }

    public int plusGrandeValeur(long limite) {
        for (int i = suite.size() - 1; i >= 0; i--) {
            if (suite.get(i) < limite) {
                return i;
            }
        }
        return 0;
    }
}