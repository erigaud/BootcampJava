package com.company;

public class Sorcier extends Personnage{
    protected double pouvoir = Math.random();
    public Sorcier(int pdv, String name){
        super(pdv,name);

    }
    public String toString() {
        if (pdv > 0) {
            return ("Je m'appelle " + this.name + " et j'ai " + this.pdv + " points de vie et " +this.pouvoir+" de pouvoir.");
        } else {
            return (this.name + " est mort.");
        }
    }
    public void attaque(Victime p){

        if(!this.mort()){
            int force = (int) Math.round(this.pdv*this.pouvoir);
            System.out.println(this.name +" ("+ this.pdv + " pdv) "+ " attaque " + p.name +" (" +p.getVitalite()+" pdv) avec une force " + force + ".");
            int renvoit = p.subitCharme(force);
            System.out.println(p.name + " renvoit " + renvoit  + " dégats.");

            this.pdv += renvoit;
        }
    }
    public int subitFrappe(int coup){
        this.pdv -= coup;
        if(!this.mort()){
            return (int) -Math.round(this.pdv*this.pouvoir);
        }
        else {
            return 0;
        }

    }
    public int subitCharme(int coup){
        return 0;
    }
    public double getPouvoir(){
        return this.pouvoir;
    }
}