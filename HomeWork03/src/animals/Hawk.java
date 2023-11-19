package animals;

public class Hawk extends Carnivorous implements Fly, Voice {
    @Override
    public String typeAnimals() {
        return "ястреб";
    }

    @Override
    public String fly() {
        return "Ћетает";
    }

    @Override
    public String voice() {
        return "ястреб";
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

