package animals;

public class Hawk extends Carnivorous implements Fly, Voice {
    @Override
    public String typeAnimals() {
        return "������";
    }

    @Override
    public String fly() {
        return "������";
    }

    @Override
    public String voice() {
        return "������";
    }

    @Override
    public int animalSize() {
        return 20;
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

