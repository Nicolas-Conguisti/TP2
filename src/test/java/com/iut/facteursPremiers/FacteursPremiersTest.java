package com.iut.facteursPremiers;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FacteursPremiersTest {

    /*
    LISTE DES TESTS
    - Si le nombre est égal à 2 -> retourne 2
    - Si le nombre est égal à 3 -> retourne 3
    - Si le nombre est égal à 6 -> retourne 2, 3
    - Si le nombre est égal à 8 -> retourne 2, 2, 2
    - Si le nombre est égal à 12 -> retourne 2, 2, 3
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

    @Test
    void generate_avec3_retourne_3() {

        //GIVEN
        int nombre = 3;

        ArrayList<Integer> nesultatNormal = new ArrayList<>();
        nesultatNormal.add(3);

        //WHEN
        ArrayList<Integer> resultat = FacteursPremiers.generate(nombre);

        //THEN
        assertEquals(resultat, nesultatNormal);

    }

    @Test
    void generate_avec0_retourne_null() {

        //GIVEN
        int nombre = 0;

        ArrayList<Integer> nesultatNormal = new ArrayList<>();

        //WHEN
        ArrayList<Integer> resultat = FacteursPremiers.generate(nombre);

        //THEN
        assertEquals(resultat, nesultatNormal);

    }
}