package Clients;

import java.time.LocalDate;

public class Pigeon extends Animal{
        public Pigeon(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    public Pigeon() {
        super();
    }

    @Override
    public void swim() {
        System.out.println(getType() + " can not swim");
    }
    
    @Override
    public void jump() {
        System.out.println(getType() + " can not jump");
    }
}
