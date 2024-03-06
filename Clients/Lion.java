package Clients;

import java.time.LocalDate;

public class Lion extends Animal{

    public Lion(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    public Lion() {
        super();
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
