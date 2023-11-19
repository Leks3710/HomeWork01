package food;

public class Pork extends Meet {
    @Override
    public String name() {
        return "свинину";
    }

    @Override
    public int getSatietyHigh() {
        return 6;
    }
}

