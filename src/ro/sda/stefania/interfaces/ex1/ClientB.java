package ro.sda.stefania.interfaces.ex1;

import java.time.Instant;

public class ClientB implements NofityInterface{

    @Override
    public void notifyClient(Instant currentDateAndTime) {
        System.err.println(currentDateAndTime);
    }
}
