package Nested;

public class Computer {

    private String brand;
    private String model;
    private OperatingSystem os;

    //nested class
    //computer ke ceezhe ek sath karne ke liye static laga diya --> memory management ke liye karte hai
    static class USB {

        private String type;

        public USB(String type) {
            this.type = type;
        }

        public void displayInfo() {
            System.out.println("USB Type: " + type);
        }
    }


    public Computer(String brand, String model, String osName) {
        this.brand = brand;
        this.model = model;
        this.os = new OperatingSystem(osName);

    }

    public OperatingSystem getOs() {
        return os;
    }

    class OperatingSystem {
        private String osName;

        public OperatingSystem(String osName) {
            this.osName = osName;
        }

        public void displayInfo() {
            System.out.println("computer model: " + model + ", os: " + osName);
        }

    }
}
