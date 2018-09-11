package com.company;

public class NainJardin extends Victime{
    protected int solidite;


    public NainJardin(int solidite, String name) {
        super(name);
        this.solidite = solidite;


    }

    public String toString() {

            return ("Je suis " + this.name + " (" + this.solidite + " solidite)");

    }

    public int getVitalite() {
        return this.solidite;
    }

    public int subitFrappe(int coup) {
        int mem = this.solidite;
        if (coup > this.solidite) {
            this.solidite = 0;

            return -mem;
        } else {
            return -coup;
        }
    }
    public int subitCharme(int coup){
        return -1;
    }
}
