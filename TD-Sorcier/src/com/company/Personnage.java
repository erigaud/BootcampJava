package com.company;

public abstract class  Personnage extends Victime{
    protected int pdv;

    public Personnage(int pdv, String name) {
        super(name);
        this.pdv = pdv;

    }

    public String toString() {
        if (pdv > 0) {
            return ("Je m'appelle " + this.name + " et j'ai " + this.pdv + " points de vie.");
        } else {
            return (this.name + " est mort.");
        }
    }


    public int getVitalite() {
        return this.pdv;
    }


    public boolean mort() {
        return (this.pdv <= 0);
    }

     public abstract void attaque(Victime p);

}
