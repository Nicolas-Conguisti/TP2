package com.iut.facteursPremiers;

import java.util.ArrayList;

public class FacteursPremiers {

    public static ArrayList<Integer> generate(int nombre){

        ArrayList<Integer> listeFacteurs = new ArrayList<>();

        if(nombre <= 0){
            return listeFacteurs;
        }

        int facteur = 2;

        while(nombre > 1){
            while(nombre % facteur == 0){
                listeFacteurs.add(facteur);
                nombre = nombre / facteur;
            }
            facteur += 1;
        }

        return listeFacteurs;
    }
}
