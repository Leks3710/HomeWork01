import animals.Animals;
import animals.Crocodile;
import animals.Duck;
import animals.Fish;
import animals.GenericClass;
import animals.Hawk;
import animals.Lion;
import animals.Rabbit;
import food.Beef;
import food.Cabbage;
import food.Corn;
import food.Microalgae;
import food.Mutton;
import food.Pork;

import java.io.FileNotFoundException;

public class Zoo<N> {

    public static void main(String[] args) throws FileNotFoundException {

        Crocodile crocodile = new Crocodile();
        Lion lion = new Lion();
        Hawk hawk = new Hawk();
        Rabbit rabbit = new Rabbit();
        Duck duck = new Duck();
        Fish fish = new Fish();
        new Pork();
        Mutton mutton = new Mutton();
        Beef beef = new Beef();
        new Microalgae();
        Cabbage cabbage = new Cabbage();
        Corn corn = new Corn();

        Worker worker = new Worker();
        worker.feed(duck, cabbage);
        worker.feed(hawk, beef);
        worker.feed(lion, corn);
        worker.feed(fish, mutton);
        worker.getVoice(rabbit);
        String[] pond = new String[]{crocodile.swim(), duck.swim(), fish.swim()};

        for (int i = 0; i < pond.length; ++i) {
            System.out.println(pond[i]);
        }

        GenericClass<Animals> genericClass = new GenericClass();

        genericClass.putHerbivoreAvairy(duck);
        genericClass.putHerbivoreAvairy(fish);
        genericClass.putHerbivoreAvairy(rabbit);

        genericClass.removeHerbivoreAvairy(duck);

        System.out.println(genericClass.linkHerbivoreAvairy("Рыба"));

        genericClass.putCarnivorousAvairy(crocodile);
        genericClass.putCarnivorousAvairy(hawk);
        genericClass.putCarnivorousAvairy(lion);

        genericClass.removeCarnivorousAvairy(hawk);

        System.out.println(genericClass.linkCarnivorousAvairy("Крокодил"));

        System.out.println(genericClass.getHerbivoreAvairy());
        System.out.println(genericClass.getCarnivorousAvairy());
    }
}
