public class Mainclass {

    public static void main(String[] args) {
        Cat cat = new Cat();
        Light light = new Light();
        GarageDoor door = new GarageDoor();
        
        Command activate_cat = new CatCommand(cat);
        Command light_on = new LightOnCommand(light);
        Command open_door = new GarageDoorCommand(door);
        
        Remote remote = new Remote();
        remote.setCommand1(activate_cat);
        remote.setCommand2(light_on);
        remote.setCommand3(open_door);
        
        remote.press1();
        remote.press2();
        remote.press3();
    }
}
