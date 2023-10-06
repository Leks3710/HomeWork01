package Week1.Model;

import java.util.Objects;

public class Kotik {
    private int satiety;
    private String dinner;
    public static int counter = 0;
    private String name;
    private int age;
    private int weight;
    private String speak;


    public void play(int satiety) {
        if (satiety > 0) {
            System.out.println(getName() + " играет");
        } else {
            System.out.println(getName() + " играть не будет, хочет есть!");
        }
    }

    public void sleep(int satiety) {
        if (satiety > 0) {
            System.out.println(getName() + " спит");
        } else {
            System.out.println(getName() + " спать не будет, хочет есть!");
        }
    }

    public void chaseMouse(int satiety) {
        if (satiety > 0) {
            System.out.println(getName() + " ловит мышь");
        } else {
            System.out.println(getName() + " ловить мышей не будет, хочет есть!");
        }
    }

    public void walk(int satiety) {
        if (satiety > 0) {
            System.out.println(getName() + " гуляет");
        } else {
            System.out.println(getName() + " гулять не будет, хочет есть!");
        }
    }

    public void eat(int satiety) {
        if (satiety < 5) {
            System.out.println(getName() + " ест");
        } else {
            System.out.println(getName() + " не голодный");
        }
    }

    public void eat(int satiety, String dinner) {
        this.satiety = satiety;
        this.dinner = dinner;
    }

    public void eat() {
        eat(satiety, dinner);
    }

    public void liveAnotherDay() {
        for (int i = 1; i <= 24; i++) {
            int choise = (int) (Math.random() * 5) + 1;
            System.out.println(i + "-й час ");
            if (satiety == -1 && choise != 5) {
                choise = 5;
            }
            switch (choise) {
                case (1) -> play(satiety);
                case (2) -> sleep(satiety);
                case (3) -> chaseMouse(satiety);
                case (4) -> walk(satiety);
                case (5) -> eat(satiety);
            }
            if (choise > 0 && choise < 5) {
                satiety--;
            } else {
                satiety++;
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getSpeak() {
        return speak;
    }

    public void setSpeak(String speak) {
        this.speak = speak;
    }

    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public Kotik(int satiety, String name, int age, int weight, String speak) {
        this.satiety = satiety;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.speak = speak;
        counter++;
    }

    public Kotik() {
    }

}