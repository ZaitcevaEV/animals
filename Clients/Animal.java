package Clients;

import java.time.LocalDate;

public class Animal {
    
    protected String name;

    protected float weight;

    protected LocalDate age;

    protected Owner owner;

    public Animal(String name, float weight, LocalDate age, Owner owner) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.owner = owner;
    }

    public Animal() {
        this("Животное", 10, LocalDate.now(), new Owner());
    }

    private void sleep() {
        System.out.println(getType() + " " + getName() + " sleep");
    }

    private void wakeUp() {
        System.out.println(getType() + " " + getName() + " wake up");
    }

    private void wakeUp(int time) {
        System.out.println(getType() + " " + getName() + " wake up in " + time);
    }

    private void eat() {
        System.out.println(getType() + " " + getName() + " eat");
    }

    private void drink() {
        System.out.println(getType() + " " + getName() + " drink");
    }

    private void play() {
        System.out.println(getType() + " " + getName() + " play");
    }

    public void toGo() {
        System.out.println(getType() + " can to go");
    }

    public void fly() {
        System.out.println(getType() + " can fly");
    }

    public void swim() {
        System.out.println(getType() + " can swim");
    }

    public void jump() {
        System.out.println(getType() + " can jump");
    }

    public void abilities() {
        toGo();
        fly();
        swim();
        jump();
    }

    public void lifeCycle() {
        wakeUp();
        eat();
        drink();
        play();
        sleep();
    }

    public void lifeCycle(int timeWakeUp) {
        wakeUp(timeWakeUp);
        eat();
        drink();
        play();
        sleep();
    }

    public String getType() {
       return getClass().getSimpleName();
    }

    public String getName() {
        return name;
    }

    public float getWeight() {
        return weight;
    }

    public LocalDate getAge() {
        return age;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return String.format("name = %s, weight = %s, age = %s, owner = %s", name, weight, age, owner);
    }
}