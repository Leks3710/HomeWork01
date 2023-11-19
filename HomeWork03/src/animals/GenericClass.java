package animals;

import java.util.HashMap;
import java.util.Map;

public class GenericClass<N> {

    private Map<String, N> carnivorousAvairy = new HashMap<>();
    private Map<String, N> herbivoreAvairy = new HashMap<>();

    AvairySize avairySizeOne;
    AvairySize avairySizeTwo;
    AvairySize avairySizeThree;
    AvairySize avairySizeFor;

    public GenericClass() {
        this.avairySizeOne = AvairySize.ONE;
        this.avairySizeTwo = AvairySize.TWO;
        this.avairySizeThree = AvairySize.THREE;
        this.avairySizeFor = AvairySize.FOR;
    }

    public Map<String, N> getCarnivorousAvairy() {
        return this.carnivorousAvairy;
    }

    public Map<String, N> getHerbivoreAvairy() {
        return this.herbivoreAvairy;
    }

    public void putHerbivoreAvairy(Herbivore animals) {
        if (this.avairySizeOne.getValue() < animals.animalSize() && this.avairySizeTwo.getValue() < animals.animalSize()) {
            System.out.println(animals.typeAnimals() + " не подходит по размеру. В вольер добавлен не будет.");
        } else {
            System.out.println(animals.typeAnimals() + " подходит по размеру");
            this.herbivoreAvairy.put(animals.typeAnimals(), (N) animals);
        }
    }

    public void putCarnivorousAvairy(Carnivorous animals) {
        if (this.avairySizeThree.getValue() < animals.animalSize() && this.avairySizeFor.getValue() < animals.animalSize()) {
            System.out.println(animals.typeAnimals() + " не подходит по размеру. В вольер добавлен не будет.");
        } else {
            System.out.println(animals.typeAnimals() + " подходит по размеру");
            this.carnivorousAvairy.put(animals.typeAnimals(), (N) animals);
        }
    }

    public void removeHerbivoreAvairy(Herbivore animals) {
        this.herbivoreAvairy.remove(animals.typeAnimals());
    }

    public void removeCarnivorousAvairy(Carnivorous animals) {
        this.carnivorousAvairy.remove(animals.typeAnimals());
    }

    public N linkHerbivoreAvairy(String animals) {
        return this.herbivoreAvairy.get(animals);
    }

    public N linkCarnivorousAvairy(String animals) {
        return this.carnivorousAvairy.get(animals);
    }



}



