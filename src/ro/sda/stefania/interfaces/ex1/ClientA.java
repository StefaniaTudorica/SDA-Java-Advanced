package ro.sda.stefania.interfaces.ex1;

import java.time.Instant;

public class ClientA implements NofityInterface {

    @Override
    public void notifyClient(Instant currentDateAndTime) {
        System.err.println(currentDateAndTime);
    }
}
