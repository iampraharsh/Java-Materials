package intefaces;

import intefaces.animals.Animal;
import intefaces.animals.Cat;
import intefaces.animals.Dog;
import intefaces.devices.SmartPhone;

public class Test {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.eat();

        System.out.println(Dog.MAX_AGE); // class reference calling directly

        System.out.println(Animal.MAX_AGE); // parent class reference
        Animal.info();

        //concreate method call

        dog.run();
        cat.run();


        // multiple inheritance


        System.out.println("------------------------------");
        SmartPhone smartPhone = new SmartPhone();
        smartPhone.makeCall("213412312");
        smartPhone.endCall();
        smartPhone.playMusic();
        smartPhone.stopMusic();
        smartPhone.takePhoto();
        smartPhone.recordVideo();
    }

}
