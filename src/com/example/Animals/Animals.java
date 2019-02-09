package com.example.Animals;

public abstract class Animals {

    private int weight=5;
    private int age=4;
    private String name;

    public Animals() {
    }

    public Animals(int weight, int age, String name) {
        this.weight = weight;
        this.age = age;
        this.name = name;
    }
public Animals(Animals beer){
        this.weight=beer.weight;
        this.age=beer.age;

}
    public void show(){
        System.out.println("Name "+ getName()+ " weight "+ getWeight()+ " age "+getAge());
   }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
 public abstract void vote();
}



