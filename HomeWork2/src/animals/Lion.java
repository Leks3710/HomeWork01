package animals;

public class Lion extends Carnivorous implements Run, Voice {
    @Override
    public String typeAnimals() {
        return "Лев";
    }

    @Override
    public String run() {
        return "Бегает";
    }

    @Override
    public String voice() {
        return "Лев";
    }
}
