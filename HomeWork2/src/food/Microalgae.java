package food;

public class Microalgae extends Grass {
    @Override
    public String name() {
        return "микроводоросли";
    }

    @Override
    public int getSatietyHigh() {
        return 1;
    }
}
