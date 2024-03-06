package Clients;

import java.time.LocalDate;

public class Rabbit extends Animal{
        public Rabbit(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    public Rabbit() {
        super();
    }

    @Override
    public void toGo() {
        System.out.println(getType() + " can not to go");
    }

    @Override
    public void fly() {
        System.out.println(getType() + " can not fly");
    }

    @Override
    public void swim() {
        System.out.println(getType() + " can not swim");
    }

}
