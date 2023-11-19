package food;

public class Beef extends Meet {
    @Override
    public String name() {
        return "говядину";
    }

    @Override
    public int getSatietyHigh() {
        return 5;
    }
}
