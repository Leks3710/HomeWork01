package animals;

public class Duck extends Herbivore implements Swim, Fly, Voice {
    public String typeAnimals() {
        return "����";
    }


    @Override
    public String swim() {
        return "���� �������";
    }

    @Override
    public String fly() {
        return "������";
    }

    @Override
    public String voice() {
        return "����";
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int animalSize() {
        return 10;
    }
}

