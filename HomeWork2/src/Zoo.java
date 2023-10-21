import animals.*;
import food.*;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) throws FileNotFoundException {

        Crocodile crocodile = new Crocodile();
        Lion lion = new Lion();
        Hawk hawk = new Hawk();
        Rabbit rabbit = new Rabbit();
        Duck duck = new Duck();
        Fish fish = new Fish();

        Pork pork = new Pork();
        Mutton mutton = new Mutton();
        Beef beef = new Beef();
        Microalgae microalgae = new Microalgae();
        Cabbage cabbage = new Cabbage();
        Corn corn = new Corn();

        Worker worker = new Worker();
        worker.feed(duck, cabbage);
        worker.feed(hawk, beef);
        worker.feed(lion, corn);
        worker.feed(fish, mutton);
        worker.getVoice(rabbit);

        String[] pond = new String[]{crocodile.swim(), duck.swim(), fish.swim()};
        for (int i = 0; i < pond.length; i++) {
            System.out.println(pond[i]);
        }
    }
}