package animals;

public class Rabbit extends Herbivore implements Run, Voice {
    public String typeAnimals() {
        return "������";
    }

    @Override
    public String run() {
        return "������";
    }

    @Override
    public String voice() {
        return "������";
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

