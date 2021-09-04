package com.company;

public class Cow extends Animal {
    private String typeCow;

    public Cow(int size) {
        super(size);
    }

    public String getTypeCow() {
        return typeCow;
    }

    public void setTypeCow(String typeCow) {
        this.typeCow = typeCow;
    }
}
