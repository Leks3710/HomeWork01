package food;

public class Corn extends Grass {
    @Override
    public String name() {
        return "кукурузу";
    }

    @Override
    public int getSatietyHigh() {
        return 2;
    }
}

