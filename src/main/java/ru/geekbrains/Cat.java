package ru.geekbrains;

import java.util.Random;

public class Cat {

    Random random = new Random();

    private String name;
    private boolean satiety = false;
    private int appetite = random.nextInt(10);


    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public Cat(String name) {
        this.name = name;
    }

    //region1 Геттеры и сеттеры
    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }
    //endregion

    public Cat(Random random, String name, boolean satiety, int appetite) {
        this.random = random;
        this.name = name;
        this.satiety = satiety;
        this.appetite = appetite;
    }

    public void eat(Plate p) {

        p.appetiteFood(appetite);
        if (appetite <= p.getFood()) {
            satiety = true;
            System.out.println("Кот " + name + " наелся");
        }

    }
}
