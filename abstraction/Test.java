package abstraction;

public class Test {

    public static void main(String[] args) {
        Animal dog = new Dog(); // abstract class me reference bhi le sakte hai and ye main parent file me object create nahi create kar sakte hai
        dog.sayHello();
    }
}
