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

    @Override
    public int animalSize() {
        return 45;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}

