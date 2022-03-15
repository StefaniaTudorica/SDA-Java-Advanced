package ro.sda.stefania.exceptions.ex2;

import java.time.Instant;

public class Main {
    public static void main(String[] args) {

        try {
            Person person = new Person("George", "Mihaila", Instant.now().minusSeconds(100));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
