package ro.sda.stefania.interfaces.ex1;


/**
 * Suppose you have written a time server that periodically notifies its clients of the current date and time. Write an interface the server could use to enforce a particular protocol on its clients.
 */
public class Server {
    private NofityInterface [] clients;

    public Server (NofityInterface[] cliets){
        this.clients = cliets;
    }
    public void nofifyAllClients(){
        for (NofityInterface client: clients){
            nofifyAllClients();
        }
    }
}
