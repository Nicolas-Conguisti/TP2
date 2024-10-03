package com.iut.personnage;

public class Personnage {

    public String orientation = "NORD";

    public void tourner(int fois){
        

        switch (fois){

            case 1 :
                this.orientation = "EST";
                break;

            case 2 :
                this.orientation = "SUD";
                break;

            case 3 :
                this.orientation = "OUEST";
                break;

            case 4 :
                this.orientation = "NORD";
                break;
        }

    }

}
