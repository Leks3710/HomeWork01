import animals.Animals;
import animals.Voice;
import food.Food;

import java.io.FileNotFoundException;


public class Worker {
    public void feed(Animals animals, Food food) {
        animals.eat(food);
    }

    public void getVoice(Voice voice) {
        if (voice != null) {
            System.out.println(voice.voice());
        }
    }
}
