package com.iut.personnage;

public class Personnage {

    public String orientation = "NORD";

    public void tourner(int fois){

        int restenbFois = fois % 4;

        switch (restenbFois){

            case 1 :
                this.orientation = "EST";
                break;

            case 2 :
                this.orientation = "SUD";
                break;

            case 3 :
                this.orientation = "OUEST";
                break;
        }

    }

}
