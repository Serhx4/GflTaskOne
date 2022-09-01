package animal;

public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void voice() {
        System.out.print("Bark!");
    }
}
