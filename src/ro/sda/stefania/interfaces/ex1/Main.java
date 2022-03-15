package ro.sda.stefania.interfaces.ex1;

public class Main {
    public static void main(String[] args) {

        NofityInterface[] clients = new NofityInterface[4];

        clients[0] = new ClientA();
        clients[1] = new ClientB();
        clients[2] = new ClientA();
        clients[3] = new ClientB();

        Server server = new Server(clients);
        server.nofifyAllClients();
    }
}
