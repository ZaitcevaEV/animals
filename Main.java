import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import Clients.Animal;
import Clients.Cat;
import Clients.Duck;
import Clients.Fish;
import Clients.Lion;
import Clients.Owner;
import Clients.Pigeon;
import Clients.Rabbit;

public class Main {
    public static void main(String[] args) {
        Lion lewa = new Lion("Лева", 20, LocalDate.now(), null);
        Cat bosya = new Cat("Босилий", 5, LocalDate.of(2021, 3, 15), new Owner("Ольга"));
        Rabbit kuzya = new Rabbit("Кузя", 7, LocalDate.now(), new Owner("Милана"));
        Pigeon vasya = new Pigeon("Вася", 1, LocalDate.now(), new Owner("Анна"));
        Fish karas = new Fish("Карась", 3, LocalDate.now(), new Owner("Егор"));
        Duck donald = new Duck("Дональд", 8, LocalDate.of(2024, 1, 19), null);

        List<Animal> animals = new ArrayList<>();
        animals.add(lewa);
        animals.add(bosya);
        animals.add(kuzya);
        animals.add(vasya);
        animals.add(karas);
        animals.add(donald);

        System.out.println(animals);
        lewa.abilities();
        bosya.abilities();
        kuzya.abilities();
        vasya.abilities();
        karas.abilities();
        donald.abilities();
    }
}
