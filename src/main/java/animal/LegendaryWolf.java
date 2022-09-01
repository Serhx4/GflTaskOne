package animal;

public class LegendaryWolf extends Wolf {
    public LegendaryWolf(String name, int age) {
        super(name, age);
    }

    @Override
    public void voice() {
        super.voice();
        System.out.print(" I didn't miss!");
    }
}
