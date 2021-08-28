package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);
        System.out.println("Elejir del siguiente menú según preferencia");
        System.out.println("1 - Gato - 2 - Perro");
        int size = 0;
        int option = inputData.nextInt();
        switch(option){
            case 1:
                System.out.println("Ingrese el tamaño del Gato");
                 size = inputData.nextInt();
                Cat myCat = new Cat(size);
                System.out.println(myCat.getSize());
                break;
            case 2:
                System.out.println("Ingrese el tamaño del Perro");
                 size = inputData.nextInt();
                Dog myDog = new Dog(size);
                System.out.println(myDog.getSize());
                break;
        }
    }
}
