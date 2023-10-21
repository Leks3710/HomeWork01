package animals;


import food.Food;
import food.Meet;

public class Carnivorous extends Animals {


    @Override
    public String typeAnimals() {
        return null;
    }

    public int animalSize(){return 0;}

    @Override
    public void eat(Food food) {
        try{
            if (!(food instanceof Meet)){
                throw new WrongFoodException("�� ��� �����");
            }
            System.out.println("��� " + food.name());
            this.setSatiety(food.getSatietyHigh());
        } catch (WrongFoodException exception){
            exception.printStackTrace();
        }
    }
}

