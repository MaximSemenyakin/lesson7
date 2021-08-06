package ru.geekbrains;

import java.util.Scanner;

public class Plate {

    private static Scanner scanner = new Scanner(System.in);

    private int food;
    private boolean isFood = false;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    private int fillFood(int f) {

        System.out.println("Наполните миску едой (объем тарелки от 0 до 100)");
        food = getFoodInPlate(0, 100);
        return food;

    }

    public void plateInfo() {
        System.out.println("В тарелке " + food);
    }

    public void appetiteFood(int a) {
        do {
            if (food >= a) {
                food -= a;
            } else {
                System.out.println("В миске недостаточно еды");
                fillFood(food);
            }
        }while (food < a);
    }

    public static int getFoodInPlate(int min, int max) {
        int i;
        do {
            System.out.println("Наполните миску едой от 0 до 100");
            i = scanner.nextInt();
        } while (i <= 0 || i >= 100);
        return i;
    }
}
