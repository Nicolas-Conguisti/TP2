package com.iut.Conversion;

public class Conversion {

    public static String convertir(int nombreArabe){

        String nombreRomain = "";

        while(nombreArabe > 0){

            if(nombreArabe >= 50){
                nombreArabe -= 50;
                nombreRomain += "L";
            }

            else if(nombreArabe >= 10){
                nombreArabe -= 10;
                nombreRomain += "X";
            }

            else if(nombreArabe >= 5){
                nombreArabe -= 5;
                nombreRomain += "V";
            }

            else{
                nombreArabe -= 1;
                nombreRomain += "I";
            }

        }

        return nombreRomain;
    }
}
