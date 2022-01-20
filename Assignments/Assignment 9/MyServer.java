import java.io.*;
import java.net.*;
class MyServer{
public static void main(String[] args) throws IOException{
    ServerSocket ss = new ServerSocket(2332);
    Socket socket = ss.accept();
    DataInputStream msg = new DataInputStream(socket.getInputStream());
    String message = (String)msg.readUTF();

    System.out.println("Client is trying to say" +message);
    ss.close();

}
}