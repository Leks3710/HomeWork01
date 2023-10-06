import Week1.Model.Kotik;

import static Week1.Model.Kotik.counter;

public class Application {
    public static void main(String[] args) {


Kotik gena = new Kotik(5,"Гена",2,15,"meow");
        System.out.println("Имя: " + gena.getName() + "\n" +
                "Возраст: " + gena.getAge() + "\n" +
                "Вес: " + gena.getWeight() + "\n"
        );

        Kotik murka = new Kotik();
        murka.setName("Мурка");
        murka.setAge(3);
        murka.setWeight(10);
        murka.setSatiety(7);
        murka.setSpeak("meow");

        gena.liveAnotherDay();

        if (gena.getSpeak().equals(murka.getSpeak())) {
                System.out.println("\nКоты разговаривают одинаково");
        } else {
                System.out.println("\nКоты разговаривают не одинаково");
        }

        System.out.println("\nЧисло котиков: " + counter);

    }

}
