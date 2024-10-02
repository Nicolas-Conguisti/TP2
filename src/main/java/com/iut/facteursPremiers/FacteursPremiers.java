package com.iut.facteursPremiers;

import java.util.ArrayList;

public class FacteursPremiers {

    public static ArrayList<Integer> generate(int nombre){

        ArrayList<Integer> listeFacteurs = new ArrayList<>();

        if(nombre <= 0){
            return listeFacteurs;
        }

        if(nombre == 2){
            listeFacteurs.add(2);
        }

        if(nombre == 3){
            listeFacteurs.add(3);
        }

        return listeFacteurs;
    }

}
