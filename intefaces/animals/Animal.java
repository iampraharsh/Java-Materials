package intefaces.animals;

public interface Animal {

//    public static final int MAX_AGE = 150;

    int MAX_AGE = 150; //static variable hota hai Interface me

    public abstract void eat();

    void sleep();

    public static void info() {
        System.out.println("This is an Animal interface.");
    } // static will call through interface

    public default void run() {
        this.eat();
        System.out.println("Animal is running");
    } //  concreate methods --> instance me add karana hai without breaking something and me this.eat ko bhi call kara sakta hu default me

    // suppose age ne essa method banata
    // void run();  --> dog and cat me run ka implementation likhni hogi tab ye run method access hoga
}
