package ru.geekbrains;

public class Main {

    public static void main(String[] args) {

        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Pushok");
        cats[1] = new Cat("Barsik");
        cats[2] = new Cat("Vasya");
        cats[3] = new Cat("Rizhik");
        cats[4] = new Cat("Pushistik");

        Plate plate = new Plate(10);
        for (Cat cat : cats) {
            plate.plateInfo();
            cat.eat(plate);
        }

    }

}
