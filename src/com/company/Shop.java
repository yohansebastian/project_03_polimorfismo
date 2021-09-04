package com.company;

import jdk.internal.util.xml.impl.Input;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Shop {
    // ArrayList<tipoDato>
    // ArrayList<Dog> dogDB = new ArrayList<Dog>();
    // Para agregar datos:
    // dogDB.add();
    // Para saber el tamaño es con size
    // dogsDB.size();

    // Atributos
   private Dog[] dogsDB;
   private Cat[] catsDB;
   private ArrayList<Cow> cowsDB;
   private Scanner inputData;
    // Constructor
    public Shop() {
        dogsDB = new Dog[2];
        catsDB = new Cat[2];
        cowsDB = new ArrayList<Cow>();
        inputData = new Scanner(System.in);
    }
    public void registerCows(){
        System.out.println("Ingrese el tamaño de Vaca");
        int size = Integer.parseInt(inputData.nextLine());
        Cow cow = new Cow(size);
        System.out.println("Ingrese el tipo de vaca");
        String typeCow = inputData.nextLine();
        cow.setTypeCow(typeCow);
        cowsDB.add(cow);
    }
    public void listCows(){
        for (int i = 0; i<cowsDB.size();i++){
            System.out.println("Type Cow" + cowsDB.get(i).getTypeCow());
        }
    }
    public void registerDogs(){
        for (int i = 0;i<dogsDB.length;i ++){
            System.out.println("Cual es el tamaño del perro: ");
            int size = Integer.parseInt(inputData.nextLine());
            Dog dog = new Dog(size);
            System.out.println("Cual es la raza del perro: ");
            String breed = inputData.nextLine();
            dog.setBreed(breed);
            System.out.println("Cual es el Tipo de Pelo: ");
            dog.setTypeHair(inputData.nextLine());
            System.out.println("Cual es el género: ");
            dog.setGender(inputData.nextLine());
            dogsDB[i] = dog;
        }
    }
    public void listDogs(){
        for (int i = 0; i<dogsDB.length;i++){
            System.out.println("Size: " +
                    dogsDB[i].getSize() +
                    "Breed: " + dogsDB[i].getBreed() +
                    "TypeHair: "+dogsDB[i].getTypeHair() +
                    "Gender: "+ dogsDB[i].getGender());
        }
    }
    public void registerCats(){
        for (int i = 0;i<catsDB.length;i ++){
            System.out.println("Cual es el tamaño del gato: ");
            int size = Integer.parseInt(inputData.nextLine());
            Cat cat = new Cat(size);
            System.out.println("Cual es la raza del gato: ");
            String breed = inputData.nextLine();
            cat.setBreed(breed);
            System.out.println("Cual es el Tipo de Pelo: ");
            cat.setTypeHair(inputData.nextLine());
            System.out.println("Cual es el género: ");
            cat.setGender(inputData.nextLine());
            catsDB[i] = cat;
        }
    }
    public void listCats(){
        for (int i = 0; i<catsDB.length;i++){
            System.out.println("Size: " +
                    catsDB[i].getSize() +
                    "Breed: " + catsDB[i].getBreed() +
                    "TypeHair: "+catsDB[i].getTypeHair() +
                    "Gender: "+ catsDB[i].getGender());
        }
    }
    public void menu(){
        boolean flag=true;
        while (flag){
            System.out.println("Elejir del siguiente menú según preferencia");
            System.out.println("1 Registrar Gato - 2 - Registrar Perro - 3 - Listar Gatos - 4 - Listar Perros - 5 - registar vaca - 6 - listar vaca - 7 - salir");
            int option = Integer.parseInt(inputData.nextLine());

            switch(option){
                case 1:
                    registerCats();
                    break;
                case 2:
                    registerDogs();
                    break;
                case 3:
                    listCats();
                    break;
                case 4:
                    listDogs();
                    break;
                case 5:
                    registerCows();
                    break;
                case 6:
                    listCows();
                    break;
                case 7:
                    flag = false;
                    break;
            }
        }
    }
}
