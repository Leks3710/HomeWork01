package animals;

public enum AvairySize {
    ONE(10),
    TWO(20),
    THREE(30),
    FOR(40);

    private final int value;

    private AvairySize(int value){this.value = value;}
    public int getValue(){return this.value;}

}

