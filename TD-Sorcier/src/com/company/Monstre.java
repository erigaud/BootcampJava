package com.company;

public class Monstre extends Personnage{
    public Monstre(int pdv, String name){
        super(pdv,name);

    }
    public void attaque(Victime p){
        if(!this.mort()){
            int force = this.pdv/2;
            System.out.println(this.name +" ("+ this.pdv + " pdv) "+ " attaque " + p.name +" (" +p.getVitalite()+" pdv) avec une force " + force + ".");
            int renvoit = p.subitFrappe(force);
            System.out.println(p.name + " renvoit " + renvoit  + " dégats.");

            this.pdv += renvoit;
        }
    }
    public int subitFrappe(int coup) {
        this.pdv -= coup;
        if (!this.mort()) {
            return -this.pdv / 2;
        } else {
            return 0;
        }
    }


    public int subitCharme(int coup){
        this.pdv -= coup;
        if (!this.mort()){
        return this.pdv/2;
        }
        else {
            return 0;
        }

        }

    }

