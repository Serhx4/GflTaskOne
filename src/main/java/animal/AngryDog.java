package animal;

public class AngryDog extends Dog {
    public AngryDog(String name, int age) {
        super(name, age);
    }

    @Override
    public void voice() {
        super.voice();
        System.out.print("Argh!");
    }
}
