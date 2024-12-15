package server;

import jakarta.xml.ws.Endpoint;
import ws.BankService;

public class Server {
    public static void main(String[] args) {
        Endpoint.publish("http://0.0.0.0:8080/bank", new BankService());
        System.out.println("BankService is published on http://0.0.0.0:8080/bank !");
    }
}
