package com.company;

public abstract class Victime {
    protected String name;
    public Victime(String name){
        this.name = name;
    }
    public abstract int getVitalite();
    public abstract int subitFrappe(int coup);
    public abstract int subitCharme(int coup);
}
