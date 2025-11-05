public class Car {

    //Properties
    private String color;
    private String brand;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    private String model;
    private int year;
    private int speed;


    //Behaviours --> create methods

    public void accelerate(int increment) {
        speed += increment;
    }


    public void brake(int decrement) {
        speed -= decrement;
        if (speed < 0) {
            speed = 0;
        }
    }
}
