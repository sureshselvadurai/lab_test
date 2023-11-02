package problem2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class GameClient implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("Client: Started...");
            // FILL IN CODE to play the number guessing name with the server

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public static void main(String[] args) {
        GameClient client = new GameClient();
        Thread t1 = new Thread(client);
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            System.out.println("The thread got interrupted " + e);
        }
    }
}
