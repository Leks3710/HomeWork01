package food;

public class Meet extends Food {
    public String name() {
        return "Мясная пища";
    }

    @Override
    public int getSatietyHigh() {
        return 0;
    }
}


