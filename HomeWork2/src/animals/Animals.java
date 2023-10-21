package animals;

import food.Food;


public abstract class Animals {

    private int satiety = 5;

    public abstract String typeAnimals();

    public abstract void eat(Food food);

    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int satietyIncrease) {
        System.out.println("Сытость до еды: " + satiety);
        satiety += satietyIncrease;
        System.out.println("Сытость после еды: " + satiety);
    }
}

