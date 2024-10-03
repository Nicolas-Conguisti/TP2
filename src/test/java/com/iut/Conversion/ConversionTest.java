package com.iut.Conversion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConversionTest {

    /*
    LISTE DES TESTS
    - Si on converti 1 : resultat = 'I'
    - Si on converti 2 : resultat = 'II'
    - Si on converti 3 : resultat = 'III'
    - Si on converti 8 : resultat = 'IIIIIIII' -> faux mais cela aide à savoir si le code est correct
    - Si on converti 5 : resultat = 'V'
    - Si on converti 6 : resultat = 'VI'
    - Si on converti 10 : resultat = 'X'
    - Si on converti 11 : resultat = 'XI'
    - Si on converti 50 : resultat = 'L'

    - Si on converti 11 : resultat = 'XI'
    - Si on converti 4 : resultat = 'IV'
    - Si on converti 9 : resultat = 'IX'
    - Si on converti 49 : resultat = 'IL'
     */

    @Test
    void convertir_1_renvoie_I() {

        //GIVEN
        int nombreArabe = 1;
        String resultat;

        //WHEN
        resultat = Conversion.convertir(nombreArabe);

        //THEN
        assertEquals("I", resultat);

    }

    @Test
    void convertir_2_renvoie_II() {

        //GIVEN
        int nombreArabe = 2;
        String resultat;

        //WHEN
        resultat = Conversion.convertir(nombreArabe);

        //THEN
        assertEquals("II", resultat);

    }

    @Test
    void convertir_3_renvoie_III() {

        //GIVEN
        int nombreArabe = 3;
        String resultat;

        //WHEN
        resultat = Conversion.convertir(nombreArabe);

        //THEN
        assertEquals("III", resultat);

    }

    @Test
    void convertir_5_renvoie_V() {

        //GIVEN
        int nombreArabe = 5;
        String resultat;

        //WHEN
        resultat = Conversion.convertir(nombreArabe);

        //THEN
        assertEquals("V", resultat);

    }

    @Test
    void convertir_6_renvoie_VI() {

        //GIVEN
        int nombreArabe = 6;
        String resultat;

        //WHEN
        resultat = Conversion.convertir(nombreArabe);

        //THEN
        assertEquals("VI", resultat);

    }

    @Test
    void convertir_10_renvoie_X() {

        //GIVEN
        int nombreArabe = 10;
        String resultat;

        //WHEN
        resultat = Conversion.convertir(nombreArabe);

        //THEN
        assertEquals("X", resultat);

    }

    @Test
    void convertir_11_renvoie_XI() {

        //GIVEN
        int nombreArabe = 11;
        String resultat;

        //WHEN
        resultat = Conversion.convertir(nombreArabe);

        //THEN
        assertEquals("XI", resultat);

    }

    @Test
    void convertir_50_renvoie_L() {

        //GIVEN
        int nombreArabe = 50;
        String resultat;

        //WHEN
        resultat = Conversion.convertir(nombreArabe);

        //THEN
        assertEquals("L", resultat);

    }
}