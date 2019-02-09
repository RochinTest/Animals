package com.example.Animals;

import com.example.Animals.Cat;

public class Kitty extends Cat {

    private int feedTime;

    public Kitty(int weight, int age, int countMause, String name, int feedTime, String voteKitty) {
        super(weight, age, countMause, name, voteKitty);
        this.feedTime = feedTime;
    }

public Kitty(Kitty milc){
        super(milc);
}

    public Kitty() {

    }
    public void show(){
        System.out.println("Name "+ getName()+ " weight "+ getWeight()+ " age "+getAge());
    }
    public void feedingTime(){
        System.out.println("Время кормления котенка Милки " + feedTime);
    }

    public int getFeedTime() {
        return feedTime;
    }

    public void setFeedTime(int feedTime) {
        this.feedTime = feedTime;
    }

    @Override
    public void vote() {
        super.vote();
    }

}