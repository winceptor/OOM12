public class CatCommand implements Command {

    private Cat cat;

    public CatCommand(Cat c) {
        cat = c;
    }

    public void execute() {
        cat.activate();
    }
}
