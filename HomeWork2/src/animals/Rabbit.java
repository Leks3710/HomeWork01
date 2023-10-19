package animals;

public class Rabbit extends Herbivore implements Run, Voice {
    public String typeAnimals() {
        return "Кролик";
    }

    @Override
    public String run() {
        return "Бегает";
    }

    @Override
    public String voice() {
        return "Кролик";
    }
}
