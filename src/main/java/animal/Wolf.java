package animal;

public class Wolf extends Animal {
    public Wolf(String name, int age) {
        super(name, age);
    }

    @Override
    public void voice() {
        System.out.print("Woof!");
    }
}
