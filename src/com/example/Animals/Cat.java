package com.example.Animals;

import java.util.Scanner;

public class Cat extends Animals {
private String voteCat;
public String i;
    private int countMause;

    public Cat(int weight, int age,int countMause, String name, String voteCat) {
        super(weight, age, name);
        this.countMause = countMause;
        this.voteCat=voteCat;
    }

    public Cat() {

    }

    public Cat(Cat mouse) {
        super(mouse);
    }

    public String getVoteCat() {
        return voteCat;
    }

    public int getCountMause() {
        return countMause;
    }

    public void setCountMause(int countMause) {
        this.countMause = countMause;
    }

    private void rodent() {
        System.out.println("Введите количество мышей ");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            countMause = sc.nextInt();

            System.out.println("Барсик поймал " + countMause + " мышей");
        }
    }
    public void show(){
        System.out.println("Name "+ getName()+ " weight "+ getWeight()+ " age "+getAge());
    }
    public static void main(String[] args) {
Dog sharik = new Dog(50, 5, "Шарик", " Гав Гав");
        Cat barsic = new Cat(12,3,5, " Барсик", " Мяу Мяу");
        Kitty milky = new Kitty(1,1,6,"Милки",2, " Мяяяуууу");
        milky.feedingTime();
        milky.show();
        milky.vote();
        barsic.show();
        barsic.rodent();
        barsic.vote();
        sharik.show();
        sharik.vote();



    }
 public void vote() {
     System.out.println( voteCat);

 }


}
