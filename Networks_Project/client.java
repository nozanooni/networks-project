import java.io.*;
import java.net.*;

public class client {
    private Socket socket;
    private PrintWriter out;
    private BufferedReader in;

    public client(String address, int port) {
        try {
            socket = new Socket(address, port);
            out = new PrintWriter(socket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println("Connected to server at " + address + ":" + port);
        } catch (IOException e) {
            System.err.println("Error connecting to server: " + e.getMessage());
        }
    }

    public void sendMessage(String message) {
        out.println(message);
        try {
            String response = in.readLine();
            System.out.println("Server response: " + response);
        } catch (IOException e) {
            System.err.println("Error reading response: " + e.getMessage());
        }
    }

    public void close() {
        try {
            in.close();
            out.close();
            socket.close();
        } catch (IOException e) {
            System.err.println("Error closing resources: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        client client = new client("localhost", 8080); // Connect to server at localhost on port 8080
        client.sendMessage("Hello, Server!");
        client.close();
    }
}
