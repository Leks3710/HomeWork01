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

    @Override
    public int animalSize() {
        return 25;
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

