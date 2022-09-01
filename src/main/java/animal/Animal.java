package animal;

import java.util.ArrayList;
import java.util.List;

public abstract class Animal {
    private String name;
    private int age;
    private static List<Animal> animals = new ArrayList<>();

    public Animal (String name, int age) {
        this.name = name;
        this.age = age;
        animals.add(this);
    }

    public abstract void voice();

    public static void makeSomeNoise() {
        animals.forEach(animal -> {
            animal.introduce();
            animal.voice();
        });
    }

    public void introduce() {
        System.out.printf("%-15s %-10s %-3s %-8s %-10s",
                "\n" + this.getClass().getSimpleName(),
                name,
                age,
                "y/o",
                "voice: "
        );
    }
}
