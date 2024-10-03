package com.iut.personnage;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonnageTest {

    /*
    LISTE DES TESTS
    - Si on tourne 0 fois : orientation = NORD
    - Si on tourne 1 fois : orientation = EST
    - Si on tourne 2 fois : orientation = SUD
    - Si on tourne 3 fois : orientation = OUEST
    - Si on tourne 4 fois : orientation = NORD
    - Si on tourne 5 fois : orientation = EST
     */


    @Test
    void tourner_0fois_orientation_estNord() {

        //GIVEN
        Personnage john = new Personnage();

        //WHEN
        john.tourner(0);

        //THEN
        assertEquals("NORD", john.orientation);
    }

        @Test
        void tourner_1fois_orientation_estEST() {

            //GIVEN
            Personnage david = new Personnage();

            //WHEN
            david.tourner(1);

            //THEN
            assertEquals("EST", david.orientation);

    }
}