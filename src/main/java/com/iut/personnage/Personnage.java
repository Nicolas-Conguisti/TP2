package com.iut.personnage;

public class Personnage {

    public String orientation = "NORD";

    public void tourner(int fois){

        if(fois == 1){
            this.orientation = "EST";
        }

    }

}
