import animal.*;

import java.util.Arrays;

public class GflTaskOne {
    public static void main(String[] args) {
        GflTaskOne firstTask = new GflTaskOne();
        firstTask.complete();
    }

    private void complete() {
        System.out.print("""
                -----------------------------------------------------------------------------------
                GFL-Task-1
                ANSWER:
                -----------------------------------------------------------------------------------
                """);

        initialize();
        Animal.makeSomeNoise();

        System.out.println("""
                
                -----------------------------------------------------------------------------------
                """);
    }
    private void initialize() {
        Animal[] animals = {
                new Dog("Bonya", 2),
                new Cat("Dema", 5),
                new AngryDog("Rex", 4),
                new Wolf("Alpha", 8),
                new Jackal("Tabaqui", 5),
                new LegendaryWolf("Akela",17)
                // ....
        };

//        Arrays.stream(animals).forEach(Animal::voice); // completing GflTaskOne by using Animal[] array
    }
}
