package com.example.Animals;

public class Dog extends Animals {
    private String voteDog;

    public Dog(int weight, int age, String name, String voteDog) {
        super(weight, age, name);
        this.voteDog = voteDog;
    }

    @Override
    public void vote() {
System.out.println( voteDog);
    }
}