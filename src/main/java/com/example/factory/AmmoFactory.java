package com.example.factory;



public class AmmoFactory {

    private static AmmoFactory instance = null;

    private AmmoFactory(){}

    public static synchronized AmmoFactory getInstance(){
        if(AmmoFactory.instance == null){
            AmmoFactory.instance = new AmmoFactory();
        }
        return AmmoFactory.instance;
    }

    public Ammo createAmmo(String calibro, String colour, String rage ){
        Ammo ammo = new Ammo();
        ammo.setCalibro(calibro);
        ammo.setColour(colour);
        ammo.setRage(rage);
        return ammo;
    }

    public Ammo createAmmo(String calibro ){
        Ammo ammo = new Ammo();
        ammo.setCalibro(calibro);
        return ammo;
    }

    public Ammo createAmmo(String calibro, String colour ){
        Ammo ammo = new Ammo();
        ammo.setCalibro(calibro);
        ammo.setColour(colour);
        return ammo;
    }

}
