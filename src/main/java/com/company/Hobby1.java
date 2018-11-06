package com.company;

public class Hobby1 extends Hobby {
    private int numberOfBalls;

    public Hobby1() {
    }

    public Hobby1(String name) {
        super(name);
    }

    public Hobby1(int hours) {
        super(hours);
    }

    public Hobby1(String name, int hours) {
        super(name, hours);
    }

    public Hobby1(String name, int hours, int numberOfBalls) {
        super(name, hours);
        this.numberOfBalls = numberOfBalls;
    }

    @Override
    public void tellAboutHobby() {
        System.out.println("name = " + name + ", hours = " + hours + ", number of balls = " + numberOfBalls);
    }
}
