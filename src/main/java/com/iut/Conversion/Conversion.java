package com.iut.Conversion;

public class Conversion {

    public static String convertir(int nombreArabe){

        String nombreRomain = "";

        while(nombreArabe > 0){
            nombreArabe -= 1;
            nombreRomain += "I";
        }

        return nombreRomain;
    }
}
