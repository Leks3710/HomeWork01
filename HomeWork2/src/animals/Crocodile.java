package animals;

public class Crocodile extends Carnivorous implements Swim, Voice {
    @Override
    public String typeAnimals() {
        return "Крокодил";
    }

    @Override
    public String swim() {
        return "Крокодил плавает";
    }

    @Override
    public String voice() {
        return "Крокодил";
    }
}
