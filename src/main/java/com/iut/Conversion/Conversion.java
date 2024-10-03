package com.iut.Conversion;

public class Conversion {

    public static String convertir(int nombreArabe){

        String nombreRomain = "";

        if(nombreArabe == 1){
            nombreRomain = "I";
        }

        if(nombreArabe == 2){
            nombreRomain = "II";
        }

        if(nombreArabe == 3){
            nombreRomain = "III";
        }

        return nombreRomain;
    }
}
