package animals;

import food.Food;
import food.Grass;

public class Herbivore extends Animals {
    @Override
    public String typeAnimals() {
        return null;
    }

    @Override
    public int animalSize() {
        return 0;
    }

    @Override
    public void eat(Food food) {
        try{
            if (!(food instanceof Grass)){
                throw new WrongFoodException("Не ест мясо");
            }
            System.out.println("Ест " + food.name());
            this.setSatiety(food.getSatietyHigh());
        } catch (WrongFoodException exception){
            exception.printStackTrace();
        }
    }
}

