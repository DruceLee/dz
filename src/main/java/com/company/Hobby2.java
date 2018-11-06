package com.company;

public class Hobby2 extends Hobby {
    private int numberOfFishingRods;

    public Hobby2() {
    }

    public Hobby2(String name) {
        super(name);
    }

    public Hobby2(int hours) {
        super(hours);
    }

    public Hobby2(String name, int hours) {
        super(name, hours);
    }

    public Hobby2(String name, int hours, int numberOfFishingRods) {
        super(name, hours);
        this.numberOfFishingRods = numberOfFishingRods;
    }

    @Override
    public void tellAboutHobby() {
        System.out.println("name = " + name + ", hours = " + hours
                + ", number of fishing rods = " + numberOfFishingRods);
    }
}
