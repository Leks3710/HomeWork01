package animals;

public class Duck extends Herbivore implements Swim, Fly, Voice {
    public String typeAnimals() {
        return "Утка";
    }


    @Override
    public String swim() {
        return "Утка плавает";
    }

    @Override
    public String fly() {
        return "Летает";
    }

    @Override
    public String voice() {
        return "Утка";
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

