public class Remote {

    private Command c1;

    private Command c2;

    private Command c3;

    public void press1() {
        buttonWasPressed(1);
        c1.execute();
    }

    public void press2() {
        buttonWasPressed(2);
        c2.execute();
    }

    public void press3() {
        buttonWasPressed(3);
        c3.execute();
    }

    public void setCommand1(Command c) {
        c1 = c;
    }

    public void setCommand2(Command c) {
        c2 = c;
    }

    public void setCommand3(Command c) {
        c3 = c;
    }

    private void buttonWasPressed(int button) {
        System.out.println("Button " + button + " was pressed!");
    }
}
