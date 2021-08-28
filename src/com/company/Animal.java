package com.company;

public class Animal {
    private String breed;
    private int size;
    private String gender;
    public Animal(int size){
        this.size = size;
    }
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public void makeSoung(){
        System.out.println("Miau");
    }
}
