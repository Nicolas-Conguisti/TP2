package com.iut.facteursPremiers;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FacteursPremiersTest {

    /*
    LISTE DES TESTS
    - Si le nombre est égal à 2 -> retourne 2
    - Si le nombre est égal à 0 -> retourne liste vide
     */

    @Test
    void generate_avec2_retourne2() {

        //GIVEN
        int nombre = 2;

        ArrayList<Integer> nesultatNormal = new ArrayList<>();
        nesultatNormal.add(2);

        //WHEN
        ArrayList<Integer> resultat = FacteursPremiers.generate(nombre);

        //THEN
        assertEquals(resultat, nesultatNormal);

    }
}