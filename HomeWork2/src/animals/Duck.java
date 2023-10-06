package animals;

public class Duck extends Herbivore implements Swim, Fly, Voice {
    public String typeAnimals() {
        return "Утка";
    }

    @Override
    public String swim() {
        return "Утка плавает";
    }

    @Override
    public String fly() {
        return "Летает";
    }

    @Override
    public String voice() {
        return "Утка";
    }
}
