package com.company;

import java.util.Random;

public class GnomeJardin extends NainJardin implements SuperPouvoir
{
    Random r = new Random() ;

    public GnomeJardin(int solidite, String name){

        super(solidite, name);
    }
    public double sort(){
        return r.nextInt(this.solidite);

    }
    public int subitCharme(int coup){
        if(sort() > coup ){

            return -coup;
        }
        else{

            return -1;
        }
    }
}
