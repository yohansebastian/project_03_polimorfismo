package com.company;

public class Cat extends Animal {
    private String typeHair;

    public Cat(int size) {
        super(size);
    }

    public String getTypeHair() {
        return typeHair;
    }

    public void setTypeHair(String typeHair) {
        this.typeHair = typeHair;
    }
}
