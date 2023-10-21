package animals;

import food.Food;
import food.Grass;

public class Herbivore extends Animals {
    @Override
    public String typeAnimals() {
        return null;
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Grass) {
            System.out.println("Ест " + food.name());
            setSatiety(food.getSatietyHigh());
        } else {
            System.out.println("Не ест мясо");
        }
    }
}
