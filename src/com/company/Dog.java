package com.company;

public class Dog extends Animal {
    private String typeHair;

    public Dog(int size) {
        super(size);
    }

    public String getTypeHair() {
        return typeHair;
    }

    public void setTypeHair(String typeHair) {
        this.typeHair = typeHair;
    }
    public void bite(){
        System.out.println("Mordiendo");
    }

    @Override
    public void makeSoung() {
        System.out.println("Guau");
    }
}
