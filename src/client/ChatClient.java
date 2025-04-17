import java.io.*;
import java.net.*;

public class ChatClient {
    public static void main(String[] args) {
        Socket socket = new Socket("localhost", 5000);
        System.out.println("Connected to server.");
    }
}
