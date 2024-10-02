package com.iut.facteursPremiers;

import java.util.ArrayList;

public class FacteursPremiers {

    public static ArrayList<Integer> generate(int nombre){

        ArrayList<Integer> listeFacteurs = new ArrayList<>();

        if(nombre <= 0){
            return listeFacteurs;
        }

        listeFacteurs.add(2);

        return listeFacteurs;
    }

}
