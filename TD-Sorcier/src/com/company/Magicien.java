package com.company;

import java.util.Random;



public class Magicien extends Sorcier implements SuperPouvoir {
    Random r = new Random() ;

    protected int extra;
    public Magicien(int pdv, String name){
        super(pdv, name);

    }

    public double getPouvoir(){
        return this.pouvoir*this.extra;
    }
    public int subitCharme(int coup){
        this.pdv -= coup;
        if (!this.mort()){
            return (int) -Math.round(coup*sort());
        }
        else {
            return 0;
        }

    }

    public double sort(){
        return(Math.random()*this.getPouvoir());
    }
}
