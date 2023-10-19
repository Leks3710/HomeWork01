package animals;

public class Fish extends Herbivore implements Swim {
    public String typeAnimals() {
        return "Рыба";
    }

    @Override
    public String swim() {
        return "Рыба плавает";
    }
}
