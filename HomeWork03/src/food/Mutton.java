package food;

public class Mutton extends Meet {
    @Override
    public String name() {
        return "баранину";
    }

    @Override
    public int getSatietyHigh() {
        return 7;
    }
}

