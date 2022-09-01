package animal;

public class Jackal extends Wolf {
    public Jackal(String name, int age) {
        super(name, age);
    }

    @Override
    public void voice() {
        System.out.print("Akela missed! Akela missed! ");
        super.voice();
    }
}
