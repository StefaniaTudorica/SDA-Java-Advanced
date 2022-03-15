package ro.sda.stefania.encapsulation;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Max", 6, "male", "metis", 6.3);
        System.out.println(dog);

        dog.setAge(7);
        dog.setWeight(8.5);
        System.out.println(dog);

        Dog dog2 = new Dog("female", "bichon");
        System.out.println(dog2);
    }

}
