package animals;

public class Fish extends Herbivore implements Swim {
    public String typeAnimals() {
        return "����";
    }

    @Override
    public String swim() {
        return "���� �������";
    }

    @Override
    public int animalSize() {
        return 5;
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
