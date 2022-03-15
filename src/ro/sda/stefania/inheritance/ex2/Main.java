package ro.sda.stefania.inheritance.ex2;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Cat(5, 7);
        Animal animal2 = new Dog(4, 14);
        animal1.yieldVoice();
        animal2.yieldVoice();
    }
}
