package org.example;
import java.net.Socket;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a host, exemplo: 127.0.0.1");
        String host = scanner.nextLine();

        for (int port = 1; port <= 65535; port++) {

            final int currentPort = port;

            new Thread(() -> {
                try {
                    Socket socket = new Socket(host, currentPort);
                    System.out.println("Porta aberta: " + currentPort);
                    socket.close();
                } catch (Exception e) {
                }
            }).start();

        }
    }
}
