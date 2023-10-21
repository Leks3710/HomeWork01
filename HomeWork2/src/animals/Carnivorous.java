package animals;


import food.Food;
import food.Meet;

public class Carnivorous extends Animals {

    @Override
    public String typeAnimals() {
        return null;
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Meet) {
            System.out.println("Ест " + food.name());
            setSatiety(food.getSatietyHigh());
        } else {
            System.out.println("Не ест траву");
        }
    }
}
