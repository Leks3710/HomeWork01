package animals;

public class Hawk extends Carnivorous implements Fly, Voice {
    @Override
    public String typeAnimals() {
        return "Ястреб";
    }

    @Override
    public String fly() {
        return "Летает";
    }

    @Override
    public String voice() {
        return "Ястреб";
    }
}
