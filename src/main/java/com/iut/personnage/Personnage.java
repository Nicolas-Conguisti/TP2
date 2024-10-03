package com.iut.personnage;

public class Personnage {

    public String orientation = "NORD";

    public void tourner(int fois){

        if(fois == 1){
            this.orientation = "EST";
        }

        if(fois == 2){
            this.orientation = "SUD";
        }

        if(fois == 3){
            this.orientation = "OUEST";
        }

        if(fois == 4){
            this.orientation = "NORD";
        }

    }

}
