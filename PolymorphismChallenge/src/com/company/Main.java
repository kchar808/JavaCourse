package com.company;

public class Main {

    public static void main(String[] args) {
        Vehicle pos = new Vehicle("Tacoma", 6);
        pos.startEngine();

        Toyota offRoad = new Toyota("QuickSand yota", 6);
        offRoad.startEngine();
        offRoad.accelerate();
        offRoad.brake();

        Infiniti q60 = new Infiniti("Q60", 8);
        q60.startEngine();
        q60.accelerate();
        q60.brake();

    }
}

class Vehicle {
    private String name;
    private boolean engine;
    private int cylinder;
    private int wheels;

    public Vehicle(String name, int cylinder) {
        this.name = name;
        this.engine = true;
        this.cylinder = cylinder;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public int getCylinder() {
        return cylinder;
    }

    public void startEngine() {
        System.out.println("Generic vehicle engine start");
    }

    public void accelerate() {
        System.out.println("Generic vehicle accelerating");
    }

    public void brake() {
        System.out.println("Generic vehicle braking");
    }
}

class Toyota extends Vehicle{
    public Toyota(String name, int cylinder) {
        super(name, cylinder);
    }

    @Override
    public void startEngine() {
        System.out.println(getName() + " started up");
    }

    @Override
    public void accelerate() {
        System.out.println(getName() + " accelerating");
    }

    @Override
    public void brake() {
        System.out.println(getName() + " braking");
    }
}

class Infiniti extends Vehicle {
    public Infiniti(String name, int cylinder) {
        super(name, cylinder);
    }

    @Override
    public void startEngine() {
        System.out.println(getName() + " engine started");
    }

    @Override
    public void accelerate() {
        System.out.println(getName() + " accelerating");;
    }

    @Override
    public void brake() {
        System.out.println(getName() + " braking");
    }
}
