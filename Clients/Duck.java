package Clients;

import java.time.LocalDate;

public class Duck extends Animal{
        public Duck(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    public Duck() {
        super();
    }
    
    @Override
    public void jump() {
        System.out.println(getType() + " can not jump");
    }
}
