package animals;

public class Lion extends Carnivorous implements Run, Voice {
    @Override
    public String typeAnimals() {
        return "���";
    }

    @Override
    public String run() {
        return "������";
    }

    @Override
    public String voice() {
        return "���";
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

