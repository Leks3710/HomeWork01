package food;

public class Grass extends Food {
    public String name() {
        return "Растительная пища";
    }

    @Override
    public int getSatietyHigh() {
        return 0;
    }
}

