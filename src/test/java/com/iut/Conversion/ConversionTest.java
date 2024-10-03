package com.iut.Conversion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConversionTest {

    /*
    LISTE DES TESTS
    - Si on converti 1 : resultat = 'I'
    - Si on converti 2 : resultat = 'II'
    - Si on converti 3 : resultat = 'III'
    - Si on converti 5 : resultat = 'V'
    - Si on converti 6 : resultat = 'VI'
    - Si on converti 10 : resultat = 'X'
    - Si on converti 11 : resultat = 'XI'
    - Si on converti 4 : resultat = 'IV'
    - Si on converti 9 : resultat = 'IX'
    - Si on converti 49 : resultat = 'XXXXIX'
     */

    @Test
    void convertir_1_renvoie_I() {

        //GIVEN
        int nombreArabe = 1;
        String resultat;

        //WHEN
        resultat = Conversion.convertir(1);

        //THEN
        assertEquals("I", resultat);

    }

    @Test
    void convertir_2_renvoie_II() {

        //GIVEN
        int nombreArabe = 1;
        String resultat;

        //WHEN
        resultat = Conversion.convertir(1);

        //THEN
        assertEquals("I", resultat);

    }
}