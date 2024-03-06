package Clients;

import java.time.LocalDate;

public class Fish extends Animal{
        public Fish(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    public Fish() {
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

}
