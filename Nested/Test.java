package Nested;

public class Test {

    public static void main(String[] args) {
        Computer computer = new Computer("Hp", "Abc", "Window");
        computer.getOs().displayInfo();

        Computer.USB usb = new Computer.USB("Type-C");

        Computer.USB usb2 = new Computer.USB("Type-C");
    }
}
